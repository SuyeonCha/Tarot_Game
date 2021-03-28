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

		// 배경이미지
		JLabel l1 = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource(
				"../img/Historyscreen.png")).getImage();
		Image img1 = img.getScaledInstance(900, 600,
				java.awt.Image.SCALE_SMOOTH); // img1에 img를 넣음
		l1.setIcon(new ImageIcon(img1));// l1에 img1을 넣음

		JButton Jb1 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/backbt.png")));
		Jb1.setBorderPainted(false);
		Jb1.setContentAreaFilled(false);
		Jb1.setFocusPainted(false);
		Jb1.setBounds(690, 500, 290, 140);// 위치조정

		// 첫번째 사람
		JLabel jl1 = new JLabel();
		JLabel jl1_2 = new JLabel();
		JLabel jl1_3 = new JLabel();
		List RList = new List();

		// 두번째 사람
		JLabel jl2 = new JLabel();
		JLabel jl2_2 = new JLabel();
		JLabel jl2_3 = new JLabel();
		List RList2 = new List();

		// 세번째 사람
		JLabel jl3 = new JLabel();
		JLabel jl3_2 = new JLabel();
		JLabel jl3_3 = new JLabel();
		List RList3 = new List();

		try {
			Connection con = null;
			con = DriverManager.getConnection("jdbc:mysql://localhost:1228",
					"root", "1234");

			// Statement는 정적 SQL문을 실행하고 결과를 반환받기 위한 객체다.
			// Statement하나당 한개의 ResultSet 객체만을 열 수 있다.
			java.sql.Statement st = null;
			java.sql.Statement st2 = null;
			java.sql.Statement st3 = null;
			ResultSet result = null; //DB의 컬럼 내용들을 가져옴
			ResultSet result2 = null;
			ResultSet result3 = null;
			st = con.createStatement();
			st2 = con.createStatement();
			st3 = con.createStatement();
			st.execute("use tarro;"); // 사용할 DB를 선택한다.
			st2.execute("use tarro;"); // 사용할 DB를 선택한다.
			st3.execute("use tarro;"); // 사용할 DB를 선택한다.

			result = st.executeQuery("select * from " + uname + " where id =1");
			result2 = st2.executeQuery("select * from " + uname + " where id =2");
			result3 = st3.executeQuery("select * from " + uname + " where id =3");

			// 첫번째 사람
			while (result.next()) { // 다음것이 있는지 확인
				String str1 = result.getString(1); //id
				String str1_1 = result.getString(2); //운세이름
				String str1_2 = result.getString(3); //결과
				String str1_3 = result.getString(4); //날짜

				// 엔터나오면 쪼개짐
				String splitStrArr[] = str1_2.split("\n");
				for (int i = 0; i < splitStrArr.length; i++) {
					RList.add(splitStrArr[i]);
				}
				// 첫번째 사람
				jl1 = new JLabel(str1); // 리스트에 데이터를 추가한다.
				jl1_2 = new JLabel(str1_1);
				jl1_3 = new JLabel(str1_3);
				jl1.setForeground(Color.white); // 폰트색
				jl1.setFont(new Font("210 인사동사거리 B", Font.BOLD, 20));
				jl1_2.setFont(new Font("210 인사동사거리 B", Font.BOLD, 20));
				jl1_3.setFont(new Font("210 인사동사거리 B", Font.BOLD, 20));
				RList.setFont(new Font("210 인사동사거리 B", Font.BOLD, 12));
				jl1.setBounds(200, 230, 100, 50);
				jl1_2.setBounds(270, 230, 100, 50);
				jl1_3.setBounds(370, 230, 120, 50);
				RList.setBounds(530, 230, 200, 80);

			}

			// 두번째 사람
			while (result2.next()) { // 다음것이 있는지 확인
				String str2 = result2.getString(1);
				String str2_1 = result2.getString(2);
				String str2_2 = result2.getString(3);
				String str2_3 = result2.getString(4);

				// 엔터나오면 쪼개짐
				String splitStrArr2[] = str2_2.split("\n");

				for (int i = 0; i < splitStrArr2.length; i++) {
					RList2.add(splitStrArr2[i]);
				}

				// 두번째 사람
				jl2 = new JLabel(str2); // 리스트에 데이터를 추가한다.
				jl2_2 = new JLabel(str2_1);
				jl2_3 = new JLabel(str2_3);
				jl2.setForeground(Color.white); // 폰트색
				jl2.setFont(new Font("210 인사동사거리 B", Font.BOLD, 20));
				jl2_2.setFont(new Font("210 인사동사거리 B", Font.BOLD, 20));
				jl2_3.setFont(new Font("210 인사동사거리 B", Font.BOLD, 20));
				RList2.setFont(new Font("210 인사동사거리 B", Font.BOLD, 12));
				jl2.setBounds(200, 330, 100, 50);
				jl2_2.setBounds(270, 330, 100, 50);
				jl2_3.setBounds(370, 330, 120, 50);
				RList2.setBounds(530, 330, 200, 80);

			}

			// 세번째 사람
			while (result3.next()) { // 다음것이 있는지 확인
				String str3 = result3.getString(1);
				String str3_1 = result3.getString(2);
				String str3_2 = result3.getString(3);
				String str3_3 = result3.getString(4);

				// 엔터나오면 쪼개짐
				String splitStrArr3[] = str3_2.split("\n");

				for (int i = 0; i < splitStrArr3.length; i++) {
					RList3.add(splitStrArr3[i]);
				}
				// 세번째 사람
				jl3 = new JLabel(str3); // 리스트에 데이터를 추가한다.
				jl3_2 = new JLabel(str3_1);
				jl3_3 = new JLabel(str3_3);
				jl3.setForeground(Color.white); // 폰트색
				jl3.setFont(new Font("210 인사동사거리 B", Font.BOLD, 20));
				jl3_2.setFont(new Font("210 인사동사거리 B", Font.BOLD, 20));
				jl3_3.setFont(new Font("210 인사동사거리 B", Font.BOLD, 20));
				RList3.setFont(new Font("210 인사동사거리 B", Font.BOLD, 12));
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
		// 첫번째사람
		l1.add(jl1);
		l1.add(jl1_2);
		l1.add(jl1_3);
		l1.add(RList);

		// 두번째사람
		l1.add(jl2);
		l1.add(jl2_2);
		l1.add(jl2_3);
		l1.add(RList2);

		// 세번째사람
		l1.add(jl3);
		l1.add(jl3_2);
		l1.add(jl3_3);
		l1.add(RList3);

		Jb1.setToolTipText("홈으로 돌아가기"); // 버튼에 올려놓으면 툴나옴
		Jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jb1.setVisible(false);
				Main ht = new Main();
				ht.setVisible(true);
				setVisible(false);
			}
		});
		
		setSize(900, 650);// 처음 창 크기
		setLocation(500, 100);
		setVisible(true);
		setLayout(null);

		
	}

	public static void main(String[] args) throws IOException {
		String uname = null;
		new History(uname);
	}
}