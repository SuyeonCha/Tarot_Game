package TodayTaro;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

public class HowTo extends JFrame {
	
	public HowTo(String uname) {
		super("TodayTaro");
		
		JPanel Jp1=new JPanel();//�̹��� ���� ���
		
		//��ư�� �̹��� �ֱ�
		JButton Jb1 = new JButton(new ImageIcon(HowTo.class.getResource("../img/backbt.png")));
		Jb1.setBorderPainted(false);
		Jb1.setContentAreaFilled(false);
		Jb1.setFocusPainted(false);	
		Jb1.setBounds(340,390,290,140);//��ġ����

		//����̹���
		JLabel l1 =new JLabel();
    	Image img = new ImageIcon(this.getClass().getResource("../img/howtoscreen.png")).getImage();
    	Image img1=img.getScaledInstance(900,600, java.awt.Image.SCALE_SMOOTH);	//img1�� img�� ����
    	l1.setIcon(new ImageIcon(img1));//l1�� img1�� ����
				
    	add(Jp1);
    	Jp1.add(l1);
    	l1.add(Jb1);
    	//l1.add(Jb1);
    	
        setSize(900,650);//ó�� â ũ��
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