package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindDuplicateNum {

		 
	    public int findDuplicateNumber(List<Integer> numbers){
	         
	        int highestNumber = numbers.size() - 1;
	        int total = getSum(numbers);
	        System.out.println("high num"+highestNumber);
	        System.out.println("highest no :: "+(highestNumber*(highestNumber+1)/2));
	        System.out.println("total :: "+total);
	        int duplicate = total - (highestNumber*(highestNumber+1)/2);
	        return duplicate;
	    }
	     
	    public int getSum(List<Integer> numbers){
	         
	        int sum = 0;
	        for(int num:numbers){
	            sum += num;
	        }
	        return sum;
	    }
	     
	    public static void main(String a[]){
	    	Stack<String> s = new Stack<>();
	    	s.add("1");
	    	s.add("2");
	    	s.add("3");
	    	s.remove(1);
	    	for (int i = 0; i < s.size(); i++) {
				System.out.println(s.get(i));
			}
	      /*  List<Integer> numbers = new ArrayList<Integer>();
	        for(int i=1;i<30;i++){
	            numbers.add(i);
	        }
	        //add duplicate number into the list
	        numbers.add(22);
	        numbers.add(13);
	        FindDuplicateNum dn = new FindDuplicateNum();
	        System.out.println("Duplicate Number: "+dn.findDuplicateNumber(numbers));*/
	    }
	}

