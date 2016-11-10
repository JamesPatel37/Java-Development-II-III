package lab9;

import java.util.Random;

public class randomCircles {
	
	double radius = 1.0;
	randomCircles() {
		
	}
	
	randomCircles(double newRadius){
		radius = newRadius;
	}
	
	public double getArea(){
		double area = radius * radius * Math.PI;
		return area;
	}

	public String toString(){
		String message = "I am a circle and my radius is " + radius + " and area is " + getArea();
		return message;
	}
	
	
	
	public static void main(String[] args) {
		Random random1 = new Random();
		double min = Double.MAX_VALUE;
		randomCircles [] c = new randomCircles[20];
		for(int i = 0;i<c.length;i++){
			c[i] = new randomCircles(random1.nextInt(100) * 1.0);
			if(c[i].getArea() < min && c[i].getArea() != 0){
				min = c[i].getArea();
			}
			
			System.out.println(c[i]);
			
		}
		
		System.out.println("the least area is " + min);
	}

}
