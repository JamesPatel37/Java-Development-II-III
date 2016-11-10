
import java.util.Scanner;
public class addition {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number\n");
		a= s.nextInt();
		System.out.println("Enter second number\n");
		b= s.nextInt();
		s.close();
		c=a+b;
		System.out.println("result is "+c);
	}

}
