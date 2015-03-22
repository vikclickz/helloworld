package arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class LongestConsequtiveSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] num = {100,3,200,4,2,1};
		System.out.println(findLongestSequence(num));

	}
	
	public static int findLongestSequence(int[] number){
		if(number == null || number.length <= 1){
			return 1;
		}
		HashSet<Integer> set = new HashSet<>();
		for (Integer integer : number) {
			set.add(integer);
		}
		int count = 0;
		int max = 1;
		for (Integer num : number) {
			
			int left = num - 1;
			int right = num + 1;
			while(set.contains(left)){
				count++;
				set.remove(left);
				left--;
			}
			while(set.contains(right)){
				count++;
				set.remove(right);
				right++;
			}
		}
		max = Math.max(count, max);
		return max;
	}

	/*public static ArrayList<Integer> findLongestSequence(int[] number){
		if(number == null || number.length <= 1){
			return 1;
		}
		HashSet<Integer> set = new HashSet<>();
		for (Integer integer : number) {
			set.add(integer);
		}
		int count = 0;
		int max = 1;
		for (Integer num : number) {
			
			int left = num - 1;
			int right = num + 1;
			while(set.contains(left)){
				count++;
				set.remove(left);
				left--;
			}
			while(set.contains(right)){
				count++;
				set.remove(right);
				right++;
			}
		}
		max = Math.max(count, max);
		return null;
	}*/
}
