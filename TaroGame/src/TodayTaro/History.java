package TodayTaro;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

public class History extends JFrame {

	public History(String uname) {
		super("TodayTaro");

		JPanel jp = new JPanel();

		// ����̹���
		JLabel l1 = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource(
				"../img/Historyscreen.png")).getImage();
		Image img1 = img.getScaledInstance(900, 600,
				java.awt.Image.SCALE_SMOOTH); // img1�� img�� ����
		l1.setIcon(new ImageIcon(img1));// l1�� img1�� ����

		JButton Jb1 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/backbt.png")));
		Jb1.setBorderPainted(false);
		Jb1.setContentAreaFilled(false);
		Jb1.setFocusPainted(false);
		Jb1.setBounds(690, 500, 290, 140);// ��ġ����

		// ù��° ���
		JLabel jl1 = new JLabel();
		JLabel jl1_2 = new JLabel();
		JLabel jl1_3 = new JLabel();
		List RList = new List();

		// �ι�° ���
		JLabel jl2 = new JLabel();
		JLabel jl2_2 = new JLabel();
		JLabel jl2_3 = new JLabel();
		List RList2 = new List();

		// ����° ���
		JLabel jl3 = new JLabel();
		JLabel jl3_2 = new JLabel();
		JLabel jl3_3 = new JLabel();
		List RList3 = new List();

