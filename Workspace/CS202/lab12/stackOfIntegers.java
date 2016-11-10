package lab12;

public class stackOfIntegers {
	
	private Integer[] integers;
	private int topOfStack;
	
	public stackOfIntegers(int N){
		topOfStack = 0;
		integers = new Integer[N];
	}
	
	public void push(Integer i){
		integers[topOfStack] = i;
		topOfStack++;
	}
	
	public Integer pop(){
		
		return integers[--topOfStack];
	}
	
	public Integer peek(int idx){
		return integers[topOfStack];
	}
	
	public void print() {
		for(int i=topOfStack - 1;i>=0;i--){
			System.out.printf("%d %d\n", i, integers[i]);
		}
	}

}
