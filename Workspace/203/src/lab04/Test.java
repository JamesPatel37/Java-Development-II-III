package lab04;

import java.util.HashMap;
import java.util.Map;



public class Test {

    //Find the most frequent integer in an array

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,3,2,2,3,3,7,7,7,7,7,7};

        System.out.println("The most frequent number is: " + getFrequent(arr));
        //System.out.println(getFrequentBySorting(arr));
    }

    //Using Map , TC: O(n)  SC: O(n)
    static public int getFrequent(int arr[]){
        int ans=0;
        
        Map<Integer,Integer> m = new HashMap<>();
        
        for(int i:arr){
            if(m.containsKey(i)){
                m.put(i, m.get(i)+1);
            }else{
                m.put(i, 1);
            }
        }
        int maxVal=0;
        for(Integer in: m.keySet()){
            if(m.get(in)>maxVal){
                ans=in;
                maxVal = m.get(in);
            }
        }
        return ans;
    }

    //Sort the array and then find it TC: O(nlogn) SC: O(1)
    public static int getFrequentBySorting(int arr[]){
        int current=arr[0];
        int ansCount=0;
        int tempCount=0;
        int ans=current;
        for(int i:arr){
            if(i==current){
                tempCount++;
            }
            if(tempCount>ansCount){
                ansCount=tempCount;
                ans=i;
            }
            current=i;
        }
        return ans;
    }

}

/*
public class Lab4 {

	public static class Count implements Comparable<Count> {
		int value;
		int count;
		public Count(int value) {
			this.value = value;
			this.count = 1;
		}
		public void increment() {
			count++;
		}
		public int compareTo(Count other) {
			return other.count - count;
		}
	}

	public static void main(String args[]) throws Exception {
		Scanner input = new Scanner(new FileInputStream(new File("...")));
		HashMap<Integer, Count> dataset = new HashMap<Integer, Count>();
		while (input.hasNextInt()) {
			int tempInt = input.nextInt();
			Count tempCount = dataset.get(tempInt);
			if (tempCount != null) {
				tempCount.increment();
			} else {
				dataset.put(tempInt, new Count(tempInt));
			}
		}

		List<Count> counts = new ArrayList<Count>(dataset.values());
		Collections.sort(counts);
	}
}
*/

