package arrays;

import java.util.ArrayList;

public class Sum3 {
	
	ArrayList<Integer> array = new ArrayList<>();
	/**
	 * Adds/appends list of integers at the end of internal list.
	 */
	public void addLast(int[] list) {
		if(null == list || list.length == 0){
			return;
		}
		for (int i = 0; i < list.length; i++) {
			array.add(list[i]);
		}
	}

	/**
	 * Returns boolean representing if any three consecutive integers in the
	 * internal list have given sum.
	 */
	public boolean containsSum3(int sum) {
		
		for (int i = array.size()-1; i-2 >= 0 ; i--) {
			int first = array.get(i);
			int second = array.get(i-1);
			int third = array.get(i-2);
			int total = first + second + third;
			if(total == sum){
				return true;
			}
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		Sum3 s = new Sum3();

		s.addLast(new int[] { 1, 2, 3 });

		System.out.println(s.containsSum3(6));
		System.out.println(s.containsSum3(9));

		s.addLast(new int[] { 4 });

		System.out.println(s.containsSum3(9));
	}
}