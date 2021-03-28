package TodayTaro;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NameInput extends JFrame {
	public NameInput() {
		super("TodayTaro");
		
		JPanel Jp1 = new JPanel();// 이미지 넣을 페널
		JButton Jb1 = new JButton(new ImageIcon(
			Main.class.getResource("../img/NewPpbt.png")));
		Jb1.setBorderPainted(false);
		Jb1.setContentAreaFilled(false);
		Jb1.setFocusPainted(false);
		Jb1.setBounds(180, 330, 290, 140);// 위치조정

		JButton Jb2 = new JButton(new ImageIcon(
				HowTo.class.getResource("../img/loginBt.png")));
		Jb2.setBorderPainted(false);
		Jb2.setContentAreaFilled(false);
		Jb2.setFocusPainted(false);
		Jb2.setBounds(460, 330, 290, 140);// 위치조정

		// 배경이미지
		JLabel l1 = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource(
				"../img/loginscreen.png")).getImage();
		Image img1 = img.getScaledInstance(900, 600,
				java.awt.Image.SCALE_SMOOTH); // img1에 img를 넣음
		l1.setIcon(new ImageIcon(img1));// l1에 img1을 넣음
		
		JTextField Jt1 = new JTextField(10);
		//Jt1.setText("입력하세요");
		Jt1.setOpaque(false); //투명하게
		Jt1.setFont(new Font("210 인사동사거리 B", Font.BOLD, 40));

		Jt1.setBounds(360, 250, 290, 70);// 위치조정
		
		
		add(Jp1);
		Jp1.add(l1);
		l1.add(Jb1);
		l1.add(Jb2);
		l1.add(Jt1);

		setSize(900, 650);// 처음 창 크기
		setLocation(500, 100);
		setVisible(true);
		setLayout(null);
		
		
		Jb1.setToolTipText("새로오신 손님"); // 버튼에 올려놓으면 툴나옴
		Jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jb1.setVisible(false);
				JoinTaro ht = new JoinTaro();
				ht.setVisible(true);
				setVisible(false);
			}
		});
		Jb2.setToolTipText("또 오셨군요"); // 버튼에 올려놓으면 툴나옴

		 
		Jb2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String uname = Jt1.getText();
				
				if(uname.equals("")){
					Jb2.addActionListener(new AlertActionListener());
				}
				else{
				Jb2.setVisible(false);
				ChooseMenu ht = new ChooseMenu(uname);
				ht.setVisible(true);
				setVisible(false);
				}
			}
		});
	}
	public static void showInfoBox(String msg, String title) {
        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
    }
	class AlertActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        	NameInput.showInfoBox("이름을 입력해주세요.", "Title");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NameInput();
	}
}
