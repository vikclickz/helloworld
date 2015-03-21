package arrays;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		List<String> inputList = new ArrayList<>();
		inputList.add("60");
		inputList.add("1");
		inputList.add("3");
		inputList.add("5");
		inputList.add("20");
		int[] myArray = new int[inputList.size()];
		int i = 0;
		
	}
	
	

	public int evalRPN(String[] tokens) {

		int returnValue = 0;

		String operators = "+-*/";

		Stack<String> stack = new Stack<String>();

		for (String t : tokens) {
			if (!operators.contains(t)) {
				stack.push(t);
			} else {
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				int index = operators.indexOf(t);
				switch (index) {
				case 0:
					stack.push(String.valueOf(a + b));
					break;
				case 1:
					stack.push(String.valueOf(b - a));
					break;
				case 2:
					stack.push(String.valueOf(a * b));
					break;
				case 3:
					stack.push(String.valueOf(b / a));
					break;
				}
			}
		}

		returnValue = Integer.valueOf(stack.pop());

		return returnValue;

	}
}