package lab10;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		stackOfIntegers stack = new stackOfIntegers(100);
		Random random = new Random();
		
		stack.push(random.nextInt());
		stack.push(random.nextInt());
		stack.push(random.nextInt());
		
		stack.print();
		stack.pop();
		stack.print();
	}

}
