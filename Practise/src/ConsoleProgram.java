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

public class ConsoleProgram {

	/**
	 * @param args
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void main(String[] args) throws NumberFormatException,
	IOException {

		int Sentinel = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();

		try {
			System.out.println("Enter the Sentinel Value : ");
			Sentinel = Integer.parseInt(br.readLine());

			ReadandDisplay rd = new ReadandDisplay();
			list = rd.read(Sentinel);
			rd.display(list);
			
			/*
			 * Returns a Sorted List using the Merge Sort Algorithm having a
			 * best case time complexity of O(log(n)) and worst case being
			 * O(log(n))
			 */
			ArrayList<Integer> sortedList = new MergeSort().mergeSort(list);
			System.out.println("\nSorted List is : ");
			System.out.println(sortedList + " ");

			SmallLarge sl = new SmallLarge();
			sl.smallest(sortedList);
			sl.largest(sortedList);
			
		} catch (NumberFormatException nfe) {
			System.out.println(nfe.getMessage()
					+ " is not allowed please enter an integer value. ");
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}

	}

}