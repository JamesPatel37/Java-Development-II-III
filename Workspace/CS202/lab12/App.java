package lab12;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		stackOfIntegers stack = new stackOfIntegers(2);
		Random random = new Random();
		
		try{
			stack.push(random.nextInt());
			stack.push(random.nextInt());
			stack.push(random.nextInt());
		} catch (Exception e) {
			e.printStackTrace();
		}
		stack.print();
		stack.pop();
		stack.print();
	}

}
