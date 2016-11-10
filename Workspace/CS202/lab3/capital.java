package lab3;
import java.util.Scanner;
import java.lang.String;
public class capital {

	public static void main(String[] args) {
		String word;
		System.out.println("Enter a word");
		Scanner s = new Scanner(System.in);
		word = s.next();
		boolean state = Character.isUpperCase(word.charAt(0));
		System.out.println(word + "is " + (state ? "" : "not ") + "capitalised");
		
		s.close();
			
	}

}
