//**********************************************************
// Assignment: Program 1
// 
//Employee ID : 90394
// 
//Author: Vikrant Mishra
//
//*********************************************************

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ConsoleTest {

	/**
	 * @param args
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void main(String[] args) throws NumberFormatException,
	IOException {

		int Sentinel = 0;
		int listValue = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		try {
			System.out.println("Enter the Sentinel Value : ");
			Sentinel = Integer.parseInt(br.readLine());

			System.out.println("Enter the List elements");
			do {
				listValue = Integer.parseInt(br.readLine());
				list.add(listValue);
			} while (listValue != Sentinel);

			System.out.println("List Elements Are : ");
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + "  ");
			}
			
			System.out.println("list mid is 1 : "+list.size()/2);
			
			int listmid = list.get(list.size()/2);
			System.out.println("list mid is "+listmid);

			/*
			 * Returns a Sorted List using the Merge Sort Algorithm having a
			 * best case time complexity of O(log(n)) and worst case being
			 * O(log(n))
			 */
			ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(10);
			al.add(5);
			al.add(17);
			al.add(22);
			al.add(44);
			al.add(4);
			for(int i=0;i<al.size();i++){
			System.out.println(al.get(i)+"  ");}
			MergeSortTest mt = new MergeSortTest();
			ArrayList<Integer> sortedList = mt.mergeSort(al);
			System.out.println("\nSorted List is : ");
			System.out.println(sortedList + " ");

			System.out
					.println("Smallest value in the List is : " + sortedList.get(0));
			int largestindex = sortedList.size() - 1; // stores the index of the last
												// element in the list
			System.out.println("Largest value in the List is : "
					+ sortedList.get(largestindex));

		} catch (NumberFormatException nfe) {
			System.out.println(nfe.getMessage()
					+ " is not allowed please enter an integer value. ");
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}

	}

}