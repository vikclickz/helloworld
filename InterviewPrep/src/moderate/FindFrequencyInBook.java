package moderate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;


public class FindFrequencyInBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String text = "Hello my name iS Vikrant Mishra and I am a name is Testing 123";
		String[] array = text.split(" ");
		Hashtable<String, Integer> t = setupDictionary(array);
		System.out.println(getFrequency(t, "name"));
	}
	
	public static int getFrequency(Hashtable<String, Integer> table, String word){
		if(null == table || null == word){
			return -1;
		}
		word = word.toLowerCase();
		return table.containsKey(word) ? table.get(word) : 0;
	}
	
	public static Hashtable<String, Integer> setupDictionary(String[] book){
		java.util.Hashtable<String, Integer> bookTable = new java.util.Hashtable<>();
		for (String word : book) {
			word = word.toLowerCase();
			if(word.trim() != ""){
				if(bookTable.containsKey(word)){
					bookTable.put(word, bookTable.get(word)+1);
				}else{
					bookTable.put(word, 1);
				}
			}
		}
		return bookTable;
	}

}
