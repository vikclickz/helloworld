import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/**
 * CS - 560 Assignment 2 Question 5. b
 * 
 * @author Vikrant Mishra RED ID : 818502926
 * 
 */
public class SearchElement {

	/**
	 * The main method performs the search for the random element using binary
	 * and ternary search algorithms and calculates the number of comparisons
	 * for 10 experiments for each array.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int[] sizeArray = new int[] { 500, 1000, 2000, 4000, 8000 };
		int sumOfBin = 0;
		int sumOfTernary = 0;
		int[] avgBinSums = new int[5];
		int[] avgTernSums = new int[5];

		// Generates the map which contains the array name as key and its
		// elements as value
		Map<String, int[]> arrayMap = new LinkedHashMap();

		for (int i = 0; i <= sizeArray.length - 1; i++) {

			arrayMap.put("A" + i, generateArray(sizeArray[i]));

		}

		int randomSearchValue;
		for (int i = 0; i < sizeArray.length; i++) {
			sumOfBin = 0;
			sumOfTernary = 0;
			System.out
					.println("\n --------------- Performing experiments for Array : "
							+ i + " --------------- ");
			System.out
					.println("\n --------------- Experiments Start --------------- ");
			for (int experimentCounter = 0; experimentCounter < 10; experimentCounter++) {

				System.out
						.println("\n --------------- Currently Performing experiment no "
								+ experimentCounter + " --------------- \n");

				randomSearchValue = generateRandomNumbers(arrayMap.get("A" + i).length);
				System.out.println("Random number is :: " + randomSearchValue);

				System.out
						.println("------------ Performing Binary Search on Array "
								+ i + " ------------");
				PerformBinarySearch binSearch = new PerformBinarySearch();
				int midElementLocation = binSearch.binarySearch(
						arrayMap.get("A" + i), randomSearchValue, 0,
						arrayMap.get("A" + i).length - 1);
				if (midElementLocation == -1) {
					System.out
							.println("Element "
									+ randomSearchValue
									+ " was not found in the array : No of comparisions done by binary search : "
									+ binSearch.numberOfComparisions);
				} else {
					System.out.println("The number :: " + randomSearchValue
							+ " was found at location :: " + midElementLocation
							+ " for array of size " + sizeArray[i]);
					System.out
							.println("No of comparisions done by binary search:: "
									+ binSearch.numberOfComparisions);
				}
				sumOfBin = sumOfBin + binSearch.numberOfComparisions;

				System.out
						.println("------------ Performing Ternary Search on Array "
								+ i + " ------------");
				PerformTernarySearch ternSearch = new PerformTernarySearch();
				int midLocation = ternSearch.ternarySearch(
						arrayMap.get("A" + i), randomSearchValue);
				if (midLocation == -1) {
					System.out
							.println("Element "
									+ randomSearchValue
									+ " was not found in the array : No of comparisions done by ternary search: "
									+ ternSearch.noOfComparisions);
				} else {
					System.out.println("The number :: " + randomSearchValue
							+ " was found at location :: " + midLocation
							+ " for array of size " + sizeArray[i]);
					System.out
							.println("No of comparisions done by ternary search :: "
									+ ternSearch.noOfComparisions);
				}
				sumOfTernary = sumOfTernary + ternSearch.noOfComparisions;
			}
			System.out
					.println("\n --------------- Experiments End --------------- \n");

			System.out
					.println("\n --------------- Analysis Report of Comparisions for Array"
							+ i + " :Start:--------------- \n");
			System.out
					.println("Total Number of Comparisions done by Binary Search for Array "
							+ i + " is :: " + sumOfBin);
			System.out
					.println("\nTotal Number of Comparisions done by Ternary Search for Array "
							+ i + " is :: " + sumOfTernary);
			int avgBinSrch = sumOfBin / 10;
			int avgTernarySrch = sumOfTernary / 10;
			System.out
					.println("\nAverage Comparisions for 10 experiments using Binary Search for Array "
							+ i + " is :: " + avgBinSrch);
			System.out
					.println("\nAverage Comparisions for 10 experiments using Ternary Search for Array "
							+ i + " is :: " + avgTernarySrch);
			System.out
					.println("\n --------------- Analysis Report of Comparisions for Array"
							+ i + " :End:--------------- \n");
			avgBinSums[i] = avgBinSrch;
			avgTernSums[i] = avgTernarySrch;
		}

		System.out
				.println("\nComparison Table for Binary Search (BS) and Ternary Search (TS) using data of \n"
						+ "size {500,1000,2000,4000,8000} and conducting 10 experiments for each datum :: \n\n");
		System.out.println("n\tBS\tTS");
		for (int i = 0; i <= sizeArray.length - 1; i++) {

			System.out.print(sizeArray[i] + "\t" + avgBinSums[i] + "\t"
					+ avgTernSums[i]);
			System.out.println();

		}

	}

	/**
	 * This function generates a random number using the size of the array
	 * between the range [0..2n]
	 * 
	 * @param length
	 * @return randomNumber
	 */
	private static int generateRandomNumbers(int length) {

		System.out.println("Generating number between 0 and " + 2 * length);
		int randomNumber = new Random().nextInt(2 * length);
		return randomNumber;
	}

	/**
	 * This function populates the array using the formula A[i] = 2*i where i =
	 * 0,1,2,...n
	 * 
	 * @param sizeOfArray
	 * @return int[] array
	 */
	private static int[] generateArray(int sizeOfArray) {

		int[] randomArray = new int[sizeOfArray];

		for (int i = 0; i < sizeOfArray; i++) {
			randomArray[i] = 2 * i;
		}

		return randomArray;

	}

}
