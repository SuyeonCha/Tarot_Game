package TodayTaro;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

public class HowTo extends JFrame {
	
	public HowTo(String uname) {
		super("TodayTaro");
		
		JPanel Jp1=new JPanel();//이미지 넣을 페널
		
		//버튼에 이미지 넣기
		JButton Jb1 = new JButton(new ImageIcon(HowTo.class.getResource("../img/backbt.png")));
		Jb1.setBorderPainted(false);
		Jb1.setContentAreaFilled(false);
		Jb1.setFocusPainted(false);	
		Jb1.setBounds(340,390,290,140);//위치조정

		//배경이미지
		JLabel l1 =new JLabel();
    	Image img = new ImageIcon(this.getClass().getResource("../img/howtoscreen.png")).getImage();
    	Image img1=img.getScaledInstance(900,600, java.awt.Image.SCALE_SMOOTH);	//img1에 img를 넣음
    	l1.setIcon(new ImageIcon(img1));//l1에 img1을 넣음
				
    	add(Jp1);
    	Jp1.add(l1);
    	l1.add(Jb1);
    	//l1.add(Jb1);
    	
        setSize(900,650);//처음 창 크기
        setLocation(500, 100);
    	setVisible(true);
		setLayout(null);
		
		Jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Jb1.setVisible(false);
            	ChooseMenu ht = new ChooseMenu(uname);
            			ht.setVisible(true);
            			setVisible(false);
            }
		});
		
	}
	public static void main(String[] args) throws IOException {
		String uname = null;
		new HowTo(uname);
	}
}