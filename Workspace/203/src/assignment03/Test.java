package assignment03;

import javax.swing.JFrame;

public class Test {
	public static void main(String args[]) {

		Game a = new Game();

		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(a);
		f.setSize(920, 700);
		f.setVisible(true);
		f.setTitle("Guess a Country Name ??");
		f.setResizable(false);
	}
}