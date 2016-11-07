package assignment02;

class Person implements Comparable<Person> {
	private int age;
	private String name;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person p) {
		return p.age - this.age;
	}
}

public class BinarySearch {

	private BinarySearch() {
	}

	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
		int low = 0;
		int high = list.length - 1;
		while (low <= high) {
			// Key is in a[low..high] or not present.
			int mid = low + (high - low) / 2;
			if (key.compareTo(list[mid]) < 0)
				high = mid - 1;
			else if (key.compareTo(list[mid]) > 0)
				low = mid + 1;
			else
				return mid;
		}
		return -1;
	}

	public static void main(String args[]) {
		Person personArray[] = new Person[10];
		Person toBeFound = new Person("Joe", 5);
		// fill the array here
		int x = BinarySearch.binarySearch(personArray, toBeFound);
		if (x == -1)
			System.out.println("Not found");
		else
			System.out.println(x);
	}
}