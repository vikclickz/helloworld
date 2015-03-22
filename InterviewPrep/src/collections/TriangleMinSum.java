package collections;

import java.util.ArrayList;

public class TriangleMinSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		ArrayList<Integer> t = new ArrayList<>();
		t.add(2);
		ArrayList<Integer> t1 = new ArrayList<>();
		t1.add(3);
		t1.add(4);
		ArrayList<Integer> t2 = new ArrayList<>();
		t2.add(5);
		t2.add(6);
		t2.add(7);
		ArrayList<Integer> t3 = new ArrayList<>();
		t3.add(4);
		t3.add(1);
		t3.add(8);
		t3.add(3);
		list.add(t);
		list.add(t1);
		list.add(t2);
		list.add(t3);
		System.out.println(minimumTotal(list));
	}
	
	public static int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
		int[] total = new int[triangle.size()];
		int l = triangle.size() - 1;
	 
		for (int i = 0; i < triangle.get(l).size(); i++) {
			total[i] = triangle.get(l).get(i);
		}
	 
		// iterate from last second row
		for (int i = triangle.size() - 2; i >= 0; i--) {
			for (int j = 0; j < triangle.get(i + 1).size() - 1; j++) {
				total[j] = triangle.get(i).get(j) + Math.min(total[j], total[j + 1]);
			}
		}
	 
		return total[0];
	}

}
