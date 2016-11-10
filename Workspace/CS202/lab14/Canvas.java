package lab14;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

public class Canvas extends JPanel {
	ArrayList<Circle> circles;

	public Canvas() {
		circles = new ArrayList<Circle>();
		this.setSize(new Dimension(800, 800));
	}

	/*
	 * public Canvas(int N) { this(); for (int i = 0; i < N; i++) { addBlue();
	 * addRed(); } }
	 */

	public void update() {
		repaint();
		for (Circle circle : circles) {
			System.out.println(circle);
		}
	}

	private int randomPos() {
		return (int) (Math.random() * 200);
	}

	private int randomRadius() {
		return (int) (Math.random() * 20) + 10;
	}

	public void addBlue(int n) {
		for (int i = 0; i < n; i++) {
			Circle b = new Circle(randomPos(), randomPos(), randomRadius());
			b.ColorBlue();
			circles.add(b);
			update();
		}
	}

	public void addRed(int n) {
		for (int i = 0; i < n; i++) {
			Circle r = new Circle(randomPos(), randomPos(), randomRadius());
			r.ColorRed();
			circles.add(r);
			update();
		}
	}

	public void addGreen(int n) {
		for (int i = 0; i < n; i++) {
			Circle g = new Circle(randomPos(), randomPos(), randomRadius());
			g.ColorGreen();
			circles.add(g);
			update();
		}
	}

	public void addRandom(int n) {
		for (int i = 0; i < n; i++) {
			Circle ran = new Circle(randomPos(), randomPos(), randomRadius());
			Random r1 = new Random();
			int p = r1.nextInt(4);
			if (p == 0) {
				ran.ColorRed();
				circles.add(ran);
				update();
			} else if (p == 1) {
				ran.ColorBlue();
				circles.add(ran);
				update();
			} else if (p == 2) {
				ran.ColorGreen();
				circles.add(ran);
				update();
			} else if (p == 3) {
				ran.ColorBlack();
				circles.add(ran);
				update();
			}
		}
	}

	protected void paintComponent(Graphics pen) {
		super.paintComponent(pen);

		for (Circle circle : circles) {
			pen.setColor(circle.color);
			pen.fillOval(circle.x, circle.y, circle.r, circle.r);
		}
	}

	public void clear() {
		circles.clear();
		update();
	}
}