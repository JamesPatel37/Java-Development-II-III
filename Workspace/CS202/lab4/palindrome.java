package lab4;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		String word;
		System.out.println("Enter the word");
		Scanner s = new Scanner(System.in);
		word = s.next();
		int size = word.length();
		for(int i = 0;i<size;i++){
			if(word.charAt(i) == word.charAt(size - i - 1)){
				System.out.println("This word is a palindrome");
				break;
			}
			else{
				System.out.println("This word is not a palindrome");
				break;
			}
			
		}
		s.close();		
		
	}

}
