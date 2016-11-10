package lab4;

import java.util.Scanner;

public class guessANumber {

	public static void main(String[] args) {
		int lowerBound = 1;
		int upperBound = 10;
		int secretNumber = (int)(Math.random()*upperBound + lowerBound);
		boolean done = false;
		Scanner s = new Scanner(System.in);
		while(!done){
			System.out.println("give me a number:");
			int guess = s.nextInt();
			
			if(guess == secretNumber){
				done = true;
				System.out.println("you got it!");
			}
			
			else if(guess < secretNumber)
				System.out.println("a bit higher");
			else
				System.out.println("a bit lower");
			}
		s.close();
		}

}
