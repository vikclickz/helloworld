package stackqueue;

import java.util.Stack;

public class SortStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<>();
		s.push(23);
		s.push(93);
		s.push(13);
		s.push(53);
		s.push(3);
		s.push(63);
		Stack<Integer> newStack = sortStack(s);
		

	}
	
	public static Stack<Integer> sortStack(Stack<Integer> s){
		Stack<Integer> r = new Stack<Integer>();
		while(!s.isEmpty()){
			int tmp = s.pop();
			while(!r.isEmpty() && r.peek() > tmp){
				s.push(r.pop());
			}
			r.push(tmp);
		}
		return r;
	}

}
