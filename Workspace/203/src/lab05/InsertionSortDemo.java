 package lab05;
 
class InsertionSort
{
  public static <T extends Comparable<T>> void insertionSort (T[] list, int size) 
  {
    int outCounter, inCounter;
    T temp;
    // Sorting list[] into increasing order.
    for (outCounter = 1; outCounter < size; outCounter++)
    {
      temp = list[outCounter];
      for (inCounter = outCounter; inCounter > 0 && list[inCounter - 1].compareTo(temp) > 0; inCounter--)
      {
        list[inCounter] = list[inCounter - 1];
      }
      list[inCounter] = temp;
    }
  }
}
 
public class InsertionSortDemo
{
  public static void main (String[] args)
  {
    Integer arr[] = {10, 7, 6, 6, 4, 9, 8, 3, 2, 1};
    InsertionSort.insertionSort(arr, arr.length);
 
    System.out.println("Sorted Array: ");
    for(Integer i : arr)
    {
      System.out.println(i);
    }
  }
  
  
  
}


