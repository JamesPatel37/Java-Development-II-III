package lab03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class List {
	
	public static void main(String[] args) {
	
	    Scanner input = new Scanner(System.in);

		 ArrayList<String> list = new ArrayList<String>();
		 
		    //System.out.println("Enter the name:");
		    //String str = input.nextLine();

	        list.add("Tom");
	        list.add("Tom");
	        list.add("Jones");
	        list.add("Sam");
	        list.add("Jamie");
	        list.add("Jamie");
	        list.add("Robie");
	        list.add("Helen");
	        list.add("Tom");
	        list.add("Troy");
	        list.add("Mika");
	        list.add("Jones");
	        list.add("Tom");

	        ArrayList<String> nonDupList = new ArrayList<String>();

	        Iterator<String> duplicate = list.iterator();
	        while(duplicate.hasNext())
	        {
	        	String dupWord = duplicate.next();
	        	
	        	if(nonDupList.contains(dupWord))
	        	{
	        		duplicate.remove();
	        	} else
	        	{
	        		nonDupList.add(dupWord);
	        	}
	        }
	        
	      System.out.println(nonDupList);
	}

}

