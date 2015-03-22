package arrays;

public class MaxContigiousSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] test = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSum(test));
	}
	
	public static int maxSum(int[] array){
		int max = array[0];
		int[] sum = new int[array.length];
		sum[0] = array[0];
		for (int i = 1; i < sum.length; i++) {
			sum[i] = Math.max(array[i], sum[i-1] + array[i]);
			max = Math.max(max, array[i]);
		}
		return max;
	}

}
