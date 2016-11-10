package quiz3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class eastWest extends JFrame {
	JLabel label;
	JLabel label2;
	JPanel pa1;
	JTextField text1;

	public eastWest() {
		setTitle("boring app");
		setLayout(new FlowLayout());
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton east = new JButton("East");
		JButton west = new JButton("West");

		pa1 = new JPanel();
		pa1.add(east);
		pa1.add(west);

		label = new JLabel();
		label2 = new JLabel();

		pa1.add(label);
		pa1.add(label2);

		east.addActionListener(new eastAction());

		west.addActionListener(new westAction());

		getContentPane().add(pa1);

		setVisible(true);

	}

	class eastAction implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			label.setText("EAST");

		}

	}

	class westAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			label2.setText("WEST");

		}

	}

	public static void main(String[] args) {
		new eastWest();
	}
}
