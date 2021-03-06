package edu.calstatela.cs203.lab04;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleGui {
	
	SimpleGui() {
		JFrame frame = new JFrame("simple gui");
		frame.setVisible(true);
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create the panel
		JPanel panel = new JPanel();
		
		// create a button widget
		JButton okButton = new JButton("Ok");
		JButton cancelButton = new JButton("Cancel");
		
		// add the button to the panel
		panel.add(okButton);
		panel.add(cancelButton);
		
		// add the panel to the frame
		frame.add(panel);
		
		// to make the widget do something
		// 1. create an action object
		OkAction okAction = new OkAction();
		
		// 2. bind the action object to the widget
		okButton.addActionListener(okAction);
		
		// rinse lather and repeat for the cancel button
		
		CancelAction cancelAction = new CancelAction();
		
		cancelButton.addActionListener(cancelAction);	
	}
	
	public static void main(String args[]) {
		new SimpleGui();
		System.out.println("I am here!");
	}
}

class OkAction implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("OK!");
	}
}

class CancelAction implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("Cancel.");
	}
}
