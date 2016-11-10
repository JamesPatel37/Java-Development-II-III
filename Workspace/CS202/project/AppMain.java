package project;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class AppMain extends JFrame {

	private ControlPanel cref;
	private IngredientPanel pref;
	private static instructionPanel iref;

	public AppMain()  {

		setTitle("Recipe Generator");
		setLayout(new GridLayout(3, 1));
		setSize(800, 800);
		
		//this.getContentPane().setBackground(Color.YELLOW);
		
		cref = new ControlPanel();
		pref = new IngredientPanel();
		iref = new instructionPanel();

		cref.setPanel(pref);

		cref.setInstr(iref);

		add(cref);
		add(pref);
		add(iref);
		//setBackground(Color.CYAN);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public static void main(String[] args) throws Exception {

		AppMain app = new AppMain();
		String file = args[0];
		// iref = new instructionPanel(file);
		iref.fileRead(file);
		// app.revalidate();
	}
}
