package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeOverlappingIntervals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Interval> inputList = new ArrayList<>();
		inputList.add(new Interval(1, 3));
		inputList.add(new Interval(2, 6));
		inputList.add(new Interval(8, 10));
		inputList.add(new Interval(15,20));
		for (Interval interval : mergeInterval(inputList)) {
			System.out.print(interval.start);
			System.out.print(interval.end);
			System.out.println();
		}

	}
	
	public static ArrayList<Interval> mergeInterval(ArrayList<Interval> intervals){
		if(intervals == null || intervals.size() == 0){
			return intervals;
		}
		ArrayList<Interval> result = new ArrayList<>();
		Collections.sort(intervals, new Comparator<Interval>() {

			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.start - o2.start;
			}
			
		});
		Interval prev = intervals.get(0);
		for (int i = 1; i < intervals.size(); i++) {
			Interval current = intervals.get(i);
			if(prev.end >= current.start){
				Interval merged = new Interval(prev.start, Math.max(prev.end, current.end));
				prev = merged;
			}else{
				result.add(prev);
				prev = current;
			}
		}
		result.add(prev);
		return result;
	}

}
