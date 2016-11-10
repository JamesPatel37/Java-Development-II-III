package project;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IngredientPanel extends JPanel {

	// private JLabel label;
	private String name;
	private double quantity;
	private String unit;
	public ArrayList<IngredientPanel> arraylist;
	private JLabel label2, label3;
	private JCheckBox cbox;
	private String file;
	private Image backgroundImage2;

	public IngredientPanel() {
		
		setLayout(new GridLayout(10, 0));
		file = "/Users/anandsuresh/Desktop/ingredients.jpg";
		// setLayout(new GridLayout(5,0));
		// setLayout(new FlowLayout());
		Scanner s = new Scanner(System.in);
		arraylist = new ArrayList<IngredientPanel>();
		while (s.hasNextLine()) {
			String line = s.nextLine();
			if (line.equals("==end==")) {
				break;
			}
			if (line.startsWith("#")) {
				continue;
			} else {
				String name = line;
				double quantity = s.nextDouble();
				String unit = s.nextLine();
				/*
				 * JLabel label = new JLabel(); label.setText("\n" + name +
				 * quantity + unit + "\n"); add( label );
				 */
				arraylist.add(new IngredientPanel(name, unit, quantity));
			}
		}
		// process();
	}

	public IngredientPanel(String nam, String un, double qua) {
		name = nam;
		unit = un;
		quantity = qua;
	}

	public void process() {
		// StringBuilder sb = new StringBuilder();
		// sb.append("<html>");
		for (IngredientPanel i : arraylist) {
			// sb.append(i.toString()).append("<br>");
		}
		// sb.append("</html>");
		// System.out.println(sb.toString());
	}

	public void disp() throws IOException {
		//setBackground(Color.GREEN);
		backgroundImage2 = ImageIO.read(new File(file));
		for (IngredientPanel i : arraylist) {
			cbox = new JCheckBox(i.toString());
			add(cbox);
		}
	}

	public String toString() {
		return name + "" + quantity + "(" + unit + ")\n";
	}

	public void ingred(int n) {
		quantity = quantity * n;
	}

	public void reset(int n) {
		quantity = quantity / n;
	}
	
	public void paintComponent(Graphics g) {
	    super.paintComponent(g);

	    g.drawImage(backgroundImage2, 0, 0, this);
	  }

}
