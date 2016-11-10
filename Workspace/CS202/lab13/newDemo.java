package lab13;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class newDemo extends JFrame {
	JTextField textfield1;
	JButton button1,button2;
	public newDemo() {
		
		
		setTitle("myApp");
		setLayout(new FlowLayout());
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("OK");
		button2 = new JButton("new");
		textfield1 = new JTextField("Enter your name");
		
		JPanel panel = new JPanel();
		panel.add(textfield1);
		panel.add(button1);
		panel.add(button2);
		button2.addActionListener(new Another());
		button1.addActionListener( new Okaction() );
		getContentPane().add(panel);
		
		setVisible(true);
		
		
	}
	
	class Okaction implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			String message = textfield1.getText();
			System.out.println("Hello " + message);
		}

	}
	
	public static void main(String[] args) {
		new newDemo();
	}
}

class Another implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		System.out.println("you pressed the \"Ok\" button");
	}
	
}
