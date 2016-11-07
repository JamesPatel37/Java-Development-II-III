package assignment03;

import javax.swing.*;

import java.awt.Font;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

import java.awt.GridLayout;

import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

import java.awt.FlowLayout;
import java.util.Random;

public class Game extends JPanel {

	private int chances;
	private int index;
	private String guess = "";
	private String temp = "";
	private JButton t = new JButton();
	Random rand = new Random();
	private JLabel chancesLabel = new JLabel();
	private JLabel timeLabel = new JLabel("99:99");
	JButton start = new JButton("Start");

	private Timer timer;

	private JLabel label1 = new JLabel();
	private JLabel label2 = new JLabel();
	private JLabel label3 = new JLabel();
	private JLabel label4 = new JLabel();
	private JLabel label5 = new JLabel();
	private JLabel label6 = new JLabel();
	private JLabel label7 = new JLabel();
	private JLabel label8 = new JLabel();
	private JLabel label9 = new JLabel();
	private JLabel label10 = new JLabel();
	private JLabel label11 = new JLabel();
	private JLabel label12 = new JLabel();
	private JLabel label13 = new JLabel();
	private JLabel label14 = new JLabel();
	private JLabel label15 = new JLabel();
	private JLabel label16 = new JLabel();

	private JButton Q = new JButton("Q");
	private JButton W = new JButton("W");
	private JButton E = new JButton("E");
	private JButton R = new JButton("R");
	private JButton T = new JButton("T");
	private JButton Y = new JButton("Y");
	private JButton U = new JButton("U");
	private JButton I = new JButton("I");
	private JButton O = new JButton("O");
	private JButton P = new JButton("P");

	private JButton A = new JButton("A");
	private JButton S = new JButton("S");
	private JButton D = new JButton("D");
	private JButton F = new JButton("F");
	private JButton G = new JButton("G");
	private JButton H = new JButton("H");
	private JButton J = new JButton("J");
	private JButton K = new JButton("K");
	private JButton L = new JButton("L");

	private JButton Z = new JButton("Z");
	private JButton X = new JButton("X");
	private JButton C = new JButton("C");
	private JButton V = new JButton("V");
	private JButton B = new JButton("B");
	private JButton N = new JButton("N");
	private JButton M = new JButton("M");

	JMenuItem NewGame = new JMenuItem("New Game");
	JMenu Level = new JMenu("Level");

	private static final String countries[] = { "Andorra", "Afghanistan",
		"Anguilla", "Albania", "Armenia", "Netherland", "Angola",
		"Antarctica", "Argentina", "Austria", "Australia", "Aruba",
		"Azerbaijan", "Barbados", "Bangladesh", "Belgium", "Bulgaria",
		"Bahrain", "Burundi", "Benin", "Bermuda", "Brunei", "Bolivia",
		"Brazil", "Bahamas", "Bhutan", "Botswana", "Belarus", "Belize",
		"Canada", "Switzerland", "Chile", "Cameroon", "China", "Colombia",
		"Cuba", "Cyprus", "Germany", "Djibouti", "Denmark", "Dominica",
		"Algeria", "Ecuador", "Estonia", "Egypt", "Eritrea", "Spain",
		"Ethiopia", "Finland", "Fiji", "Micronesia", "France", "France",
		"Gabon", "Grenada", "Georgia", "Guernsey", "Ghana", "Gibraltar",
		"Greenland", "Gambia", "Guinea", "Guadeloupe", "Greece",
		"uatemala", "Guam", "Guyana", "HongKong", "Honduras", "Croatia",
		"Haiti", "Hungary", "Indonesia", "Ireland", "Israel", "India",
		"Iraq", "Iran", "Iceland", "Italy", "Jersey", "Jamaica", "Jordan",
		"Japan", "Kenya", "Kyrgyzstan", "Cambodia", "Kiribati", "Comoros",
		"North Korea", "South Korea", "Kuwait", "Kazakhstan", "Laos",
		"Lebanon", "Liechtenstein", "SriLanka", "Liberia", "Lesotho",
		"Lithuania", "Luxembourg", "Latvia", "Libya", "Morocco", "Monaco",
		"Moldova", "Montenegro", "Madagascar", "Macedonia", "Mali",
		"Myanmar", "Mongolia", "Martinique", "Mauritania", "Montserrat",
		"Malta", "Mauritius", "Maldives", "Malawi", "Mexico", "Malaysia",
		"Namibia", "Niger", "Nigeria", "Nicaragua", "Netherlands",
		"Norway", "Nepal", "Nauru", "Niue", "Oman", "Panama", "Peru",
		"Philippines", "Pakistan", "Poland", "Portugal", "Palau",
		"Paraguay", "Qatar", "Romania", "Serbia", "Russia", "Rwanda",
		"Seychelles", "Sudan", "Sweden", "Singapore", "Slovenia",
		"Slovakia", "Senegal", "Somalia", "Suriname", "Syria", "Swaziland",
		"Chad", "Togo", "Thailand", "Tajikistan", "Tokelau",
		"Turkmenistan", "Tunisia", "Tonga", "Turkey", "Tuvalu", "Taiwan",
		"Tanzania", "Ukraine", "Uganda", "Uruguay", "Uzbekistan",
		"Venezuela", "Vietnam", "Vanuatu", "Samoa", "Yemen", "Mayotte",
		"Zambia", "Zimbabwe" };

