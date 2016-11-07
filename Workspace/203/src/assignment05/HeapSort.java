package assignment05;

/**
 *  A simple priority queue interface and a class implementing the interface with a heap.
 */

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;

interface PurePriorityQueue<E>
{
  int size();
  boolean isEmpty();
  void add(E element);
  // Returns a high-priority element without removing it.
  E getMin();
  // Removes a high-priority element.
  E removeMin();
}

public class HeapSort<E extends Comparable<? super E>>
   implements PurePriorityQueue<E>
{
  private static final int INIT_CAP = 10;
  private ArrayList<E> list;

  public HeapSort()
  {
    list = new ArrayList<E>(INIT_CAP);
  }

  public HeapSort(int aSize)
  {
     if ( aSize < 1 )
	throw new IllegalStateException();
     list = new ArrayList<E>(aSize);
  }

  public int size()
  {
    return list.size();
  }

  public boolean isEmpty()
  {
    return list.isEmpty();
  }

  public void add(E element)
  {
    if ( element == null )
      throw new NullPointerException("add");
    list.add(element); // append it to the end of the list
    percolateUp(); // move it up to the proper place
  }

  // move the last element up to the proper place.
  private void percolateUp()
  {
     int child = list.size() - 1; // last element in the list
     int parent;
     while ( child > 0 )
     {
       parent = (child - 1) / 2; // use the (j-1)/2 formula
       if ( list.get(child).compareTo(list.get(parent)) >= 0 )
          break;
       swap(parent, child);
       child = parent;
     }
  }

  private void swap(int parent, int child)
  {
    E tmp = list.get(parent);
    list.set( parent, list.get(child) );
    list.set(child, tmp);
  }

  public E getMin()
  {
    if ( list.isEmpty() )
      throw new NoSuchElementException();
    return list.get(0);
  }

  public E removeMin()
  {
    if ( list.isEmpty() )
      throw new NoSuchElementException();
    E minElem = list.get(0); // get the min element at the root
    list.set(0, list.get(list.size() - 1) ); // copy the last element to the root
    list.remove( list.size() - 1 ); // remove the last element from the list
    if ( ! list.isEmpty() )
     percolateDown(0); // move the element at the root down to the proper place
    return minElem;
  }

  // Move the element at index start down to the proper place.
  private void percolateDown(int start)
  {
    if ( start < 0 || start >= list.size() )
      throw new RuntimeException("start < 0 or >= n");
    int parent = start;
    int child = 2 * parent + 1; // use the 2*i+1 formula
    while ( child < list.size() )
    {
      if ( child + 1 < list.size() &&
           list.get(child).compareTo(list.get(child + 1)) > 0 )
          child++; // select the smaller child
      if ( list.get(child).compareTo(list.get(parent)) >= 0 )
          break; // reach the proper place
      swap(parent, child);
      parent = child;
      child = 2 * parent + 1;
    }
  }

// Heap Sort

  public static <E extends Comparable<? super E>> void heapSort(List<E> aList)
  {
    if ( aList.isEmpty() ) return;
    HeapSort<E> aHeap = new HeapSort<E>(aList.size());
    for ( E element : aList )
        aHeap.add(element);
    aList.clear();
    while ( ! aHeap.isEmpty() )
      aList.add( aHeap.removeMin() );
  } // repeatedly remove the smallest element in the heap and add it to the list.

  public static void main(String[] args)
  {
	  HeapSort<Integer>  pq = new HeapSort<Integer>();
     pq.add(10);
     pq.add(15);
     pq.add(20);
     pq.add(30);
     pq.add(25);
     pq.add(25);
     pq.add(30);
     pq.add(40);
     pq.add(35);
     pq.add(50);
     pq.add(10);
     while ( ! pq.isEmpty() )
     { 
       System.out.println( pq.removeMin() );
     }

     List<String>  alist = new ArrayList<String>();
     alist.add("TGA");
     alist.add("ACG");
     alist.add("GCT");
     alist.add("GTA");
     System.out.print( "Before sorting: " + alist.toString() );
     heapSort(alist);
     System.out.println( "After sorting: " + alist.toString() );
  }
} // Heap