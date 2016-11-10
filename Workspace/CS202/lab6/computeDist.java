package lab6;

public class computeDist {
	
	
	public static double findMin(double [][] distances){
		
		double min = Double.MAX_VALUE;
		
		for(int i=0;i<distances.length;i++){
			
			for(int j=0;j<distances[i].length;j++){
				if(min<distances[i][i] && distances[i][j] != 0){
					min = distances[i][j];
				}
			}
		}
		return min;
	}

	public static void main(String[] args) {
		double[][] distances = {
				  {0, 983, 787, 714, 1375, 967, 1087}, 
				  {983, 0, 214, 1102, 1763, 1723, 1842}, 
				  {787, 214, 0, 888, 1549, 1548, 1627}, 
				  {714, 1102, 888, 0, 661, 781, 810}, 
				  {1375, 1763, 1549, 661, 0, 1426, 1187}, 
				  {967, 1723, 1548, 781, 1426, 0, 239}, 
				  {1087, 1842, 1627, 810, 1187, 239, 0},
				};
		double max = distances[0][0],min = distances[0][0];
		//double [][] max = 
		for(int i=0;i<7;i++){
			for(int j=0;j<7;j++){
				
					
					if(distances[i][j] > max){
						max = distances[i][j];
				}
					
						
					
			}
			
		}
		double min1 = findMin(distances);
		System.out.println(max);
		System.out.println(min1);
	}

}
