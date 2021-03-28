package TodayTaro;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("TodayTaro");
		
		//������ �����Ű�� �κ�
		Music introMusic=new Music("javabackgroundmusic.mp3",true);
		introMusic.start();
		
		//��ư�� �̹��� �ֱ�
		JPanel jp = new JPanel();
		JButton Jb1 = new JButton(new ImageIcon(Main.class.getResource("../img/startbt.png")));
		Jb1.setBorderPainted(false);
		Jb1.setContentAreaFilled(false);
		Jb1.setFocusPainted(false);	
		Jb1.setBounds(320,300,290,140);//��ġ����

		//����̹���
		JLabel l1 =new JLabel();
    	Image img = new ImageIcon(this.getClass().getResource("../img/main.png")).getImage();
    	Image img1=img.getScaledInstance(900,600, java.awt.Image.SCALE_SMOOTH);	//img1�� img�� ����
    	l1.setIcon(new ImageIcon(img1));//l1�� img1�� ����
			
    	//add(Jp2);//��游 ����
    	add(jp);
    	jp.add(l1);
    	l1.add(Jb1);
    	
        setSize(900,650);//ó�� â ũ��
        setLocation(500, 100);
    	setVisible(true);
		setLayout(null);
		
		Jb1.setToolTipText("������ Ŭ���ϼ���"); // ��ư�� �÷������� ������
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