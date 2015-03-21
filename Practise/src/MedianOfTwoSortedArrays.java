	import java.util.Scanner;

public class MedianOfTwoSortedArrays {
	 
	
	    public static void main(String[] args) 
	    {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter number of elements in arrays");
//	        int N = scan.nextInt();
	        int[] arr1;
	        int[] arr2;
	       /* System.out.println("Enter "+ N +" elements of array 1");
	        for (int i = 0; i < N; i++)
	            arr1[i] = scan.nextInt();
	        System.out.println("Enter "+ N +" elements of array 2");
	        for (int i = 0; i < N; i++)
	            arr2[i] = scan.nextInt();*/
	        arr1 = new int[]{11,23,33,34};
	        arr2 = new int[]{2,3,4,45};
	        
	        int med = median(arr1, arr2);
	        System.out.println("Median = "+ med);
	     }
	     public static int median(int[] arr1, int[] arr2)
	     {
	         int N = arr1.length;
	         System.out.println("size of array 1 :: median :: "+N);
	         return median(arr1, 0, N -1 , arr2, 0, N - 1);
	     }
	     public static int median(int[] arr1, int l1, int h1, int[] arr2, int l2, int h2)
	     {
	         int mid1 = (h1 + l1 ) / 2;
	         int mid2 = (h2 + l2 ) / 2;
	 
	         if (h1 - l1 == 1)
	             return (Math.min(arr1[h1] , arr2[h2]));
	         else if (arr1[mid1] > arr2[mid2])
	             return median(arr1, l1, mid1 , arr2, mid2 , h2);    
	         else
	             return median(arr1, mid1 , h1, arr2, l2 , mid2 );    
	     }     
	
}
