import java.util.Arrays;
import java.util.Scanner;

public class sortIngredients {

	public static void main(String[] args) {
		boolean done = false;
		int i = 0;
		String[] list = new String[6];
		Scanner s = new Scanner(System.in);
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

				String ingredient = line;
				double quantity = s.nextDouble();
				String unit = s.nextLine();
				list[i] = ingredient + "(" + unit + ")" + "\t\t\t" + quantity
						+ "\t\t" + quantity * 2 + "\t\t" + quantity * 5;
				i++;

			}

		}

		Arrays.sort(list);
		for (int j = 0; j < list.length; j++) {
			System.out.println(list[j]);
		}

	}

}
