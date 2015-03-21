package arrays;

import java.io.*;
import java.util.Stack;

public class Main2 {
  public static void main(String[] args) throws IOException {
    
    String[] inputArray = {"5","*","20","-","60","+","3","-","1"};
    if(42 == getPermutations(inputArray)){
    	System.out.println("YES");
    }
  }
  
  public static int getPermutations(String[] inputArray){
      String operators = "*/-+";
      int returnValue = 0;
      Stack<String> stack = new Stack<String>();
      for(String s : inputArray){
          if (!operators.contains(s)) {
				stack.push(s);
			} else {
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				int index = operators.indexOf(s);
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


