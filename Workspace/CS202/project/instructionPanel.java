package project;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class instructionPanel extends JPanel {
	private JLabel label4;
	private StringBuilder sb2;
	private JRadioButton radio;
	private String file;
	private ArrayList<String> alist;
	private Image backgroundImage;
	private String fileName;
	public instructionPanel() {
		setLayout(new GridLayout(10, 1));
		fileName = "/Users/anandsuresh/Desktop/recipe.jpg";
		// Scanner in = new Scanner(System.in);
		// fileRead(file);
	}

	public instructionPanel(String file) {
		this.file = file;
	}

	public void fileRead(String file) throws Exception {
		backgroundImage = ImageIO.read(new File(fileName));
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String instr;
		sb2 = new StringBuilder();
		sb2.append("<html>");
		alist = new ArrayList<String>();
		while ((instr = br.readLine()) != null) {
			if (instr.equals("==end==")) {
				break;
			} else {
				// System.out.println(instr);
				/*
				 * JLabel label4 = new JLabel(); label4.setText(instr); add(
				 * label4 ); revalidate();
				 */
				alist.add(instr);
				// sb2.append(instr).append("<br>");
			}
		}
		sb2.append("</html>");

	}

	public void printInstr() {
		ButtonGroup bg = new ButtonGroup();
		
		for (String s : alist) {
			radio = new JRadioButton(s.toString());
			add(radio);
			bg.add(radio);
		}
	}
	
	public void paintComponent(Graphics g) {
	    super.paintComponent(g);

	    g.drawImage(backgroundImage, 0, 0, this);
	  }

}
