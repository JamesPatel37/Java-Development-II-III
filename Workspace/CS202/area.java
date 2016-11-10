import java.util.Scanner;
public class area {

	public static void main(String[] args) {
		int radius,side;
		double carea,sqArea,reqArea;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter radius of circle \n");
		radius = s.nextInt();
		carea = 3.1415*radius*radius;
		side = 2*radius;
		sqArea = side*side;
		reqArea = sqArea-carea;
		System.out.println("Area of circle is "+carea);
		System.out.println("Area of square is "+sqArea);
		System.out.println("Required area is "+reqArea);
		s.close();
	}

}
