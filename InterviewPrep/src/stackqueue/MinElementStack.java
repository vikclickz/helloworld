package stackqueue;

import java.util.Stack;

public class MinElementStack extends Stack<NodeWithMin> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}
	
	public void push(int value){
		int newMin = Math.min(value, min());
		super.push(new NodeWithMin(value, newMin));
		//super.push("asd");
	}

	private int min() {
		if(this.isEmpty()){
			return Integer.MAX_VALUE;
		}else{
			return peek().min;
		}
	}
	
	

}
