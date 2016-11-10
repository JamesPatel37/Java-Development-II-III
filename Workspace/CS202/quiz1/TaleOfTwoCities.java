package quiz1;

public class TaleOfTwoCities {

	public static double findDistance(String[] cities, double[][] distances,
			String city1, String city2) {
		double distance = 0.0;
		int IndexOfCity1 = 0, IndexOfCity2 = 0;
		for (int i = 0; i < cities.length; i++) {
			if (city1 == cities[i]) {
				IndexOfCity1 = i;
			} else if (city2 == cities[i]) {
				IndexOfCity2 = i;
			}
		}

		distance = distances[IndexOfCity1][IndexOfCity2];

		return distance;
	}
	
	 public static String findNearestCities(String[] cities,
	            double[][] distances) {
	        String nearestCities = "do not know";
	        int IndexOfCity1 = 0,IndexOfCity2 = 0;
	        double min = 0;

	        for (int i = 0; i < distances.length; i++) {
	            int numCol = distances[i].length;
	            for (int j = 0; j < numCol; j++) { 
	                if (distances[i][j] != 0) {
	                    min = distances[i][j];
	                    break;
	                }
	            }
	            if (min > 0) {
	                break;
	            }
	        }

	        for (int i = 0; i < distances.length; i++) {
	            int numCol = distances[i].length;
	            for (int j = 0; j < numCol; j++) { 
	                if (distances[i][j] < min && distances[i][j] != 0) {
	                    min = distances[i][j];
	                    IndexOfCity1 = j;
		                IndexOfCity2 = i;

	                }
	            }
	        }
	        nearestCities = cities[IndexOfCity1] + "-" + cities[IndexOfCity2];
	        return nearestCities;
	    }

	public static void main(String[] args) {
		double[][] distances = { { 0, 983, 787, 714, 1375, 967, 1087 },
				{ 983, 0, 214, 1102, 1763, 1723, 1842 },
				{ 787, 214, 0, 888, 1549, 1548, 1627 },
				{ 714, 1102, 888, 0, 661, 781, 810 },
				{ 1375, 1763, 1549, 661, 0, 1426, 1187 },
				{ 967, 1723, 1548, 781, 1426, 0, 239 },
				{ 1087, 1842, 1627, 810, 1187, 239, 0 }, };

		String[] cities = { "Chicago", "Boston", "New York", "Atlanta",
				"Miami", "Dallas", "Houston" };

		
		  System.out.println("Nearest two cities: " + findNearestCities(cities,
		  distances));
		  
		
		 

		System.out.println("distance between Atlanta and Chicago is: "
				+ findDistance(cities, distances, "Boston", "New York"));
	}

}
