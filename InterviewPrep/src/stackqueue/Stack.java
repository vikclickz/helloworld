package stackqueue;

public class Stack {

	public int top;
	public int[] storage;
	
	public Stack(int capacity){
		if(capacity <= 0){
			throw new IllegalArgumentException("Not a valid capacity");
		}
		storage = new int[capacity];
		top = -1;
	}

	public void push(int data) {
		
		if(top+1 == storage.length){
			storage = copyData(storage);
			top++;
			storage[top] = data;
		}else{
 			top++;
			storage[top] = data;
		}
	}

	private int[] copyData(int[] stack) {
		int[] newStack = new int[stack.length*2];
		for (int i = 0; i < stack.length; i++) {
			newStack[i] = stack[i];
		}
		return newStack;
	}

	public void pop() throws StackException {
		if(top == -1){
			throw new StackException("Stack is Empty");
		}
		top--;
	}
	
	public int peek() throws StackException{
		if(top == -1){
			throw new StackException("Stack is Empty");
		}
		return storage[top];
	}
	
	public int[] getStack(){
		int[] stack = new int[top];
		for (int i = 0; i < stack.length; i++) {
			stack[i] = storage[i];
		}
		return stack;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}

}
