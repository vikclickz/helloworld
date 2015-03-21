package arrays;

import strings.ReverseString;

public class FindDuplicateNumberInRange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] a = {1,2,3,3,4};
		System.out.println(findDuplicateNumber(a));
		String test = "abcd";
		System.out.println(reverseString(test));

	}
	static String reverse = "";
	private static String reverseString(String test) {
		if(test.length() == 1){
			return test;
		}else{
		
		reverse += test.charAt(test.length()-1) + reverseString(test.substring(0,test.length()-1));
		}
		return reverse;
	}
	

	public static int findDuplicateNumber(int[] input){
		int heighestNumber = input.length -1;
		int total = getSum(input);
		int duplicate = (total - (heighestNumber*(heighestNumber + 1)/2));
		return duplicate;
	}

	private static int getSum(int[] input) {
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum += input[i];
		}
		return sum;
	}
}
