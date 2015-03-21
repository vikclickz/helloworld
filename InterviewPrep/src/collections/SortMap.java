package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Integer> test = new HashMap<>();
		test.put("asd", 11);
		test.put("asda", 2);
		test.put("asdb", 4);
		test.put("asdc", 3);
		test.put("asdd", 45);
		Set<Entry<String, Integer>> h1 = test.entrySet();
		List<Entry<String, Integer>> sList = new ArrayList<Entry<String,Integer>>(h1);
		Collections.sort(sList, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o1.getValue().compareTo(o2.getValue()));
			}
			
		});
		for(Map.Entry<String, Integer> entry:sList){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }
	}

}
