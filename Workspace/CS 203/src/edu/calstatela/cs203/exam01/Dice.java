package edu.calstatela.cs203.exam01;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Dice {
	
	Timer timer;
	RollingAction ra;
	int previous;
	int current;
	
	class StartTimer implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			timer.start();
		}
	}

	class StopTimer implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			timer.stop();
			if (current == previous) {
				System.out.println("Winner!");
			} else {
				System.out.println("Losser!");
			}
		}
	}

	class RollingAction implements ActionListener 
	{
		public void roll() { 
		} 
		
		public void actionPerformed(ActionEvent e) {
			previous = current;
		    current = (int)(Math.random() * 6) + 1;
			System.out.println("      " + current + "                " + previous);
		}

	}

	class CanvasPanel extends JPanel 
	{
		private static final long serialVersionUID = 1L;
		protected void paintComponent(Graphics pen) {
			super.paintComponent(pen);
			pen.setColor(Color.RED);
			pen.drawString("Number:", current, previous);
		}
	}

	Dice() {
		JFrame frame = new JFrame("Rolling Dice");
		frame.setVisible(true);
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		ra = new RollingAction();
		
		timer = new Timer(2000, ra);
		
		JButton startButton = new JButton("Start");
		startButton.addActionListener(new StartTimer());
		
		JButton stopButton = new JButton("Stop");
		stopButton.addActionListener(new StopTimer());
		
		panel.add(startButton);
		panel.add(stopButton);

		frame.add(panel);
	}
	
	public static void main(String args[]) {
		new Dice();
		System.out.println("Roll your Dice");
		System.out.println();
		System.out.println("Current Dice     Previous Dice");
	}

}


