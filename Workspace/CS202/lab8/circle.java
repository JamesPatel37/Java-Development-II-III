package lab8;

public class circle {
	
	double radius = 1.0;
	
	circle() {
		
	}
	
	circle(double newRadius){
		radius = newRadius;
	}

	double getArea(){
		return radius * radius * 3.14;
	}
	public static void main(String[] args) {
		
		circle a = new circle();
		circle b = new circle(2.0);
		System.out.println("area(a) = " + a.getArea());
		System.out.println("area(b) = " + b.getArea());
	}

}
