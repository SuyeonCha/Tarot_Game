package TodayTaro;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JoinTaro extends JFrame {
	
	
	public JoinTaro() {
		super("TodayTaro");

		JPanel Jp1 = new JPanel();// �̹��� ���� �г�

		JButton Jb1 = new JButton(new ImageIcon(
				HowTo.class.getResource("../img/JoinBt.png")));
		Jb1.setBorderPainted(false);
		Jb1.setContentAreaFilled(false);
		Jb1.setFocusPainted(false);
		Jb1.setBounds(330, 330, 290, 140);// ��ġ����

		// ����̹���
		JLabel l1 = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource(
				"../img/LoginScreen.png")).getImage();
		Image img1 = img.getScaledInstance(900, 600,
				java.awt.Image.SCALE_SMOOTH); // img1�� img�� ����
		l1.setIcon(new ImageIcon(img1));// l1�� img1�� ����

		JTextField Jt1 = new JTextField();
		Jt1.setOpaque(false); //�����ϰ�
		Jt1.setFont(new Font("210 �λ絿��Ÿ� B", Font.BOLD, 40));
		Jt1.setBounds(360, 250, 290, 70);// ��ġ����
		
		add(Jp1);
		Jp1.add(l1);
		l1.add(Jb1);
		l1.add(Jt1);
		
		setSize(900, 650);// ó�� â ũ��
		setLocation(500, 100);
		setVisible(true);
		setLayout(null);
		Jb1.setToolTipText("�̸��� �ߺ��� â�� �� �Ѿ�ϴ�"); // ��ư�� �÷������� ������
		Jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String uname = Jt1.getText();
				String str = "";
				try {
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:1228","root", "1234");

					// Statement�� ���� SQL���� �����ϰ� ����� ��ȯ�ޱ� ���� ��ü��.
					// Statement�ϳ��� �Ѱ��� ResultSet ��ü���� �� �� �ִ�.
					Statement stmt = con.createStatement();
					Statement stmt2 = con.createStatement();
					stmt.execute("use tarro;");
					stmt2.execute("use tarro;");
					
					ResultSet result = stmt2.executeQuery("show tables like '"+uname+"'");
					while (result.next()) { // �������� �ִ��� Ȯ��
						str = result.getString(1);
					}
					
					
					if(!(uname.equals(str))){
					String sql = "create table "+uname+ "("
							+ "id int(3) not null auto_increment,"
							+ "name varchar(20),"
							+ "contant text,"
							+ "today date,"
							+ "primary key(id))";
					
					stmt.executeUpdate(sql);
					
					Jb1.setVisible(false);
					ChooseMenu ht = new ChooseMenu(uname);
					ht.setVisible(true);
					setVisible(false);
					}
					else if(uname.equals(str)){
						System.out.println("�����ߺ�");
					}
					
					
				} catch (SQLException sqle) {
					System.out.println("SQLException: " + sqle.getMessage());
					System.out.println("SQLState: " + sqle.getSQLState());
				}
			}
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JoinTaro();
	}

}
