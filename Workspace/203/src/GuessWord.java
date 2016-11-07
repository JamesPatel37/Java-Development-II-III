import java.util.Scanner;


public class GuessWord {

	String[] wordList = {"apple", "banana", "orange", "mango", "guava"};

	GuessWord() {
	
		for(String words : wordList) {
			System.out.println(words);
		}
		System.out.print("Guess a word: ");
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			
			
			
			
		}
		
		new GuessWord();
	}
}
