package lab11;

import java.util.ArrayList;

 class Ingredient {
	String name;
	double quantity;
	String unit;
	
	public Ingredient(String name,double quantity,String unit){
		this.name = name;
		this.quantity = quantity;
		this.unit = unit;
	}
	
	public String toString(){
		
		return  String.format("%30s (%s) %f",name, unit,quantity);
	}
 }
	
	public class StackNoMore{
		public static void main (String[] args){
			
			ArrayList<Ingredient> arraylist = new ArrayList<Ingredient>();		
			arraylist.add( new Ingredient("celery",1,"stem"));
			arraylist.add( new Ingredient("tomato",3,"kg"));
			arraylist.add( new Ingredient("pinto beans",1,"can"));
			for(Ingredient ingredient: arraylist){
				System.out.println(ingredient);
			}
		}
	}

 
