package TodayTaro;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("TodayTaro");
		
		//음악을 실행시키는 부분
		Music introMusic=new Music("javabackgroundmusic.mp3",true);
		introMusic.start();
		
		//버튼에 이미지 넣기
		JPanel jp = new JPanel();
		JButton Jb1 = new JButton(new ImageIcon(Main.class.getResource("../img/startbt.png")));
		Jb1.setBorderPainted(false);
		Jb1.setContentAreaFilled(false);
		Jb1.setFocusPainted(false);	
		Jb1.setBounds(320,300,290,140);//위치조정

		//배경이미지
		JLabel l1 =new JLabel();
    	Image img = new ImageIcon(this.getClass().getResource("../img/main.png")).getImage();
    	Image img1=img.getScaledInstance(900,600, java.awt.Image.SCALE_SMOOTH);	//img1에 img를 넣음
    	l1.setIcon(new ImageIcon(img1));//l1에 img1을 넣음
			
    	//add(Jp2);//배경만 나옴
    	add(jp);
    	jp.add(l1);
    	l1.add(Jb1);
    	
        setSize(900,650);//처음 창 크기
        setLocation(500, 100);
    	setVisible(true);
		setLayout(null);
		
		Jb1.setToolTipText("시작을 클릭하세요"); // 버튼에 올려놓으면 툴나옴
		Jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Jb1.setVisible(false);
            	NameInput ht = new NameInput();
            			ht.setVisible(true);
            			setVisible(false);
            }
		});
	}
	public static void main(String[] args) throws IOException {
		new Main();
	}
}