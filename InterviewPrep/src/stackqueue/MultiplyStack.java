package stackqueue;

import java.util.Stack;

public class MultiplyStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(multiplyStack("3+2*4+5"));

	}
	
	public static int multiplyStack(String s){
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '+'){
				
			}else if(s.charAt(i) == '*'){
				int one = stack.pop();
				int two = Character.getNumericValue(s.charAt(i+1));
				int multiplication = one * two;
				stack.push(multiplication);
			}else{
				stack.push(Character.getNumericValue(s.charAt(i)));
			}
		}
		int sum = 0;
		for (int i = 0; i < stack.capacity(); i++) {
			sum = sum + stack.pop();
		}
		return sum;
	}

}
