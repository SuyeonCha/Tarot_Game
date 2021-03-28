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

		JPanel Jp1 = new JPanel();// 이미지 넣을 패널

		JButton Jb1 = new JButton(new ImageIcon(
				HowTo.class.getResource("../img/JoinBt.png")));
		Jb1.setBorderPainted(false);
		Jb1.setContentAreaFilled(false);
		Jb1.setFocusPainted(false);
		Jb1.setBounds(330, 330, 290, 140);// 위치조정

		// 배경이미지
		JLabel l1 = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource(
				"../img/LoginScreen.png")).getImage();
		Image img1 = img.getScaledInstance(900, 600,
				java.awt.Image.SCALE_SMOOTH); // img1에 img를 넣음
		l1.setIcon(new ImageIcon(img1));// l1에 img1을 넣음

		JTextField Jt1 = new JTextField();
		Jt1.setOpaque(false); //투명하게
		Jt1.setFont(new Font("210 인사동사거리 B", Font.BOLD, 40));
		Jt1.setBounds(360, 250, 290, 70);// 위치조정
		
		add(Jp1);
		Jp1.add(l1);
		l1.add(Jb1);
		l1.add(Jt1);
		
		setSize(900, 650);// 처음 창 크기
		setLocation(500, 100);
		setVisible(true);
		setLayout(null);
		Jb1.setToolTipText("이름이 중복시 창은 안 넘어갑니다"); // 버튼에 올려놓으면 툴나옴
		Jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String uname = Jt1.getText();
				String str = "";
				try {
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:1228","root", "1234");

					// Statement는 정적 SQL문을 실행하고 결과를 반환받기 위한 객체다.
					// Statement하나당 한개의 ResultSet 객체만을 열 수 있다.
					Statement stmt = con.createStatement();
					Statement stmt2 = con.createStatement();
					stmt.execute("use tarro;");
					stmt2.execute("use tarro;");
					
					ResultSet result = stmt2.executeQuery("show tables like '"+uname+"'");
					while (result.next()) { // 다음것이 있는지 확인
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
						System.out.println("가입중복");
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
