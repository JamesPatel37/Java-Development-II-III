package app;

import java.util.Scanner;

public class recipe {

	private String ingredient;
	private String unit;
	private double quantity;

	public recipe() {
		ingredient = "";
		unit = "";
		quantity = 0.0;

	}

	public recipe(String ingredient, String unit, double quantity) {
		setIngredient(ingredient);
		setUnit(unit);
		setQuantity(quantity);

	}

	public void setIngredient(String ing) {
		ingredient = ing;
	}

	public void setUnit(String un) {
		unit = un;
	}

	public void setQuantity(double qua) {
		quantity = qua;
	}

	public String getIngredient() {
		return ingredient;
	}

	public String getUnit() {
		return unit;
	}

	public double getQuantity() {
		return quantity;
	}

	public String toString() {
		return (ingredient + "(" + unit + ")" + "\t\t\t" + quantity + "\t\t"
				+ quantity * 2 + "\t\t" + quantity * 5);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		recipe r = new recipe();
		System.out
				.println("Ingredients                     1(person)       2(persons)      5(persons)\n");
		while (s.hasNextLine()) {
			String line = s.nextLine();
			if (line.equals("==end==")) {
				break;
			}
			if (line.startsWith("#")) {
				continue;
			} else {
				r.setIngredient(line);
				r.setQuantity(s.nextDouble());
				r.setUnit(s.nextLine());
				System.out.println(r);
			}
		}

	}

}
