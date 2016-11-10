package lab4;

import java.util.Scanner;

public class guessANumberThreeTimes {

	public static void main(String[] args) {
		int lowerBound = 1;
		int upperBound = 10;
		int secretNumber = (int)(Math.random()*upperBound + lowerBound);
		boolean done = false;
		int count = 0;
		Scanner s = new Scanner(System.in);
		while(!done){
			System.out.println("give me a number:");
			int guess = s.nextInt();
			count++;
			if(count > 3){
				System.out.println("You've run out of chances");
				break;
			}
			else{
					if(guess == secretNumber){
						done = true;
						System.out.println("you got it!");
					}
				
					else if(guess < secretNumber)
						System.out.println("a bit higher");
					else
						System.out.println("a bit lower");
			}
		}
		s.close();
	}
	

}
