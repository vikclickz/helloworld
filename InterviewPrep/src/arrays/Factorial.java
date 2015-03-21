package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//int[] test = {2,3,4};
		int[] test = {3,1024,2048,1048576};
		int[] res = countTwos(test);
		for (int i = 0; i < test.length; i++) {
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int value = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static int fact(int x){
		int factNumber = x;
		if(x == 1){
			return 1;
		}
		factNumber = factNumber * fact(factNumber-1);
		
		return factNumber;
	}
	
	static int factorial( int N )
	{
	  int product = 1;
	  for ( int j=1; j<=N; j++ )
	    product *= j;
	  return product;
	}
	
	static int[] countTwos(int[] arr) {
        if(null == arr || arr.length == 0){
        	return null;
        }
        //Intialize the result array.
        int[] resultArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
        	//Condition to check if number is divisible by 2. Adds 1 to result array if number is divisible by 2 else 0.
			if(arr[i]%2 == 0){
				resultArray[i] = 1;
			}else{
				resultArray[i] = 0;
			}
		}
        return resultArray;
    }

}
