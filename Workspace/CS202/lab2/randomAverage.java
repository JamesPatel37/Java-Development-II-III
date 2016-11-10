package lab2;

public class randomAverage {

	public static void main(String[] args) {
		int a,b,c,d;
		double avg;
		a = (int)(Math.random()*10)+1;
		b = (int)(Math.random()*10)+1;
		c = (int)(Math.random()*10)+1;
		d = (int)(Math.random()*10)+1;
		avg = ((a+b+c+d)/4.0);
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("c= "+c);
		System.out.println("d= "+d);
		System.out.println("Average is "+avg);
	}

}
