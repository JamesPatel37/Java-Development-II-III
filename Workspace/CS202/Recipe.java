import java.util.Scanner;
public class Recipe {

	public static void main(String[] args) {
		System.out.println("Chicken Tikka \n");
		System.out.println("Chicken. How many kg? ");
		Scanner s = new Scanner(System.in);
		double chk = s.nextDouble();
		System.out.println("Lemon. How many? ");
		int lem = s.nextInt();
		System.out.println("Yoghurt. How many cups? ");
		double yog = s.nextDouble();
		System.out.println("Garlic. How many grams? ");
		int gar = s.nextInt();
		System.out.println("Black pepper. How many grams? ");
		int bpep = s.nextInt();
		System.out.println("Salt. How many grams? ");
		int salt = s.nextInt();
		System.out.println("How many people are we serving? ");
		int num = s.nextInt();
		System.out.println("Shopping List \n");
		System.out.println( (num*chk) + " kg Chicken \n");
		System.out.println( (num*lem) + " Lemons \n");
		System.out.println( (num*yog) + " Cups of Yoghurt \n");
		System.out.println( (num*gar) + " grams of Garlic \n");
		System.out.println( (num*bpep) + " grams of Black Pepper \n");
		System.out.println( (num*salt) + " grams of Salt \n");
		//System.out.println( chk + "+" + lem + "+" + yog + "" + gar + "" + bpep + "" + salt);
		s.close();
	}

}
