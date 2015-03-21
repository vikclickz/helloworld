package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {1,1,1,3,4,5,5,6};
		Set<Integer> noDups = new HashSet<>();
		Integer[] result = new Integer[a.length];
		for (int i = 0; i < a.length; i++) {
			result[i] = Integer.valueOf(a[i]);
		}
		noDups.addAll(Arrays.asList(result));
		int[] test = removeDups(a);
	}
	
	public static int[] removeDups(int[] input){
		
		int j = 0;
		int i = 1;
		while(i < input.length){
			if(input[i] == input[j]){
				i++;
			}else{
				input[++j] = input[i++];
			}
		}
		int[] outputArray = new int[j+1];
		for (int j2 = 0; j2 < outputArray.length; j2++) {
			outputArray[j2] = input[j2];
		}
		return outputArray;
	}

}
