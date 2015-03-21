package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import stackqueue.Stack;
import stackqueue.StackException;

public class StackTest {

	Stack myStack;
	@Before
	public void setUp() throws Exception {
		myStack = new Stack(3);
		myStack.push(22);
		myStack.push(12);
		myStack.push(44);
		myStack.push(55);
		myStack.push(33);
		myStack.push(54);
	}

	@After
	public void tearDown() throws Exception {
		myStack = null;
	}

	@Test
	public void testPush() {
		int[] testStack = {22,12,44,55,33,54};
		assertArrayEquals(testStack, myStack.storage);
	}
	@Test
	public void testPop() throws StackException{
		myStack.pop();
		assertTrue("Same", myStack.top == 4);
	}
	
	@Test
	public void testGetStack(){
		int[] value = myStack.getStack();
		for (int i = 0; i < value.length; i++) {
			System.out.println(value[i]);
		}
		
	}
	
	@Test
	public void testPeek() throws StackException{
		assertTrue("Valid peek", myStack.peek() == myStack.storage[myStack.top]);
	}

}
