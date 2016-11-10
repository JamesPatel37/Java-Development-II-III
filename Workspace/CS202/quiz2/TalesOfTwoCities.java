package quiz2;

import java.util.ArrayList;

class City {
    private String name = "undefined";
    private ArrayList<City> neighbors = new ArrayList<City>();

    public City() {
    }

    public City(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public ArrayList<City> getNeighbors() {
        return neighbors;
    }

    public void addNeighbor(City neighbor) {
        neighbors.add(neighbor);
    }

    public String Name() {
        return name;
    }
}

class State {
    private String name = "undefined";
    private ArrayList<City> cities = new ArrayList<City>();

    public State() {
        /* default constructor */
    }

    public State(String name) {
        this.name = name;
    }

    City findCity(String name) {
    	 
    	for(int i = 0;i<cities.size();i++){
    		if(cities.contains(name)){
    			return(cities.get(i));
    		}
    	}
        /* 
         * write code to find the city of a state 
         * 5 points
         * 
         */

        /* not found */
        return null;
    }
    
    public String toString() {
    	
    	return("State :" + name);
        /*
         * modify this method so that it returns the name of the state
         * 5 points
         * 
         */
    }

    public void addCity(City city) {
    	
    	cities.add(city);
        /*
         * write code to add the city to a state
         * 5 points
         * 
         */
    }

    public void printCities() {
    	
    	for (City names: cities){
    		System.out.println(names + " ");
    	}
        /*
         * write code to print all the cities in a state
         * 5 points
         * 
         */
    }

    public boolean isNeighbor(State otherState) {
    	ArrayList<City> thisCities = this.cities;
    	
    	ArrayList<City>temp1;
    	ArrayList<City>temp2;
    	
    	ArrayList<City> otherCities = otherState.cities;
    	
    	for(City names: thisCities){
    		temp1 = names.getNeighbors();
    		
    		for(City nam: otherCities){
    			temp2 = nam.getNeighbors();
    			
    				
    			}
    		
    		}
    	
    	
        /*
         * write code to test to see if the other state is a neighbor
         * 20 points
         * 
         */
        return false;
    }
}

public class TalesOfTwoCities {
	 private static ArrayList<City> cities = new ArrayList<City>();

	    private static void printNeighbors(City city) {
	        System.out.print(city.Name() + ": ");
	        for (City neighbor : city.getNeighbors() ) {
	            System.out.print(neighbor + " ");
	        }
	        System.out.println("");
	    }

	    public static void main(String[] args) {
	        City NewYorkCity = new City( "new york" );
	        City Philadelphia = new City( "philadelphia" );
	        City Boston = new City( "boston" );

	        cities.add( NewYorkCity );
	        cities.add( Philadelphia );
	        cities.add( Boston );
	        /* 
	         * Define relationships
	         * 
	         * New York is a neighbor of Philadelphia
	         * New York is a neighbor of Boston
	         * Boston is not a neighbor of Philadelphia
	         * 
	         */

	        NewYorkCity.addNeighbor( Boston );
	        NewYorkCity.addNeighbor( Philadelphia );
	        Boston.addNeighbor( NewYorkCity );
	        Philadelphia.addNeighbor( NewYorkCity );
	        
	        

	        /* 
	         * print out all of the cities 
	         * 
	         */

	        for (City city : cities) {
	            System.out.println(city);
	        }

	        /* 
	         * print out all of the neighbors 
	         * 
	         */
	        printNeighbors( NewYorkCity );
	        printNeighbors( Philadelphia );
	        printNeighbors( Boston );

	        /*
	         * State 
	         * 
	         */

	        State Pennsylvania = new State("pennsylvania");
	        Pennsylvania.addCity( Philadelphia );

	        State NewYorkState = new State("new york");
	        NewYorkState.addCity( NewYorkCity );

	        State Massachusett = new State("massaschusett");
	        Massachusett.addCity( Boston );

	        /*
	         * test to see if the two states are neighbors
	         * a state is a neighbor if there they have one or more cities
	         * that are neighbors
	         */

	        System.out.println(Pennsylvania + " and " + NewYorkState + " are neighbors: " + Pennsylvania.isNeighbor( NewYorkState ));
	        System.out.println(Pennsylvania + " and " + Massachusett + " are neighbors: " + Pennsylvania.isNeighbor( Massachusett ));
	        System.out.println(NewYorkState + " and " + Massachusett + " are neighbors: " + NewYorkState.isNeighbor( Massachusett ));
	    }
	    
}
