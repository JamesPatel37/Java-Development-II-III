package lab13;

interface Edible {
	public abstract String howToEat();
}

abstract class Spice implements Comparable { 
	protected double hotness;
	/* mutator */
	public void setHotness(double hotness) { this.hotness = hotness; }
	/* accessor */
	abstract public double getHotness();
	
	public int compareTo(Object o) {
		Spice other = (Spice)o;
		if(this.getHotness() == other.getHotness()) {
			return 0;
		}
		else if(this.getHotness() > other.getHotness()) {
			return 1;
		}
		else {
			return -1;
		}
	}
}

class Chili extends Spice implements Edible {
	BlackPepper pep;
	private final boolean state;
	public Chili(boolean state) { this.state = state; }
	public boolean isLiquid() { return (state == true); }

	public double getHotness() {
		return (state == true ? 0.5 * hotness : hotness);
	}
	
	public String toString() {
		String buffer = "chili " + (state == true ? "liquid" : "solid");
		buffer += " " + getHotness();
		return buffer;
	}
	
	public String howToEat() {
		return "sparingly";
	}
}

class BlackPepper extends Spice implements Edible {
	private boolean crushed = false;
	
	public boolean isCrushed() { return crushed; }
	public void crushIt() { crushed = true; }

	public double getHotness() {
		return (crushed == true ? 0.75 * hotness : hotness);
	}
	
	public String toString() {
		String buffer =	"black pepper " 
				+ (crushed == true ? "crushed" : "not crushed")
				+ " " + getHotness();
		
		return buffer;
	}

	public String howToEat() {
		return "generously";
	}
}

abstract class Salt extends Spice {
	public double getHotness() { return 0; }
	public String toString() { return "salt"; }
	public abstract double getSaltiness();
}

class SeaSalt extends Salt implements Comparable {

	public double getSaltiness() {
		return 0;
	}
}

public class AbstractDemo {
	public static void main(String[] args) { 
		Spice chili = new Chili(true);
		Spice pepper = new BlackPepper();
		Spice salt = new SeaSalt();
		
		chili.setHotness(0.5);
		pepper.setHotness(0.5);
		salt.setHotness(0.5);
		
		System.out.println(chili);
		System.out.println(pepper);
		System.out.println(salt);
		
		Spice[] spices = new Spice[10];  /* this is a good true false question */
		spices[0] = new SeaSalt();
	}
}