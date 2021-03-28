package TodayTaro;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;

public class ChooseMenu extends JFrame {

	public ChooseMenu(String uname) {
		super("TodayTaro");

		JPanel Jp1 = new JPanel();// �̹��� ���� ���

		// ��ư�� �̹��� �ֱ�
		JButton Jb1 = new JButton(new ImageIcon(
				HowTo.class.getResource("../img/Today.png")));
		Jb1.setBorderPainted(false);
		Jb1.setContentAreaFilled(false);
		Jb1.setFocusPainted(false);
		Jb1.setBounds(65, 330, 290, 140);// ��ġ����

		JButton Jb2 = new JButton(new ImageIcon(
				HowTo.class.getResource("../img/Love.png")));
		Jb2.setBorderPainted(false);
		Jb2.setContentAreaFilled(false);
		Jb2.setFocusPainted(false);
		Jb2.setBounds(310, 330, 290, 140);// ��ġ����

		JButton Jb3 = new JButton(new ImageIcon(
				HowTo.class.getResource("../img/HowTo.png")));
		Jb3.setBorderPainted(false);
		Jb3.setContentAreaFilled(false);
		Jb3.setFocusPainted(false);
		Jb3.setBounds(570, 330, 290, 140);// ��ġ����

		// ����̹���
		JLabel l1 = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource(
				"../img/MenuScreen.png")).getImage();
		Image img1 = img.getScaledInstance(900, 600,
				java.awt.Image.SCALE_SMOOTH); // img1�� img�� ����
		l1.setIcon(new ImageIcon(img1));// l1�� img1�� ����

		add(Jp1);
		Jp1.add(l1);
		l1.add(Jb1);
		l1.add(Jb2);
		l1.add(Jb3);

		setSize(900, 650);// ó�� â ũ��
		setLocation(500, 100);
		setVisible(true);
		setLayout(null);

		Jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jb1.setVisible(false);
				TodayTaro ht = new TodayTaro(uname);
				ht.setVisible(true);
				setVisible(false);
			}
		});

		Jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jb2.setVisible(false);
				LoveTaro ht = new LoveTaro(uname);
				ht.setVisible(true);
				setVisible(false);
			}
		});

		Jb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jb3.setVisible(false);
				HowTo ht = new HowTo(uname);
				ht.setVisible(true);
				setVisible(false);
			}
		});

	}

	public static void main(String[] args) throws IOException {
		String uname = null;
		new ChooseMenu(uname);
	}
}