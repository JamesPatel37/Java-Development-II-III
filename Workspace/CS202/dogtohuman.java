import java.util.Scanner;
public class dogtohuman {

	public static void main(String[] args) {
		int a;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the dog's age ");
		a= s.nextInt();
		System.out.println("The corresponding human age is "+(a*7));
		s.close();
	}

}
