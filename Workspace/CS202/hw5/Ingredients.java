package hw5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ingredients {
	private String name;
	private double quantity;
	private String unit;
	private int persons;
	ArrayList<Ingredients> arraylist;

	public Ingredients() {
		Scanner s = new Scanner(System.in);
		arraylist = new ArrayList<Ingredients>();
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

				arraylist.add(new Ingredients(name, unit, quantity));
			}
		}
	}

	public Ingredients(String nam, String un, double qua) {
		name = nam;
		unit = un;
		quantity = qua;
	}

	public void ingred(int n) {
		quantity = quantity * n;
	}
	
	public void reset(int n) {
		quantity = quantity/n;
	}

	public String toString() {
		return name + "" + quantity + "(" + unit + ")\n";
	}
}
