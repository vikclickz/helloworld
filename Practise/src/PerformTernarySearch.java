
/**
 * CS - 560 Assignment 2 Question 5. b
 * @author Vikrant Mishra
 * RED ID : 818502926
 *
 */
public class PerformTernarySearch {

	// Stores the number of comparisions done.
	public int noOfComparisions = 0;

	/**
	 * This function takes the integer array of random numbers and the key to be
	 * searched using Ternary Search and calls a function that performs ternary
	 * search.
	 * 
	 * @param A
	 * @param key
	 * @return Location of the element searched for else if element not found
	 *         returns -1
	 */
	public int ternarySearch(int[] A, int key) {
		return ternarySearch(A, key, 0, A.length - 1);

	}

	/** TernarySearch function **/
	/**
	 * @param A
	 * @param key
	 * @param start
	 * @param end
	 * @return location of the key in the input array if key is present in the
	 *         array else returns -1. Also calculates the number of comparisions
	 *         done.
	 */
	public int ternarySearch(int[] A, int key, int start, int end) {

		if (start > end)
			return -1;

		/** First boundary: add 1/3 of length to start **/
		int mid1 = start + (end - start) / 3;
		/** Second boundary: add 2/3 of length to start **/
		int mid2 = start + 2 * (end - start) / 3;

		if (A[mid1] == key) {
			return mid1;
		} else if (A[mid2] == key) {
			return mid2;
		}
		/** Search 1st third **/
		else if (key < A[mid1]) {
			noOfComparisions++;
			return ternarySearch(A, key, start, mid1 - 1);
			/** Search 3rd third **/
		} else if (key > A[mid2]) {
			noOfComparisions = noOfComparisions + 2;
			return ternarySearch(A, key, mid2 + 1, end);
			/** Search middle third **/
		} else {
			noOfComparisions = noOfComparisions + 2;
			return ternarySearch(A, key, mid1, mid2);
		}
	}

}
