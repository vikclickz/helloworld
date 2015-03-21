import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Prog  {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		System.out.println("test :: "+24%5);
		String s = "45 22";
		StringTokenizer token = new StringTokenizer(s, " ");
		while (token.hasMoreElements()) {
			String string1 = (String) token.nextElement();
			System.out.println(string1);
		}
		/*Pattern pattern = Pattern.compile("^[0-9]*$");
		Matcher match;
		match = pattern.matcher(s);
		System.out.println(match.matches());*/
		/*
		int Sentinel=0;
		int line=-100;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();
		Iterator iterator = list.iterator();
		

		
		
		System.out.println("Enter the Sentinel Value : ");
		Sentinel = Integer.parseInt(br.readLine());
		
		
		System.out.println("Enter the List elements");
		do   
		{   
			line = Integer.parseInt(br.readLine());
			list.add(line);
		}while(line != Sentinel);
		
		System.out.println("List Elements Are : ");
		for (int i=0; i< list.size(); i++) 
        { 
                System.out.print( list.get(i)+"  " ); 
        }
		
		Collections.sort(list);
		System.out.println("Sorted List is : ");
		System.out.println(list+" ");
		
		
		System.out.println("Smallest Element of the List is : "+list.iterator().next());
		int largestindex = list.size()-1;
		System.out.println("Largest Element of the List is : "+list.get(largestindex));

		*/
		

	}

}