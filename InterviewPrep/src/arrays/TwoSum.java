package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] test = {2,10,7,11,15};
		int target = 9;
		int[] result = twoSums(test, target);
		for (int i : result) {
			System.out.println(i);
		}
	}

	
	
	    public static int[] twoSums(int[] numbers, int target) {
	        int[] indexOfNumbers = new int[2];
	        Map<Integer,Integer> valuesMap = new HashMap<>();
	        
	        for (int i = 0; i < numbers.length; i++) {
				if(valuesMap.containsKey(numbers[i])){
					int index = valuesMap.get(numbers[i]);
					indexOfNumbers[0] = index + 1;
					indexOfNumbers[1] = i + 1;
				}else{
					valuesMap.put(target - numbers[i], i);
				}
			}
	        
	        return indexOfNumbers;
	    }
	    
	
}
