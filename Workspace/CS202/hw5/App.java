package hw5;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class App extends JFrame {

	JTextField textfield;
	JTextArea tarea;
	Ingredients ingr;
	private int numClicks = 0;

	public App() {

		setTitle("Recipe App");
		setLayout(new FlowLayout());
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tarea = new JTextArea();
		JButton button = new JButton("Submit");
		textfield = new JTextField("Enter number of persons");

		JPanel p1 = new JPanel();
		p1.add(textfield);
		p1.add(button);
		p1.add(tarea);
		ingr = new Ingredients();
		button.addActionListener(new submitAction());
		

		getContentPane().add(p1);

		setVisible(true);

	}

	class submitAction implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String str = textfield.getText();
			int n = Integer.parseInt(str);
			tarea.setText("Ingredients for " + n + " person(s)\n");
			for (int i = 0; i < ingr.arraylist.size(); i++) {
				ingr.arraylist.get(i).ingred(n);
			}
			for (Ingredients ingredient : ingr.arraylist) {
				tarea.append(ingredient.toString());
			}
			for (int i = 0; i < ingr.arraylist.size(); i++) {
				ingr.arraylist.get(i).reset(n);
			}

		}

	}

	public static void main(String[] args) {
		new App();

	}
}
