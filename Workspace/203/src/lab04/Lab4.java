package lab04;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Lab4 {

    public static void main(String[] args) {
    	
	    Scanner input = new Scanner(System.in);

        int arr[]= {1,2,3,4,3,2,2,3,3,7,7,7,7,7,7};

        System.out.println("The most frequent number is: " + getFrequent(arr));
        //System.out.println(getFrequentBySorting(arr));
    }

    static public int getFrequent(int arr[]){
        int ans = 0;
        
        Map<Integer,Integer> m = new HashMap<>();
        
        for(int i : arr){
            if(m.containsKey(i)){
                m.put(i, m.get(i)+1);
            }else{
                m.put(i, 1);
            }
        }
        int maxVal = 0;
        for(Integer in : m.keySet()){
            if(m.get(in) > maxVal){
                ans = in;
                maxVal = m.get(in);
            }
        }
        return ans;
    }

    public static int getFrequentBySorting(int arr[]){
        int current = arr[0];
        int ansCount = 0;
        int tempCount = 0;
        int ans = current;
        for(int i : arr){
            if(i == current){
                tempCount++;
            }
            if(tempCount > ansCount){
                ansCount = tempCount;
                ans = i;
            }
            current = i;
        }
        return ans;
    }

}

