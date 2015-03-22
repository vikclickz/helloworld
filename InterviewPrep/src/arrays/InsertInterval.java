package arrays;

import java.util.ArrayList;

public class InsertInterval {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Interval> inputList = new ArrayList<>();
		inputList.add(new Interval(1, 2));
		inputList.add(new Interval(3, 5));
		inputList.add(new Interval(6, 7));
		inputList.add(new Interval(8,10));
		inputList.add(new Interval(12,16));
		Interval newInterval = new Interval(4, 9);
		for (Interval interval : insert(inputList,newInterval)) {
			System.out.print(interval.start);
			System.out.print(interval.end);
			System.out.println();
		}

	}

	
	public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		 
        ArrayList<Interval> result = new ArrayList<Interval>();
 
        for(Interval interval: intervals){
            if(interval.end < newInterval.start){
                result.add(interval);
            }else if(interval.start > newInterval.end){
                result.add(newInterval);
                newInterval = interval;        
            }else if(interval.end >= newInterval.start || interval.start <= newInterval.end){
                newInterval = new Interval(Math.min(interval.start, newInterval.start), Math.max(newInterval.end, interval.end));
            }
        }
 
        result.add(newInterval); 
 
        return result;
    }

}
