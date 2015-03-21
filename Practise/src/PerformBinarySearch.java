
/**
 * CS - 560 Assignment 2 Question 5. b
 * @author Vikrant Mishra
 * RED ID : 818502926
 *
 */
public class PerformBinarySearch {

	// Stores the number of comparisions done.
	public int numberOfComparisions;

	public PerformBinarySearch() {
		// Init number of comparisions to 0
		numberOfComparisions = 0;
	}

	/**
	 * This function performs the binary search for the given key on the array.
	 * 
	 * @param array
	 * @param key
	 * @param left
	 * @param right
	 * @return Location of the element searched for else if element not found
	 *         returns -1
	 */
	public int binarySearch(int[] array, int key, int left, int right) {

		if (left > right) {
			return -1;
		}
		// Calculates the middle element of the array.
		int middle = (left + right) / 2;

		// Verifies whether the middle element is exactly equal to the key. If
		// true returns the middle element location.
		if (array[middle] == key) {
			return middle;
		}
		// Else checks whether the middle element is greater than the key. If
		// true it searches for the key in the lower half of the array otherwise
		// it searches in the upper half.
		else if (array[middle] > key) {
			numberOfComparisions++;
			return binarySearch(array, key, left, middle - 1);
		} else {
			numberOfComparisions++;
			return binarySearch(array, key, middle + 1, right);
		}
	}

}
