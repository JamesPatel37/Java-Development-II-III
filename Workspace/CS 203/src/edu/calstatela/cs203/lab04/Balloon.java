package edu.calstatela.cs203.lab04;

import java.awt.Color;

public class Balloon implements BalloonProperties {

	static int balloonCounts = 0;
	
	private final int id;

	private Color color;

	private int x;
	private int y;

	private double vx;
	private double vy;
	
	private double radius;

	private boolean exist;

	/* constructors */

	Balloon() {
		int R = randomColor();
		int G = randomColor();
		int B = randomColor();

		color = new Color(R,G,B);
		x = randomPosition();
		y = randomPosition();
		vx = randomVelocity();
		vy = randomVelocity();
		radius = randomRadius();
		exist = true;
		id = balloonCounts;
		balloonCounts++;
	}

	/* accessors */
	double getRadius() {
		return radius;
	}
	
	double X() {
		return x;
	}
	
	double Y() {
		return y;
	}
	
	Color getColor() {
		return color;
	}
	
	public String toString() {
		String buffer = "";
		buffer += "id = " + id + " ";
		buffer += "(x,y) = (" + x + "," + y + ") ";
		buffer += "(vx,vy) = (" + vx + "," + vy + ") ";
		buffer += "(R,G,B) = (" + color.getRed() + "," + color.getGreen() + "," + color.getBlue() + ")";
		return buffer;
	} 
	
	private double randomRadius() {

		return RADIUS_MIN + Math.random() * (RADIUS_MAX - RADIUS_MIN);
	}

	public boolean isExist() {
		return exist == true;
	}
	
	/* mutators */
	
	public void drift(int t) {
		double dx = (int) (vx * t);
		double dy = (int) (vy * t);
		x += dx;
		y += dy;
	}
	
	public void drift() {
		final int T = 1;
		drift(T);
	}
	
	public void drift(Balloon[] balloons) {
		// 1. update the velocity based on the distance between 
		// itself and the neighbors... (bonus come up with a complex
		// collision model -- challenge yourself!)
		
		// for each neighbor:
		//    compute distance between my center (x,y) and my
		//    neighbor's center (x,y), if distance <= r1 + r2
		//    then update my velocity: vx = vx * -1, vy = vy * -1
		//    and done checking
		
		for (Balloon neighbor : balloons) {
			if (neighbor == this) {
				continue;
			}
			// do your collision math here
		}
		
		// 2. call drift()
		drift();
	}		

	private double randomVelocity() {
		return Math.random() * VELOCITY_MIN;
	}

	private int randomPosition() {
		return (int) (Math.random() * 200);
	}

	private int randomColor() {
		return (int) (Math.random() * 255);
	}

	/* main method */
	
	public static void main(String[] args) {
		final int N = 3; 
		Balloon[] balloons = new Balloon[N]; 
		
		for (int i = 0; i < N; i++) {
			balloons[i] = new Balloon();
		}
		
		try {
			balloons[N].drift();
		} catch(Exception ex) {
			// this time: do nothing!
			System.out.println("hey dude, can't drift this");
			ex.printStackTrace();
		}
		
		try {
			System.out.println(balloons[N]);
		} catch(Exception ex) {
			System.out.println("hey dude, can't print this");
		}
	}

}