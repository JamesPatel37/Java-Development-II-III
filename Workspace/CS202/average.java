import java.util.Scanner;
public class average {

	public static void main(String[] args) {
		int a,b,c;
		double avg;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 numbers \n");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		avg = (a+b+c)/3;
		System.out.println("Average of the three numbers is "+avg);
		s.close();
	}

}
