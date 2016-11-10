package lab6;

public class forEachDay {

	public static void main(String[] args) {
		String [] dayOfTheWeek = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		//im only interested in days that start with t and s
		
		for(String day: dayOfTheWeek ){
			if(day.charAt(0) == 'T' || day.charAt(0) == 'S'){
				System.out.println(day);
			}
		}
	}

}
