package lab9;

public class circle {
	
	double radius = 1.0;
	
	circle() {
		
	}
	
	circle(double newRadius){
		radius = newRadius;
	}

	double getArea(){
		return radius * radius * Math.PI;
	}
	
	public String toString(){
		String message = "I am a circle and my radius is " + radius + " and area is " + getArea();
		return message;
	}
	public static void main(String[] args) {
		
		circle [] circleArray = new circle[10];
		
		/*for(int i = 0;i<circleArray.length;i++){
			circleArray[i] = new circle(i*1.0);
			
		}*/
		
		for( circle Circle : circleArray){
			Circle = new circle();
			System.out.println(Circle);
		}
		
		
	}

}
