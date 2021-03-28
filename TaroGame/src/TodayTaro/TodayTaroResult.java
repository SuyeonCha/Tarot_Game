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
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TodayTaroResult extends JFrame {

	public TodayTaroResult(String uname) {
		super("TodayTaro");

		JPanel jp = new JPanel();
		// 디비
		JLabel jl1 = new JLabel();
		List RList = new List();
		Random rnd = new Random();
		int rndnb = rnd.nextInt(78) + 1;
		try {

			Connection con = null;

			con = DriverManager.getConnection("jdbc:mysql://localhost:1228",
					"root", "1234");

			// Statement는 정적 SQL문을 실행하고 결과를 반환받기 위한 객체다.
			// Statement하나당 한개의 ResultSet 객체만을 열 수 있다.
			java.sql.Statement st = null;
			ResultSet result = null;
			st = con.createStatement();
			st.execute("use tarro;"); // 사용할 DB를 선택한다.
			// executeQuery : 쿼리를 실행하고 결과를 ResultSet 객체로 반환한다.
			result = st.executeQuery("select * from today where id =" + rndnb);
			// 결과를 하나씩 출력한다.
			while (result.next()) { // 다음것이 있는지 확인
				String str = result.getString(2);
				String str2 = result.getString(3);

				// 엔터나오면 쪼개짐
				String splitStrArr[] = str2.split("\n");
				for (int i = 0; i < splitStrArr.length; i++) {
					RList.add(splitStrArr[i]);
				}

				jl1 = new JLabel(str); // 리스트에 데이터를 추가한다.
				jl1.setForeground(Color.white); // 폰트색
				jl1.setFont(new Font("210 인사동사거리 B", Font.BOLD, 44));

				RList.setFont(new Font("210 인사동사거리 B", Font.BOLD, 15));
				jl1.setBounds(420, 80, 500, 50);
				RList.setBounds(420, 180, 410, 200);
			}
		} catch (SQLException sqle) {
			System.out.println("SQLException: " + sqle.getMessage());
			System.out.println("SQLState: " + sqle.getSQLState());
		}

		// 뒤로가기버튼에 이미지 넣기
		JButton Jb1 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/backbt.png")));
		Jb1.setBorderPainted(false);
		Jb1.setContentAreaFilled(false);
		Jb1.setFocusPainted(false);
		Jb1.setBounds(600, 440, 290, 140);// 위치조정

		// 저장하기버튼에 이미지 넣기
		JButton Jb2 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/historybt.png")));
		Jb2.setBorderPainted(false);
		Jb2.setContentAreaFilled(false);
		Jb2.setFocusPainted(false);
		Jb2.setBounds(360, 420, 290, 140);// 위치조정

		// 배경이미지
		JLabel l1 = new JLabel();
		Image img = new ImageIcon(this.getClass()
				.getResource("../img/Game.png")).getImage();
		Image img1 = img.getScaledInstance(900, 600,
				java.awt.Image.SCALE_SMOOTH); // img1에 img를 넣음
		l1.setIcon(new ImageIcon(img1));// l1에 img1을 넣음

		add(jp);
		jp.add(l1);
		l1.add(Jb1);
		l1.add(Jb2);
		l1.add(jl1);
		l1.add(RList);

		// 카드 이미지
		switch (rndnb) {
		case 1:
			JLabel c1 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/01.png")));
			c1.setBounds(90, 50, 290, 500);
			l1.add(c1);
		case 2:
			JLabel c2 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/02.png")));
			c2.setBounds(90, 50, 290, 500);
			l1.add(c2);
		case 3:
			JLabel c3 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/03.png")));
			c3.setBounds(90, 50, 290, 500);
			l1.add(c3);
		case 4:
			JLabel c4 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/04.png")));
			c4.setBounds(90, 50, 290, 500);
			l1.add(c4);
		case 5:
			JLabel c5 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/05.png")));
			c5.setBounds(90, 50, 290, 500);
			l1.add(c5);
		case 6:
			JLabel c6 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/06.png")));
			c6.setBounds(90, 50, 290, 500);
			l1.add(c6);
		case 7:
			JLabel c7 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/07.png")));
			c7.setBounds(90, 50, 290, 500);
			l1.add(c7);
		case 8:
			JLabel c8 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/08.png")));
			c8.setBounds(90, 50, 290, 500);
			l1.add(c8);
		case 9:
			JLabel c9 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/09.png")));
			c9.setBounds(90, 50, 290, 500);
			l1.add(c9);
		case 10:
			JLabel c10 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/10.png")));
			c10.setBounds(90, 50, 290, 500);
			l1.add(c10);
		case 11:
			JLabel c11 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/11.png")));
			c11.setBounds(90, 50, 290, 500);
			l1.add(c11);
		case 12:
			JLabel c12 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/12.png")));
			c12.setBounds(90, 50, 290, 500);
			l1.add(c12);
		case 13:
			JLabel c13 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/13.png")));
			c13.setBounds(90, 50, 290, 500);
			l1.add(c13);
		case 14:
			JLabel c14 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/14.png")));
			c14.setBounds(90, 50, 290, 500);
			l1.add(c14);
		case 15:
			JLabel c15 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/15.png")));
			c15.setBounds(90, 50, 290, 500);
			l1.add(c15);
		case 16:
			JLabel c16 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/16.png")));
			c16.setBounds(90, 50, 290, 500);
			l1.add(c16);
		case 17:
			JLabel c17 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/17.png")));
			c17.setBounds(90, 50, 290, 500);
			l1.add(c17);
		case 18:
			JLabel c18 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/18.png")));
			c18.setBounds(90, 50, 290, 500);
			l1.add(c18);
		case 19:
			JLabel c19 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/19.png")));
			c19.setBounds(90, 50, 290, 500);
			l1.add(c19);
		case 20:
			JLabel c20 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/20.png")));
			c20.setBounds(90, 50, 290, 500);
			l1.add(c20);
		case 21:
			JLabel c21 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/21.png")));
			c21.setBounds(90, 50, 290, 500);
			l1.add(c21);
		case 22:
			JLabel c22 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/22.png")));
			c22.setBounds(90, 50, 290, 500);
			l1.add(c22);
		case 23:
			JLabel c23 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/23.png")));
			c23.setBounds(90, 50, 290, 500);
			l1.add(c23);
		case 24:
			JLabel c24 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/24.png")));
			c24.setBounds(90, 50, 290, 500);
			l1.add(c24);
		case 25:
			JLabel c25 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/25.png")));
			c25.setBounds(90, 50, 290, 500);
			l1.add(c25);
		case 26:
			JLabel c26 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/26.png")));
			c26.setBounds(90, 50, 290, 500);
			l1.add(c26);
		case 27:
			JLabel c27 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/27.png")));
			c27.setBounds(90, 50, 290, 500);
			l1.add(c27);
		case 28:
			JLabel c28 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/28.png")));
			c28.setBounds(90, 50, 290, 500);
			l1.add(c28);
		case 29:
			JLabel c29 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/29.png")));
			c29.setBounds(90, 50, 290, 500);
			l1.add(c29);
		case 30:
			JLabel c30 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/30.png")));
			c30.setBounds(90, 50, 290, 500);
			l1.add(c30);
		case 31:
			JLabel c31 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/31.png")));
			c31.setBounds(90, 50, 290, 500);
			l1.add(c31);
		case 32:
			JLabel c32 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/32.png")));
			c32.setBounds(90, 50, 290, 500);
			l1.add(c32);
		case 33:
			JLabel c33 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/33.png")));
			c33.setBounds(90, 50, 290, 500);
			l1.add(c33);
		case 34:
			JLabel c34 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/34.png")));
			c34.setBounds(90, 50, 290, 500);
			l1.add(c34);
		case 35:
			JLabel c35 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/35.png")));
			c35.setBounds(90, 50, 290, 500);
			l1.add(c35);
		case 36:
			JLabel c36 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/36.png")));
			c36.setBounds(90, 50, 290, 500);
			l1.add(c36);
		case 37:
			JLabel c37 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/37.png")));
			c37.setBounds(90, 50, 290, 500);
			l1.add(c37);
		case 38:
			JLabel c38 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/38.png")));
			c38.setBounds(90, 50, 290, 500);
			l1.add(c38);
		case 39:
			JLabel c39 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/39.png")));
			c39.setBounds(90, 50, 290, 500);
			l1.add(c39);
		case 40:
			JLabel c40 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/40.png")));
			c40.setBounds(90, 50, 290, 500);
			l1.add(c40);
		case 41:
			JLabel c41 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/41.png")));
			c41.setBounds(90, 50, 290, 500);
			l1.add(c41);
		case 42:
			JLabel c42 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/42.png")));
			c42.setBounds(90, 50, 290, 500);
			l1.add(c42);
		case 43:
			JLabel c43 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/43.png")));
			c43.setBounds(90, 50, 290, 500);
			l1.add(c43);
		case 44:
			JLabel c44 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/44.png")));
			c44.setBounds(90, 50, 290, 500);
			l1.add(c44);
		case 45:
			JLabel c45 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/45.png")));
			c45.setBounds(90, 50, 290, 500);
			l1.add(c45);
		case 46:
			JLabel c46 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/46.png")));
			c46.setBounds(90, 50, 290, 500);
			l1.add(c46);
		case 47:
			JLabel c47 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/47.png")));
			c47.setBounds(90, 50, 290, 500);
			l1.add(c47);
		case 48:
			JLabel c48 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/48.png")));
			c48.setBounds(90, 50, 290, 500);
			l1.add(c48);
		case 49:
			JLabel c49 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/49.png")));
			c49.setBounds(90, 50, 290, 500);
			l1.add(c49);
		case 50:
			JLabel c50 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/50.png")));
			c50.setBounds(90, 50, 290, 500);
			l1.add(c50);
		case 51:
			JLabel c51 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/51.png")));
			c51.setBounds(90, 50, 290, 500);
			l1.add(c51);

		case 52:
			JLabel c52 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/52.png")));
			c52.setBounds(90, 50, 290, 500);
			l1.add(c52);
		case 53:
			JLabel c53 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/53.png")));
			c53.setBounds(90, 50, 290, 500);
			l1.add(c53);
		case 54:
			JLabel c54 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/54.png")));
			c54.setBounds(90, 50, 290, 500);
			l1.add(c54);
		case 55:
			JLabel c55 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/55.png")));
			c55.setBounds(90, 50, 290, 500);
			l1.add(c55);
		case 56:
			JLabel c56 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/56.png")));
			c56.setBounds(90, 50, 290, 500);
			l1.add(c56);
		case 57:
			JLabel c57 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/57.png")));
			c57.setBounds(90, 50, 290, 500);
			l1.add(c57);
		case 58:
			JLabel c58 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/58.png")));
			c58.setBounds(90, 50, 290, 500);
			l1.add(c58);
		case 59:
			JLabel c59 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/59.png")));
			c59.setBounds(90, 50, 290, 500);
			l1.add(c59);
		case 60:
			JLabel c60 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/60.png")));
			c60.setBounds(90, 50, 290, 500);
			l1.add(c60);
		case 61:
			JLabel c61 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/61.png")));
			c61.setBounds(90, 50, 290, 500);
			l1.add(c61);
		case 62:
			JLabel c62 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/62.png")));
			c62.setBounds(90, 50, 290, 500);
			l1.add(c62);
		case 63:
			JLabel c63 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/63.png")));
			c63.setBounds(90, 50, 290, 500);
			l1.add(c63);
		case 64:
			JLabel c64 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/64.png")));
			c64.setBounds(90, 50, 290, 500);
			l1.add(c64);
		case 65:
			JLabel c65 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/65.png")));
			c65.setBounds(90, 50, 290, 500);
			l1.add(c65);
		case 66:
			JLabel c66 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/66.png")));
			c66.setBounds(90, 50, 290, 500);
			l1.add(c66);
		case 67:
			JLabel c67 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/67.png")));
			c67.setBounds(90, 50, 290, 500);
			l1.add(c67);
		case 68:
			JLabel c68 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/68.png")));
			c68.setBounds(90, 50, 290, 500);
			l1.add(c68);
		case 69:
			JLabel c69 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/69.png")));
			c69.setBounds(90, 50, 290, 500);
			l1.add(c69);
		case 70:
			JLabel c70 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/70.png")));
			c70.setBounds(90, 50, 290, 500);
			l1.add(c70);
		case 71:
			JLabel c71 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/71.png")));
			c71.setBounds(90, 50, 290, 500);
			l1.add(c71);
		case 72:
			JLabel c72 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/72.png")));
			c72.setBounds(90, 50, 290, 500);
			l1.add(c72);
		case 73:
			JLabel c73 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/73.png")));
			c73.setBounds(90, 50, 290, 500);
			l1.add(c73);
		case 74:
			JLabel c74 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/74.png")));
			c74.setBounds(90, 50, 290, 500);
			l1.add(c74);
		case 75:
			JLabel c75 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/75.png")));
			c75.setBounds(90, 50, 290, 500);
			l1.add(c75);
		case 76:
			JLabel c76 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/76.png")));
			c76.setBounds(90, 50, 290, 500);
			l1.add(c76);
		case 77:
			JLabel c77 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/77.png")));
			c77.setBounds(90, 50, 290, 500);
			l1.add(c77);
		case 78:
			JLabel c78 = new JLabel(new ImageIcon(
					TodayTaro.class.getResource("../Card/78.png")));
			c78.setBounds(90, 50, 290, 500);
			l1.add(c78);
		}

		setSize(900, 650);// 처음 창 크기
		setLocation(500, 100);
		setVisible(true);
		setLayout(null);

		Jb1.setToolTipText("홈으로 돌아가기"); // 버튼에 올려놓으면 툴나옴
		Jb2.setToolTipText("기록을 봐야 저장이 됩니다"); // 버튼에 올려놓으면 툴나옴
		Jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jb1.setVisible(false);
				Main ht = new Main();
				ht.setVisible(true);
				setVisible(false);
			}
		});

		Jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 날짜
		        Calendar c1 = Calendar.getInstance();
		        
		        java.util.Date date = c1.getTime();
		        
		        String today = (new SimpleDateFormat("yyyy-MM-dd").format(date));

				java.util.Date utilDate = new java.util.Date();
				java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

				try {
					ResultSet result = null;
					String str2 = null;
					Connection con = con = DriverManager.getConnection(
							"jdbc:mysql://localhost:1228", "root", "1234");

					// Statement는 정적 SQL문을 실행하고 결과를 반환받기 위한 객체다.
					// Statement하나당 한개의 ResultSet 객체만을 열 수 있다.
					Statement stmt = con.createStatement();
					stmt.execute("use tarro;");

					result = stmt.executeQuery("select * from today where id ="
							+ rndnb);
					while (result.next()) {
						str2 = result.getString(3);
					}

					String sql = "insert into " + uname + " values('0','오늘운','"
							+ str2 + "','" + sqlDate + "')";
					stmt.executeUpdate(sql);

				} catch (SQLException sqle) {
					System.out.println("SQLException: " + sqle.getMessage());
					System.out.println("SQLState: " + sqle.getSQLState());
				}

				Jb1.setVisible(false);
				History ht = new History(uname);
				ht.setVisible(true);
				setVisible(false);
			}
		});
	}

	public static void main(String[] args) throws IOException {
		String uname = null;
		new TodayTaroResult(uname);
	}
}
