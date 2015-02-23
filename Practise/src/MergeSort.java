import java.util.ArrayList;

public class MergeSort {
	public ArrayList<Integer> mergeSort(ArrayList<Integer> list) {
		ArrayList<Integer> split1 = new ArrayList<Integer>();
		ArrayList<Integer> split2 = new ArrayList<Integer>();
		ArrayList<Integer> sorted1 = new ArrayList<Integer>();
		ArrayList<Integer> sorted2 = new ArrayList<Integer>();
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		if (list.size() <= 1) {
			return list;
		} else {
			/*Divides the arraylist into smaller subarray's*/
			for (int i = 0; i < list.size(); i++) {  
				int element = list.get(i);
				if (i < list.size() / 2) {
					split1.add(element);
				} else {
					split2.add(element);
				}
			}
			sorted1 = mergeSort(split1);
			sorted2 = mergeSort(split2);
			sorted = new Merge().merge(sorted1, sorted2);
			return sorted;
		}
	}
}
