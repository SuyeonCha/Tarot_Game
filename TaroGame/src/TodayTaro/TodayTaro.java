package TodayTaro;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;

public class TodayTaro extends JFrame {

	public TodayTaro(String uname) {
		super("TodayTaro");

		JPanel jp = new JPanel();

		// 타로카드 첫째줄
		JButton c1 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c1.setBorderPainted(false);
		c1.setContentAreaFilled(true);
		c1.setFocusPainted(false);
		c1.setBounds(85, 40, 100, 170);

		JButton c2 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c2.setBorderPainted(false);
		c2.setContentAreaFilled(true);
		c2.setFocusPainted(false);
		c2.setBounds(110, 40, 100, 170);

		JButton c3 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c3.setBorderPainted(false);
		c3.setContentAreaFilled(true);
		c3.setFocusPainted(false);
		c3.setBounds(135, 40, 100, 170);

		JButton c4 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c4.setBorderPainted(false);
		c4.setContentAreaFilled(true);
		c4.setFocusPainted(false);
		c4.setBounds(160, 40, 100, 170);

		JButton c5 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c5.setBorderPainted(false);
		c5.setContentAreaFilled(true);
		c5.setFocusPainted(false);
		c5.setBounds(185, 40, 100, 170);

		JButton c6 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c6.setBorderPainted(false);
		c6.setContentAreaFilled(true);
		c6.setFocusPainted(false);
		c6.setBounds(210, 40, 100, 170);

		JButton c7 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c7.setBorderPainted(false);
		c7.setContentAreaFilled(true);
		c7.setFocusPainted(false);
		c7.setBounds(235, 40, 100, 170);

		JButton c8 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c8.setBorderPainted(false);
		c8.setContentAreaFilled(true);
		c8.setFocusPainted(false);
		c8.setBounds(260, 40, 100, 170);

		JButton c9 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c9.setBorderPainted(false);
		c9.setContentAreaFilled(true);
		c9.setFocusPainted(false);
		c9.setBounds(285, 40, 100, 170);

		JButton c10 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c10.setBorderPainted(false);
		c10.setContentAreaFilled(true);
		c10.setFocusPainted(false);
		c10.setBounds(310, 40, 100, 170);

		JButton c11 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c11.setBorderPainted(false);
		c11.setContentAreaFilled(true);
		c11.setFocusPainted(false);
		c11.setBounds(335, 40, 100, 170);

		JButton c12 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c12.setBorderPainted(false);
		c12.setContentAreaFilled(true);
		c12.setFocusPainted(false);
		c12.setBounds(360, 40, 100, 170);

		JButton c13 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c13.setBorderPainted(false);
		c13.setContentAreaFilled(true);
		c13.setFocusPainted(false);
		c13.setBounds(385, 40, 100, 170);

		JButton c14 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c14.setBorderPainted(false);
		c14.setContentAreaFilled(true);
		c14.setFocusPainted(false);
		c14.setBounds(410, 40, 100, 170);

		JButton c15 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c15.setBorderPainted(false);
		c15.setContentAreaFilled(true);
		c15.setFocusPainted(false);
		c15.setBounds(435, 40, 100, 170);

		JButton c16 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c16.setBorderPainted(false);
		c16.setContentAreaFilled(true);
		c16.setFocusPainted(false);
		c16.setBounds(460, 40, 100, 170);

		JButton c17 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c17.setBorderPainted(false);
		c17.setContentAreaFilled(true);
		c17.setFocusPainted(false);
		c17.setBounds(485, 40, 100, 170);

		JButton c18 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c18.setBorderPainted(false);
		c18.setContentAreaFilled(true);
		c18.setFocusPainted(false);
		c18.setBounds(510, 40, 100, 170);

		JButton c19 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c19.setBorderPainted(false);
		c19.setContentAreaFilled(true);
		c19.setFocusPainted(false);
		c19.setBounds(535, 40, 100, 170);

		JButton c20 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c20.setBorderPainted(false);
		c20.setContentAreaFilled(true);
		c20.setFocusPainted(false);
		c20.setBounds(560, 40, 100, 170);

		JButton c21 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c21.setBorderPainted(false);
		c21.setContentAreaFilled(true);
		c21.setFocusPainted(false);
		c21.setBounds(585, 40, 100, 170);

		JButton c22 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c22.setBorderPainted(false);
		c22.setContentAreaFilled(true);
		c22.setFocusPainted(false);
		c22.setBounds(610, 40, 100, 170);

		JButton c23 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c23.setBorderPainted(false);
		c23.setContentAreaFilled(true);
		c23.setFocusPainted(false);
		c23.setBounds(635, 40, 100, 170);

		JButton c24 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c24.setBorderPainted(false);
		c24.setContentAreaFilled(true);
		c24.setFocusPainted(false);
		c24.setBounds(660, 40, 100, 170);

		JButton c25 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c25.setBorderPainted(false);
		c25.setContentAreaFilled(true);
		c25.setFocusPainted(false);
		c25.setBounds(685, 40, 100, 170);

		JButton c26 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c26.setBorderPainted(false);
		c26.setContentAreaFilled(true);
		c26.setFocusPainted(false);
		c26.setBounds(710, 40, 100, 170);

		// 타로카드 둘째줄
		JButton c27 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c27.setBorderPainted(false);
		c27.setContentAreaFilled(true);
		c27.setFocusPainted(false);
		c27.setBounds(85, 220, 100, 170);

		JButton c28 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c28.setBorderPainted(false);
		c28.setContentAreaFilled(true);
		c28.setFocusPainted(false);
		c28.setBounds(110, 220, 100, 170);

		JButton c29 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c29.setBorderPainted(false);
		c29.setContentAreaFilled(true);
		c29.setFocusPainted(false);
		c29.setBounds(135, 220, 100, 170);

		JButton c30 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c30.setBorderPainted(false);
		c30.setContentAreaFilled(true);
		c30.setFocusPainted(false);
		c30.setBounds(160, 220, 100, 170);

		JButton c31 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c31.setBorderPainted(false);
		c31.setContentAreaFilled(true);
		c31.setFocusPainted(false);
		c31.setBounds(185, 220, 100, 170);

		JButton c32 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c32.setBorderPainted(false);
		c32.setContentAreaFilled(true);
		c32.setFocusPainted(false);
		c32.setBounds(210, 220, 100, 170);

		JButton c33 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c33.setBorderPainted(false);
		c33.setContentAreaFilled(true);
		c33.setFocusPainted(false);
		c33.setBounds(235, 220, 100, 170);

		JButton c34 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c34.setBorderPainted(false);
		c34.setContentAreaFilled(true);
		c34.setFocusPainted(false);
		c34.setBounds(260, 220, 100, 170);

		JButton c35 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c35.setBorderPainted(false);
		c35.setContentAreaFilled(true);
		c35.setFocusPainted(false);
		c35.setBounds(285, 220, 100, 170);

		JButton c36 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c36.setBorderPainted(false);
		c36.setContentAreaFilled(true);
		c36.setFocusPainted(false);
		c36.setBounds(310, 220, 100, 170);

		JButton c37 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c37.setBorderPainted(false);
		c37.setContentAreaFilled(true);
		c37.setFocusPainted(false);
		c37.setBounds(335, 220, 100, 170);

		JButton c38 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c38.setBorderPainted(false);
		c38.setContentAreaFilled(true);
		c38.setFocusPainted(false);
		c38.setBounds(360, 220, 100, 170);

		JButton c39 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c39.setBorderPainted(false);
		c39.setContentAreaFilled(true);
		c39.setFocusPainted(false);
		c39.setBounds(385, 220, 100, 170);

		JButton c40 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c40.setBorderPainted(false);
		c40.setContentAreaFilled(true);
		c40.setFocusPainted(false);
		c40.setBounds(410, 220, 100, 170);

		JButton c41 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c41.setBorderPainted(false);
		c41.setContentAreaFilled(true);
		c41.setFocusPainted(false);
		c41.setBounds(435, 220, 100, 170);

		JButton c42 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c42.setBorderPainted(false);
		c42.setContentAreaFilled(true);
		c42.setFocusPainted(false);
		c42.setBounds(460, 220, 100, 170);

		JButton c43 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c43.setBorderPainted(false);
		c43.setContentAreaFilled(true);
		c43.setFocusPainted(false);
		c43.setBounds(485, 220, 100, 170);

		JButton c44 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c44.setBorderPainted(false);
		c44.setContentAreaFilled(true);
		c44.setFocusPainted(false);
		c44.setBounds(510, 220, 100, 170);

		JButton c45 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c45.setBorderPainted(false);
		c45.setContentAreaFilled(true);
		c45.setFocusPainted(false);
		c45.setBounds(535, 220, 100, 170);

		JButton c46 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c46.setBorderPainted(false);
		c46.setContentAreaFilled(true);
		c46.setFocusPainted(false);
		c46.setBounds(560, 220, 100, 170);

		JButton c47 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c47.setBorderPainted(false);
		c47.setContentAreaFilled(true);
		c47.setFocusPainted(false);
		c47.setBounds(585, 220, 100, 170);

		JButton c48 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c48.setBorderPainted(false);
		c48.setContentAreaFilled(true);
		c48.setFocusPainted(false);
		c48.setBounds(610, 220, 100, 170);

		JButton c49 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c49.setBorderPainted(false);
		c49.setContentAreaFilled(true);
		c49.setFocusPainted(false);
		c49.setBounds(635, 220, 100, 170);

		JButton c50 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c50.setBorderPainted(false);
		c50.setContentAreaFilled(true);
		c50.setFocusPainted(false);
		c50.setBounds(660, 220, 100, 170);

		JButton c51 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c51.setBorderPainted(false);
		c51.setContentAreaFilled(true);
		c51.setFocusPainted(false);
		c51.setBounds(685, 220, 100, 170);

		JButton c52 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c52.setBorderPainted(false);
		c52.setContentAreaFilled(true);
		c52.setFocusPainted(false);
		c52.setBounds(710, 220, 100, 170);

		// 타로카드 셋째줄
		JButton c53 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c53.setBorderPainted(false);
		c53.setContentAreaFilled(true);
		c53.setFocusPainted(false);
		c53.setBounds(85, 400, 100, 170);

		JButton c54 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c54.setBorderPainted(false);
		c54.setContentAreaFilled(true);
		c54.setFocusPainted(false);
		c54.setBounds(110, 400, 100, 170);

		JButton c55 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c55.setBorderPainted(false);
		c55.setContentAreaFilled(true);
		c55.setFocusPainted(false);
		c55.setBounds(135, 400, 100, 170);

		JButton c56 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c56.setBorderPainted(false);
		c56.setContentAreaFilled(true);
		c56.setFocusPainted(false);
		c56.setBounds(160, 400, 100, 170);

		JButton c57 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c57.setBorderPainted(false);
		c57.setContentAreaFilled(true);
		c57.setFocusPainted(false);
		c57.setBounds(185, 400, 100, 170);

		JButton c58 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c58.setBorderPainted(false);
		c58.setContentAreaFilled(true);
		c58.setFocusPainted(false);
		c58.setBounds(210, 400, 100, 170);

		JButton c59 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c59.setBorderPainted(false);
		c59.setContentAreaFilled(true);
		c59.setFocusPainted(false);
		c59.setBounds(235, 400, 100, 170);

		JButton c60 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c60.setBorderPainted(false);
		c60.setContentAreaFilled(true);
		c60.setFocusPainted(false);
		c60.setBounds(260, 400, 100, 170);

		JButton c61 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c61.setBorderPainted(false);
		c61.setContentAreaFilled(true);
		c61.setFocusPainted(false);
		c61.setBounds(285, 400, 100, 170);

		JButton c62 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c62.setBorderPainted(false);
		c62.setContentAreaFilled(true);
		c62.setFocusPainted(false);
		c62.setBounds(310, 400, 100, 170);

		JButton c63 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c63.setBorderPainted(false);
		c63.setContentAreaFilled(true);
		c63.setFocusPainted(false);
		c63.setBounds(335, 400, 100, 170);

		JButton c64 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c64.setBorderPainted(false);
		c64.setContentAreaFilled(true);
		c64.setFocusPainted(false);
		c64.setBounds(360, 400, 100, 170);

		JButton c65 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c65.setBorderPainted(false);
		c65.setContentAreaFilled(true);
		c65.setFocusPainted(false);
		c65.setBounds(385, 400, 100, 170);

		JButton c66 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c66.setBorderPainted(false);
		c66.setContentAreaFilled(true);
		c66.setFocusPainted(false);
		c66.setBounds(410, 400, 100, 170);

		JButton c67 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c67.setBorderPainted(false);
		c67.setContentAreaFilled(true);
		c67.setFocusPainted(false);
		c67.setBounds(435, 400, 100, 170);

		JButton c68 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c68.setBorderPainted(false);
		c68.setContentAreaFilled(true);
		c68.setFocusPainted(false);
		c68.setBounds(460, 400, 100, 170);

		JButton c69 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c69.setBorderPainted(false);
		c69.setContentAreaFilled(true);
		c69.setFocusPainted(false);
		c69.setBounds(485, 400, 100, 170);

		JButton c70 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c70.setBorderPainted(false);
		c70.setContentAreaFilled(true);
		c70.setFocusPainted(false);
		c70.setBounds(510, 400, 100, 170);

		JButton c71 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c71.setBorderPainted(false);
		c71.setContentAreaFilled(true);
		c71.setFocusPainted(false);
		c71.setBounds(535, 400, 100, 170);

		JButton c72 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c72.setBorderPainted(false);
		c72.setContentAreaFilled(true);
		c72.setFocusPainted(false);
		c72.setBounds(560, 400, 100, 170);

		JButton c73 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c73.setBorderPainted(false);
		c73.setContentAreaFilled(true);
		c73.setFocusPainted(false);
		c73.setBounds(585, 400, 100, 170);

		JButton c74 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c74.setBorderPainted(false);
		c74.setContentAreaFilled(true);
		c74.setFocusPainted(false);
		c74.setBounds(610, 400, 100, 170);

		JButton c75 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c75.setBorderPainted(false);
		c75.setContentAreaFilled(true);
		c75.setFocusPainted(false);
		c75.setBounds(635, 400, 100, 170);

		JButton c76 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c76.setBorderPainted(false);
		c76.setContentAreaFilled(true);
		c76.setFocusPainted(false);
		c76.setBounds(660, 400, 100, 170);

		JButton c77 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c77.setBorderPainted(false);
		c77.setContentAreaFilled(true);
		c77.setFocusPainted(false);
		c77.setBounds(685, 400, 100, 170);

		JButton c78 = new JButton(new ImageIcon(
				TodayTaro.class.getResource("../img/Card.png")));
		c78.setBorderPainted(false);
		c78.setContentAreaFilled(true);
		c78.setFocusPainted(false);
		c78.setBounds(710, 400, 100, 170);

		// 배경이미지
		JLabel l1 = new JLabel();
		Image img = new ImageIcon(this.getClass()
				.getResource("../img/Game.png")).getImage();
		Image img1 = img.getScaledInstance(900, 600,
				java.awt.Image.SCALE_SMOOTH); // img1에 img를 넣음
		l1.setIcon(new ImageIcon(img1));// l1에 img1을 넣음

		// add(Jp2);//배경만 나옴
		add(jp);
		jp.add(l1);

		l1.add(c1);
		l1.add(c2);
		l1.add(c3);
		l1.add(c4);
		l1.add(c5);
		l1.add(c6);
		l1.add(c7);
		l1.add(c8);
		l1.add(c9);
		l1.add(c10);
		l1.add(c11);
		l1.add(c12);
		l1.add(c13);
		l1.add(c14);
		l1.add(c15);
		l1.add(c16);
		l1.add(c17);
		l1.add(c18);
		l1.add(c19);
		l1.add(c20);
		l1.add(c21);
		l1.add(c22);
		l1.add(c23);
		l1.add(c24);
		l1.add(c25);
		l1.add(c26);
		l1.add(c27);
		l1.add(c28);
		l1.add(c29);
		l1.add(c30);
		l1.add(c31);
		l1.add(c32);
		l1.add(c33);
		l1.add(c34);
		l1.add(c35);
		l1.add(c36);
		l1.add(c37);
		l1.add(c38);
		l1.add(c39);
		l1.add(c40);
		l1.add(c41);
		l1.add(c42);
		l1.add(c43);
		l1.add(c44);
		l1.add(c45);
		l1.add(c46);
		l1.add(c47);
		l1.add(c48);
		l1.add(c49);
		l1.add(c50);
		l1.add(c51);
		l1.add(c52);
		l1.add(c53);
		l1.add(c54);
		l1.add(c55);
		l1.add(c56);
		l1.add(c57);
		l1.add(c58);
		l1.add(c59);
		l1.add(c60);
		l1.add(c61);
		l1.add(c62);
		l1.add(c63);
		l1.add(c64);
		l1.add(c65);
		l1.add(c66);
		l1.add(c67);
		l1.add(c68);
		l1.add(c69);
		l1.add(c70);
		l1.add(c71);
		l1.add(c72);
		l1.add(c73);
		l1.add(c74);
		l1.add(c75);
		l1.add(c76);
		l1.add(c77);
		l1.add(c78);

		setSize(900, 650);// 처음 창 크기
		setLocation(500, 100);
		setVisible(true);
		setLayout(null);

		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c2.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c3.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c4.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c5.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c6.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c7.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c8.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c9.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c10.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c11.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c12.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c13.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c14.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c15.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c16.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c17.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c18.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c19.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c20.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c21.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c22.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c23.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c24.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c25.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c26.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c27.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c28.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c29.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c30.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c31.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c32.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c33.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c34.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c34.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c35.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c36.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c37.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c38.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c39.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c40.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c40.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c41.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c42.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c43.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c43.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c44.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c44.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c45.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c45.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c46.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c46.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c47.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c47.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c48.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c48.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c49.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c49.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c50.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c51.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c51.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c52.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c52.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c53.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c53.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c54.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c54.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c55.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c55.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c57.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c57.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c59.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c59.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c60.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c60.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c61.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c61.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c62.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c62.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c63.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c63.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c64.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c64.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c65.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c65.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c66.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c66.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c67.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c67.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c68.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c68.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c69.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c69.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c70.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c70.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c71.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c71.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c72.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c72.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c73.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c73.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c74.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c74.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c75.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c75.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c76.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c76.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c77.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c77.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
		c78.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c78.setVisible(false);
				TodayTaroResult tr = new TodayTaroResult(uname);
				tr.setVisible(true);
				setVisible(false);
			}
		});
	}

	public static void main(String[] args) throws IOException {
		String uname=null;
		new TodayTaro(uname);
	}
}