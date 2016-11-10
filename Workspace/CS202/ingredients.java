import java.lang.String;
import java.util.Scanner;

public class ingredients {

	public static void main(String[] args) {
		// System.out.println(args.length);
		boolean done = false;
		Scanner s = new Scanner(System.in);
		System.out
				.println("Ingredients                   1(person)        2(persons)      5(persons)\n");
		while (!done) {

			String line = s.nextLine();
			if (line.equals("==end==")) {
				break;
			}
			if (line.startsWith("#")) {
				continue;
			} else {

				String ingredient = line;
				double quantity = s.nextDouble();
				String unit = s.nextLine();
				String un = ingredient + " (" + unit + ")";
				String fs = String.format("%-30s %3.2f\t\t%3.2f\t\t%3.2f", un,
						quantity, 2 * quantity, 5 * quantity);
				System.out.println(fs);
			}
		}
	}

}
