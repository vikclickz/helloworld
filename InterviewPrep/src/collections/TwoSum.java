package collections;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] res = twoSum(new int[]{2,3,7,11}, 9);
		System.out.println(res[0]);
		System.out.println(res[1]);

	}
	
	public static int[] twoSum(int[] numbers,int target){
		Map<Integer, Integer> map = new HashMap<>();
		int[] result = new int[2];
		for (int i = 0; i < numbers.length; i++) {
			if(map.containsKey(numbers[i])){
				int index1 = map.get(numbers[i]);
				result[0] = index1+1;
				result[1] = i+1;
				break;
			}else{
				map.put(target - numbers[i], i);
			}
		}
		return result;
	}

}
