package lab14;

import java.awt.Color;

public class Circle {
	int x;
	int y;
	int r;
	Color color;

	public String toString() {
		return "x = " + x + " y = " + y + " r = " + r + " c = " + color;
	}

	Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
		color = new Color(255, 255, 255);
	}

	Circle() {
		this(100, 100, 10);
	}

	void ColorBlue() {
		color = new Color(0, 0, 255);
	}

	void ColorRed() {
		color = new Color(255, 0, 0);
	}

	void ColorGreen() {
		color = new Color(0, 255, 0);
	}

	void ColorBlack() {
		color = new Color(0, 0, 0);
	}

}