	private static final String name[] = new String[countries.length];

	{
		for (int i = 0; i < name.length; i++)
			name[i] = countries[i].toUpperCase();
	}

	Time time = new Time();

	public Game() {
		setForeground(Color.RED);
		setToolTipText("");
		setLayout(null);

		final javax.swing.Timer timer = new javax.swing.Timer(1000,
				new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				time.decsecond();
				timeLabel.setText(time.printminsec() + "     ");

				if (time.sec() == 0) {

					NewGame.doClick();
					JOptionPane.showMessageDialog(null,
							"Time Over\nU Lost The Game\nThe Word Was:\n\t\t"
									+ name[index]);
				}
			}
		});

		NewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Level.setEnabled(true);
				start.setEnabled(true);

				Q.setEnabled(true);
				W.setEnabled(true);
				E.setEnabled(true);
				R.setEnabled(true);
				T.setEnabled(true);
				Y.setEnabled(true);
				U.setEnabled(true);
				I.setEnabled(true);
				O.setEnabled(true);
				P.setEnabled(true);

				A.setEnabled(true);
				S.setEnabled(true);
				D.setEnabled(true);
				F.setEnabled(true);
				G.setEnabled(true);
				H.setEnabled(true);
				J.setEnabled(true);
				K.setEnabled(true);
				L.setEnabled(true);

				Z.setEnabled(true);
				X.setEnabled(true);
				C.setEnabled(true);
				V.setEnabled(true);
				B.setEnabled(true);
				N.setEnabled(true);
				M.setEnabled(true);

				for (int i = 1; i <= 16; i++) {
					switch (i) {

					case 1:
						label1.setText("");
						break;

					case 2:
						label2.setText("");
						break;

					case 3:
						label3.setText("");
						break;

					case 4:
						label4.setText("");
						break;

					case 5:
						label5.setText("");
						break;

					case 6:
						label6.setText("");
						break;

					case 7:
						label7.setText("");
						break;

					case 8:
						label8.setText("");
						break;

					case 9:
						label9.setText("");
						break;

					case 10:
						label10.setText("");
						break;

					case 11:
						label11.setText("");
						break;

					case 12:
						label12.setText("");
						break;

					case 13:
						label13.setText("");
						break;

					case 14:
						label14.setText("");
						break;

					case 15:
						label15.setText("");
						break;

					case 16:
						label16.setText("");
						break;

					}
				}

				timer.stop();

				chances = 7;
				time.settime(0, 2, 0);
				chancesLabel.setText(chances + "   ");
				timeLabel.setText(time.printminsec() + "     ");

				chancesLabel.setText(chances + "   ");
			}
		});

		JPanel chancesPanel = new JPanel();
		chancesPanel.setBackground(new Color(255, 255, 0));
		chancesPanel.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "CHANCES",
				TitledBorder.LEADING, TitledBorder.TOP, null,
				new Color(0, 0, 0)));
		chancesPanel.setBounds(735, 73, 153, 127);
		add(chancesPanel);
		chancesPanel.setLayout(null);

		chancesLabel.setBounds(12, 23, 129, 80);
		chancesPanel.add(chancesLabel);
		chancesLabel.setForeground(new Color(0, 128, 0));
		chancesLabel.setFont(new Font("Tahoma", Font.PLAIN, 60));

		JPanel timePanel = new JPanel();
		timePanel.setBackground(Color.CYAN);
		timePanel.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "TIME",
				TitledBorder.LEADING, TitledBorder.TOP, null,
				new Color(0, 0, 0)));
		timePanel.setBounds(691, 381, 182, 102);
		add(timePanel);
		timePanel.setLayout(null);

		timeLabel.setBounds(6, 22, 198, 73);
		timePanel.add(timeLabel);
		timeLabel.setForeground(Color.RED);
		timeLabel.setFont(new Font("Tahoma", Font.PLAIN, 45));

		chances = 7;
		time.settime(0, 2, 0);
		chancesLabel.setText(chances + "   ");
		timeLabel.setText(time.printminsec() + "     ");

		JPanel zxcvb = new JPanel();
		zxcvb.setBounds(129, 546, 688, 41);
		add(zxcvb);

		keyHandler handler = new keyHandler();
		zxcvb.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		zxcvb.add(Z);
		Z.addActionListener(handler);

		zxcvb.add(X);
		X.addActionListener(handler);

		zxcvb.add(C);
		C.addActionListener(handler);

		zxcvb.add(V);
		V.addActionListener(handler);

		zxcvb.add(B);
		B.addActionListener(handler);

		zxcvb.add(N);
		N.addActionListener(handler);

		zxcvb.add(M);
		M.addActionListener(handler);

		JPanel asdfg = new JPanel();
		asdfg.setBounds(119, 514, 688, 35);
		add(asdfg);
		asdfg.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		asdfg.add(A);
		A.addActionListener(handler);

		asdfg.add(S);
		S.addActionListener(handler);

		asdfg.add(D);
		D.addActionListener(handler);

		asdfg.add(F);
		F.addActionListener(handler);

		asdfg.add(G);
		G.addActionListener(handler);

		asdfg.add(H);
		H.addActionListener(handler);

		asdfg.add(J);
		J.addActionListener(handler);

		asdfg.add(K);
		K.addActionListener(handler);

		asdfg.add(L);
		L.addActionListener(handler);

		JPanel qwerty = new JPanel();
		qwerty.setBounds(119, 483, 688, 35);
		add(qwerty);
		qwerty.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		qwerty.add(Q);
		Q.addActionListener(handler);

		qwerty.add(W);
		W.addActionListener(handler);

		qwerty.add(E);
		E.addActionListener(handler);

		qwerty.add(R);
		R.addActionListener(handler);

		qwerty.add(T);
		T.addActionListener(handler);

		qwerty.add(Y);
		Y.addActionListener(handler);

		qwerty.add(U);
		U.addActionListener(handler);

		qwerty.add(I);
		I.addActionListener(handler);

		qwerty.add(O);
		O.addActionListener(handler);

		qwerty.add(P);
		P.addActionListener(handler);

		JPanel wordPanel = new JPanel();
		wordPanel.setBackground(Color.WHITE);
		wordPanel.setForeground(Color.WHITE);
		wordPanel.setBorder(new LineBorder(Color.GREEN, 8, true));
		wordPanel.setBounds(0, 249, 900, 90);
		add(wordPanel);

		label1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label7.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label8.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label10.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label11.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label12.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label13.setFont(new Font("Tahoma", Font.PLAIN, 25));
		wordPanel.setLayout(new GridLayout(0, 16, 0, 0));
		wordPanel.add(label1);
		wordPanel.add(label2);
		wordPanel.add(label3);
		wordPanel.add(label4);
		wordPanel.add(label5);
		wordPanel.add(label6);
		wordPanel.add(label7);
		wordPanel.add(label8);
		wordPanel.add(label9);
		wordPanel.add(label10);
		wordPanel.add(label11);
		wordPanel.add(label12);
		wordPanel.add(label13);

		label14.setFont(new Font("Tahoma", Font.PLAIN, 25));
		wordPanel.add(label14);

		label15.setFont(new Font("Tahoma", Font.PLAIN, 25));
		wordPanel.add(label15);

		label16.setFont(new Font("Tahoma", Font.PLAIN, 25));
		wordPanel.add(label16);
		start.setBounds(12, 51, 97, 25);
		add(start);

		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {

				Level.setEnabled(false);

				index = rand.nextInt(name.length);
				System.out.println(name[index]);

				for (int i = 1; i <= name[index].length(); i++) {
					switch (i) {

					case 1:
						label1.setText("__");
						break;

					case 2:
						label2.setText("__");
						break;

					case 3:
						label3.setText("__");
						break;

					case 4:
						label4.setText("__");
						break;

					case 5:
						label5.setText("__");
						break;

					case 6:
						label6.setText("__");
						break;

					case 7:
						label7.setText("__");
						break;

					case 8:
						label8.setText("__");
						break;

					case 9:
						label9.setText("__");
						break;

					case 10:
						label10.setText("__");
						break;

					case 11:
						label11.setText("__");
						break;

					case 12:
						label12.setText("__");
						break;

					case 13:
						label13.setText("__");
						break;

					case 14:
						label14.setText("__");
						break;

					case 15:
						label15.setText("__");
						break;

					case 16:
						label16.setText("__");
						break;

					}
				}
				start.setEnabled(false);
				chancesLabel.setText(chances + "   ");
				timeLabel.setText(time.printminsec() + "     ");
				timer.start();
			}
		});

	}

	private void process() {

		String t;
		t = name[index];
		int j = -1;
		boolean found = false;
		for (int i = 0; i < t.length(); i++) {
			j = t.indexOf(guess, i);

			if (j >= 0) {

				if (j == 0)
					label1.setText(guess);

				else if (j == 1)
					label2.setText(guess);

				else if (j == 2)
					label3.setText(guess);

				else if (j == 3)
					label4.setText(guess);

				else if (j == 4)
					label5.setText(guess);

				else if (j == 5)
					label6.setText(guess);

				else if (j == 6)
					label7.setText(guess);

				else if (j == 7)
					label8.setText(guess);

				else if (j == 8)
					label9.setText(guess);

				else if (j == 9)
					label10.setText(guess);

				else if (j == 10)
					label11.setText(guess);

				else if (j == 11)
					label12.setText(guess);

				else if (j == 12)
					label13.setText(guess);

				else if (j == 13)
					label14.setText(guess);

				else if (j == 14)
					label15.setText(guess);

				else if (j == 15)
					label16.setText(guess);

				j = -1;
				found = true;
				;
			}

		}

		if (!found) {
			--chances;

		}

	}

	private class keyHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {

			guess = event.getActionCommand();
			if (true) {
				process();
				t = (JButton) event.getSource();
				t.setEnabled(false);
				chancesLabel.setText(chances + "   ");

				if (chances == 0) {
					NewGame.doClick();
					JOptionPane.showMessageDialog(null,
							"U Lost The Game\nThe Word Was:\n\t\t"
									+ name[index]);

				}

				else {
					temp = "";
					for (int i = 0; i < name[index].length(); i++) {
						switch (i) {

						case 0:
							temp += label1.getText();
							break;

						case 1:
							temp += label2.getText();
							break;

						case 2:
							temp += label3.getText();
							break;

						case 3:
							temp += label4.getText();
							break;

						case 4:
							temp += label5.getText();
							break;

						case 5:
							temp += label6.getText();
							break;

						case 6:
							temp += label7.getText();
							break;

						case 7:
							temp += label8.getText();
							break;

						case 8:
							temp += label9.getText();
							break;

						case 9:
							temp += label10.getText();
							break;

						case 10:
							temp += label11.getText();
							break;

						case 11:
							temp += label12.getText();
							break;

						case 12:
							temp += label13.getText();
							break;

						case 13:
							temp += label14.getText();
							break;

						case 14:
							temp += label15.getText();
							break;

						case 15:
							temp += label16.getText();
							break;

						}
					}
					System.out.println(temp);
					if (temp.equals(name[index])) {
						NewGame.doClick();
						JOptionPane.showMessageDialog(null,
								"Congratulations \n\t\tU Won!!!");
					}

				}

			}
		}
	}

}