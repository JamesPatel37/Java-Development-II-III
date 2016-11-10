package lab5;

import java.util.Scanner;

public class printIngredient {
	
	public static void printIngredient(String ing, double quantity, String unit){
		//System.out.printf("%s  (%s)  %f  %f  %f ",ing,unit,quantity,2*quantity,5*quantity);
		String un = ing + " (" + unit + ")";
		String fs = String.format("%-30s %3.2f\t\t%3.2f\t\t%3.2f", un,quantity,2*quantity,5*quantity);
		System.out.println(fs);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the ingredient\n");
		String ingredient = s.next();
		System.out.println("Enter the Quantity\n");
		double quantity = s.nextDouble();
		System.out.println("Enter the Unit\n");
		String unit = s.next();
		
		printIngredient(ingredient,quantity,unit);
	}

}
