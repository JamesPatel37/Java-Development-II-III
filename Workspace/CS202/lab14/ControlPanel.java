package lab14;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ControlPanel extends JPanel {
	private JButton redButton;
	private JButton blueButton;
	private JButton clearButton;
	private Canvas canvasRef;
	private JTextField textfield;
	private JButton greenButton;
	private JButton randomButton;

	public void setCanvas(Canvas canvasRef) {
		this.canvasRef = canvasRef;
	}

	public ControlPanel() {
		redButton = new JButton("red");
		redButton.addActionListener(new redAction());

		blueButton = new JButton("blue");
		blueButton.addActionListener(new blueAction());

		greenButton = new JButton("green");
		greenButton.addActionListener(new greenAction());

		randomButton = new JButton("random");
		randomButton.addActionListener(new randomAction());

		clearButton = new JButton("clear");
		clearButton.addActionListener(new clearAction());

		textfield = new JTextField("Enter number of circles");

		add(textfield);
		add(redButton);
		add(blueButton);
		add(greenButton);
		add(randomButton);
		add(clearButton);
	}

	class redAction implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("red button");
			String num = textfield.getText();
			int n = Integer.parseInt(num);
			canvasRef.addRed(n);
		}
	}

	class blueAction implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("blue button");
			String num = textfield.getText();
			int n = Integer.parseInt(num);
			canvasRef.addBlue(n);
		}
	}

	class greenAction implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			System.out.println("green button");
			String num = textfield.getText();
			int n = Integer.parseInt(num);
			canvasRef.addGreen(n);
		}

	}

	class randomAction implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			System.out.println("random button");
			String num = textfield.getText();
			int n = Integer.parseInt(num);
			canvasRef.addRandom(n);
		}

	}

	class clearAction implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("clear button");
			canvasRef.clear();
		}
	}

}
