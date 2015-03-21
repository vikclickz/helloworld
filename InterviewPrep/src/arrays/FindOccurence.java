package arrays;

import java.util.Arrays;

public class FindOccurence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a = {1,2,3,4,5,5,5,6,7,7,7};
		int[] a = {0,-1,-3,4,4};
		//int[] a = {20,10,30,30,40,10};
		System.out.println(findMostPopularOccurence(a));
	}
	
	public static int findMostPopularOccurence(int[] A) {

		int previous = A[0];
	    int frequentMember = A[0];
	    int occuranceCount = 1;
	    int maxOccurance = 1;
		
		//Verify whether the array is empty or not intialized.
	    if (A == null || A.length == 0){
	        return 0;
	    }
	    //Sort the array. Using Quicksort method of Arrays Class. Complexity: O(nlgn)
	    Arrays.sort(A);
	    
	    for (int i = 1; i < A.length; i++) {
	    	//Verifies if the current element is equal to previous element and increments the count.
	        if (A[i] == previous)
	        	occuranceCount++;
	        else {
	        	//If occurance of the previous elment is greater than the maxium occurance 
	        	//recorded so far then update the value.
	            if (occuranceCount > maxOccurance) {
	            	frequentMember = A[i-1];
	            	maxOccurance = occuranceCount;
	            }
	            previous = A[i];
	            occuranceCount = 1;
	        }
	    }
	    
	    return occuranceCount > maxOccurance ? A[A.length-1] : frequentMember;
	}

}
