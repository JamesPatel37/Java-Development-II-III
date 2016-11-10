package project;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ControlPanel extends JPanel {

	private JButton update;
	private JTextField text;
	private IngredientPanel ing;
	private JLabel label;
	private AppMain app;
	private instructionPanel ins;

	public void setInstr(instructionPanel ins) {
		this.ins = ins;
	}

	public void setPanel(IngredientPanel ing) {
		this.ing = ing;
	}

	public ControlPanel() {

		setLayout(new FlowLayout());
		update = new JButton("Update");
		update.addActionListener(new updateAction());

		text = new JTextField("enter number of persons", 20);

		add(update);
		add(text);

	}

	class updateAction implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String num = text.getText();
			int n = Integer.parseInt(num);
			for (int i = 0; i < ing.arraylist.size(); i++) {
				ing.arraylist.get(i).ingred(n);
			}
			StringBuilder sb1 = new StringBuilder();
			sb1.append("<html>");
			// for(IngredientPanel i:ing.arraylist) {
			// System.out.println("hi");
			// System.out.println(i.toString());
			/*
			 * sb1.append(i.toString()).append("<br>"); } sb1.append("</html>");
			 * 
			 * ing.disp(sb1);
			 * 
			 * revalidate();
			 */
			// validate();
			// repaint();
			ing.removeAll();
			ins.removeAll();
			try {
				ing.disp();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			ins.printInstr();
			ing.revalidate();
			ins.revalidate();
			repaint();
			for (int i = 0; i < ing.arraylist.size(); i++) {
				ing.arraylist.get(i).reset(n);
			}
			// ing.process();
		}
	}
}
