package hw4;

import java.util.Scanner;

public class recipe {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Ingredients ingr = new Ingredients(100);
		System.out
				.println("Ingredients                   1(person)        2(persons)      5(persons)\n");
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
				Ingredients ing = new Ingredients(line, unit, quantity);
				ingr.pushIngredient(ing);
			}
		}
		ingr.printIngredient();
	}
}