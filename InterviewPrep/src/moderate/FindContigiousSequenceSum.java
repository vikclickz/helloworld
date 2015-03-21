package moderate;

public class FindContigiousSequenceSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {3,-4,-5,4,3,-1};
		System.out.println(getMaxSum(a));

	}
	
	public static int getMaxSum(int[] array){
		int sum = 0;
		int maxSum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
			if(maxSum < sum){
				maxSum = sum;
			}else if(sum < 0){
				sum = 0;
			}
		}
		return maxSum;
	}

}
