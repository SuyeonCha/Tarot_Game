package TodayTaro;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NameInput extends JFrame {
	public NameInput() {
		super("TodayTaro");
		
		JPanel Jp1 = new JPanel();// �̹��� ���� ���
		JButton Jb1 = new JButton(new ImageIcon(
			Main.class.getResource("../img/NewPpbt.png")));
		Jb1.setBorderPainted(false);
		Jb1.setContentAreaFilled(false);
		Jb1.setFocusPainted(false);
		Jb1.setBounds(180, 330, 290, 140);// ��ġ����

		JButton Jb2 = new JButton(new ImageIcon(
				HowTo.class.getResource("../img/loginBt.png")));
		Jb2.setBorderPainted(false);
		Jb2.setContentAreaFilled(false);
		Jb2.setFocusPainted(false);
		Jb2.setBounds(460, 330, 290, 140);// ��ġ����

		// ����̹���
		JLabel l1 = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource(
				"../img/loginscreen.png")).getImage();
		Image img1 = img.getScaledInstance(900, 600,
				java.awt.Image.SCALE_SMOOTH); // img1�� img�� ����
		l1.setIcon(new ImageIcon(img1));// l1�� img1�� ����
		
		JTextField Jt1 = new JTextField(10);
		//Jt1.setText("�Է��ϼ���");
		Jt1.setOpaque(false); //�����ϰ�
		Jt1.setFont(new Font("210 �λ絿��Ÿ� B", Font.BOLD, 40));

		Jt1.setBounds(360, 250, 290, 70);// ��ġ����
		
		
		add(Jp1);
		Jp1.add(l1);
		l1.add(Jb1);
		l1.add(Jb2);
		l1.add(Jt1);

		setSize(900, 650);// ó�� â ũ��
		setLocation(500, 100);
		setVisible(true);
		setLayout(null);
		
		
		Jb1.setToolTipText("���ο��� �մ�"); // ��ư�� �÷������� ������
		Jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jb1.setVisible(false);
				JoinTaro ht = new JoinTaro();
				ht.setVisible(true);
				setVisible(false);
			}
		});
		Jb2.setToolTipText("�� ���̱���"); // ��ư�� �÷������� ������

		 
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
        	NameInput.showInfoBox("�̸��� �Է����ּ���.", "Title");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NameInput();
	}
}
