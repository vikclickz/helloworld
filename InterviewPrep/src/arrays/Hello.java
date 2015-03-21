package arrays;

import java.util.ArrayList;
import java.util.List;

public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList = new ArrayList<>();
		myList.add("asd");
		myList.add("asd1");
		myList.add("asd2");
		myList.add("asd3");
		hello(myList);
		System.out.println("here");
	}
	
	public static void hello(List<String> myList){
		for (String string : myList) {
			System.out.println(string);
			myList.remove(string);
		}
	}

}
