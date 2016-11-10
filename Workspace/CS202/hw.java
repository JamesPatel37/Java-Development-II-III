import java.util.Scanner;


public class hw {

	public static void main(String[] args) {
		int count=0;
		String ingredient,unit,details=null;
		double quantity;
		boolean done = false;
		Scanner s = new Scanner(System.in);
	    while(s.hasNextLine()){
	    	count++;
	    	
	    	details = s.nextLine();
	    	System.out.println(details+count);
	    }
	    
	    

	}

}
