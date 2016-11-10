package lab13;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiDEMO extends JFrame {
	
	JTextField textField;
	public GuiDEMO() {
		// set frame properties
		setTitle("boring app");
		setLayout( new FlowLayout() );
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// create buttons
		JButton button = new JButton("Ok");
		JButton anotherButton = new JButton("Another Button");

		// create a label
		JLabel label = new JLabel("press something");
		
		// create a text field
		textField = new JTextField("type your name here");
		
		JPanel p1 = new JPanel();		// create a panel
		p1.add(textField);
		p1.add(button); // add button to panel
		p1.add(anotherButton); // add button to panel

		button.addActionListener( new OkAction() );
		anotherButton.addActionListener( new AnotherAction() );
		
		getContentPane().add( p1 ); // add panel to frame
		
		/* at the end */
		
		setVisible(true);
	}
	
	class AnotherAction implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			String message = textField.getText();
			System.out.println("hello " + message);
		}
	}
	
	public static void main(String[] args) {
		new GuiDEMO();
	}
}

class OkAction implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		System.out.println("you pressed the \"Ok\" button");
	}
	
}