package lab6;

public class printDaysOfTheWeek {

	public static void main(String[] args) {
		String[] dayOfTheWeek = { "Monday", "Tuesday", "Wednesday", "Thursday",
				"Friday", "Saturday", "Sunday" };
		String order = args[0];
		if (order.equals("backward")) {
			for (int i = dayOfTheWeek.length - 1; i >= 0; i--) {
				System.out.println(dayOfTheWeek[i]);
			}

		} else {
			for (String day : dayOfTheWeek) {

				System.out.println(day);

			}
		}
	}
}
