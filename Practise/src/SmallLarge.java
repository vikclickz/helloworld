import java.util.ArrayList;

public class SmallLarge {

	/* Display's the Smallest element in the ArrayList */
	public void smallest(ArrayList<Integer> list) {

		System.out.println("Smallest value in the List is : " + list.get(0));

	}

	/* Display's the Largest element in the ArrayList */
	public void largest(ArrayList<Integer> list) {

		int largestindex = list.size() - 1; // stores the index of the last
		// element in the list
		System.out.println("Largest value in the List is : "
				+ list.get(largestindex));

	}

}