		try {
			Connection con = null;
			con = DriverManager.getConnection("jdbc:mysql://localhost:1228",
					"root", "1234");

			// Statement�� ���� SQL���� �����ϰ� ����� ��ȯ�ޱ� ���� ��ü��.
			// Statement�ϳ��� �Ѱ��� ResultSet ��ü���� �� �� �ִ�.
			java.sql.Statement st = null;
			java.sql.Statement st2 = null;
			java.sql.Statement st3 = null;
			ResultSet result = null; //DB�� �÷� ������� ������
			ResultSet result2 = null;
			ResultSet result3 = null;
			st = con.createStatement();
			st2 = con.createStatement();
			st3 = con.createStatement();
			st.execute("use tarro;"); // ����� DB�� �����Ѵ�.
			st2.execute("use tarro;"); // ����� DB�� �����Ѵ�.
			st3.execute("use tarro;"); // ����� DB�� �����Ѵ�.

			result = st.executeQuery("select * from " + uname + " where id =1");
			result2 = st2.executeQuery("select * from " + uname + " where id =2");
			result3 = st3.executeQuery("select * from " + uname + " where id =3");

			// ù��° ���
			while (result.next()) { // �������� �ִ��� Ȯ��
				String str1 = result.getString(1); //id
				String str1_1 = result.getString(2); //��̸�
				String str1_2 = result.getString(3); //���
				String str1_3 = result.getString(4); //��¥

				// ���ͳ����� �ɰ���
				String splitStrArr[] = str1_2.split("\n");
				for (int i = 0; i < splitStrArr.length; i++) {
					RList.add(splitStrArr[i]);
				}
				// ù��° ���
				jl1 = new JLabel(str1); // ����Ʈ�� �����͸� �߰��Ѵ�.
				jl1_2 = new JLabel(str1_1);
				jl1_3 = new JLabel(str1_3);
				jl1.setForeground(Color.white); // ��Ʈ��
				jl1.setFont(new Font("210 �λ絿��Ÿ� B", Font.BOLD, 20));
				jl1_2.setFont(new Font("210 �λ絿��Ÿ� B", Font.BOLD, 20));
				jl1_3.setFont(new Font("210 �λ絿��Ÿ� B", Font.BOLD, 20));
				RList.setFont(new Font("210 �λ絿��Ÿ� B", Font.BOLD, 12));
				jl1.setBounds(200, 230, 100, 50);
				jl1_2.setBounds(270, 230, 100, 50);
				jl1_3.setBounds(370, 230, 120, 50);
				RList.setBounds(530, 230, 200, 80);

			}

			// �ι�° ���
			while (result2.next()) { // �������� �ִ��� Ȯ��
				String str2 = result2.getString(1);
				String str2_1 = result2.getString(2);
				String str2_2 = result2.getString(3);
				String str2_3 = result2.getString(4);

				// ���ͳ����� �ɰ���
				String splitStrArr2[] = str2_2.split("\n");

				for (int i = 0; i < splitStrArr2.length; i++) {
					RList2.add(splitStrArr2[i]);
				}

				// �ι�° ���
				jl2 = new JLabel(str2); // ����Ʈ�� �����͸� �߰��Ѵ�.
				jl2_2 = new JLabel(str2_1);
				jl2_3 = new JLabel(str2_3);
				jl2.setForeground(Color.white); // ��Ʈ��
				jl2.setFont(new Font("210 �λ絿��Ÿ� B", Font.BOLD, 20));
				jl2_2.setFont(new Font("210 �λ絿��Ÿ� B", Font.BOLD, 20));
				jl2_3.setFont(new Font("210 �λ絿��Ÿ� B", Font.BOLD, 20));
				RList2.setFont(new Font("210 �λ絿��Ÿ� B", Font.BOLD, 12));
				jl2.setBounds(200, 330, 100, 50);
				jl2_2.setBounds(270, 330, 100, 50);
				jl2_3.setBounds(370, 330, 120, 50);
				RList2.setBounds(530, 330, 200, 80);

			}

			// ����° ���
			while (result3.next()) { // �������� �ִ��� Ȯ��
				String str3 = result3.getString(1);
				String str3_1 = result3.getString(2);
				String str3_2 = result3.getString(3);
				String str3_3 = result3.getString(4);

				// ���ͳ����� �ɰ���
				String splitStrArr3[] = str3_2.split("\n");

				for (int i = 0; i < splitStrArr3.length; i++) {
					RList3.add(splitStrArr3[i]);
				}
				// ����° ���
				jl3 = new JLabel(str3); // ����Ʈ�� �����͸� �߰��Ѵ�.
				jl3_2 = new JLabel(str3_1);
				jl3_3 = new JLabel(str3_3);
				jl3.setForeground(Color.white); // ��Ʈ��
				jl3.setFont(new Font("210 �λ絿��Ÿ� B", Font.BOLD, 20));
				jl3_2.setFont(new Font("210 �λ絿��Ÿ� B", Font.BOLD, 20));
				jl3_3.setFont(new Font("210 �λ絿��Ÿ� B", Font.BOLD, 20));
				RList3.setFont(new Font("210 �λ絿��Ÿ� B", Font.BOLD, 12));
				jl3.setBounds(200, 430, 100, 50);
				jl3_2.setBounds(270, 430, 100, 50);
				jl3_3.setBounds(370, 430, 120, 50);
				RList3.setBounds(530, 430, 200, 80);
			}

		} catch (SQLException sqle) {
			System.out.println("SQLException: " + sqle.getMessage());
			System.out.println("SQLState: " + sqle.getSQLState());
		}

		add(jp);
		jp.add(l1);
		l1.add(Jb1);
		// ù��°���
		l1.add(jl1);
		l1.add(jl1_2);
		l1.add(jl1_3);
		l1.add(RList);

		// �ι�°���
		l1.add(jl2);
		l1.add(jl2_2);
		l1.add(jl2_3);
		l1.add(RList2);

		// ����°���
		l1.add(jl3);
		l1.add(jl3_2);
		l1.add(jl3_3);
		l1.add(RList3);

		Jb1.setToolTipText("Ȩ���� ���ư���"); // ��ư�� �÷������� ������
		Jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jb1.setVisible(false);
				Main ht = new Main();
				ht.setVisible(true);
				setVisible(false);
			}
		});
		
		setSize(900, 650);// ó�� â ũ��
		setLocation(500, 100);
		setVisible(true);
		setLayout(null);

		
	}

	public static void main(String[] args) throws IOException {
		String uname = null;
		new History(uname);
	}
}