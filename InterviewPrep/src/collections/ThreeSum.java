package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	ArrayList<ArrayList<Integer>> result = threeSum(new int[]{-1,0,1,2,-1,-4});	
	System.out.println(result);
	}
	
	public static ArrayList<ArrayList<Integer>> threeSum(int[] numbers){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if(numbers.length<3){
			return result;
		}
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length-2; i++) {
			if(i==0 || numbers[i] > numbers[i-1]){
			int negate = -numbers[i];
			int start = i + 1;
			int end = numbers.length-1;
			while(start < end){
				if(numbers[start] + numbers[end] == negate){
					ArrayList<Integer> temp = new ArrayList<>();
					temp.add(numbers[i]);
					temp.add(numbers[start]);
					temp.add(numbers[end]);
					result.add(temp);
					start++;
					end--;
					while(start < end && numbers[start] == numbers[start -1]){
						start++;
					}
					while(start < end && numbers[end] == numbers[end + 1]){
						end--;
					}
				}else if(numbers[start] + numbers[end] < negate){
					start++;
				}else{
					end--;
				}
			}
			}
			
		}
		return result;
	}

}
