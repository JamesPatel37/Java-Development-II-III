package hw4;

public class Ingredients {

	private String name;
	private double quantity;
	private String unit;
	private int topOfStack;
	private Ingredients[] ingr;

	public Ingredients(int N) {
		topOfStack = 0;
		ingr = new Ingredients[N];
	}

	public Ingredients(String nam, String un, double qua) {

		name = nam;
		unit = un;
		quantity = qua;

	}

	public void pushIngredient(Ingredients ing) {
		ingr[topOfStack] = ing;
		topOfStack++;
	}

	public void printIngredient() {
		for (int i = topOfStack - 1; i >= 0; i--) {
			String un = ingr[i].name + " (" + ingr[i].unit + ")";
			String fs = String.format("%-30s %3.2f\t\t%3.2f\t\t%3.2f", un,
					ingr[i].quantity, 2 * ingr[i].quantity,
					5 * ingr[i].quantity);
			System.out.println(fs);
		}
	}
}
