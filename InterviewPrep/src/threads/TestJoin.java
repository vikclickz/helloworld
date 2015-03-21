package threads;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.TreeSet;

public class TestJoin {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		ArrayList<Integer> list = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();
		set.add(null);
		set.add(11);
		set.add(33);
		set.add(null);
		for (Integer integer : set) {
			System.out.println(integer);
		}
		HashMap<StringBuilder, Integer> test = new HashMap<>();
		StringBuilder sb1 = new StringBuilder();
		sb1.append("testing ");
		test.put(sb1, 11);
		test.put(null, 1233);
		System.out.println(test.get(sb1));
		sb1.append("asd");
		System.out.println("sb value "+sb1);
		System.out.println("after modify"+test.get(new StringBuffer("testing asd")));
		System.out.println("after modify"+test.get(sb1));
		for (StringBuilder a : test.keySet()) {
			System.out.println("value in map :: "+a);
		}
		TreeSet<Integer> ts = new TreeSet<>();
		//ts.add(null);
		ts.add(123);
		Hashtable<String, Integer> t = new Hashtable<>();
		t.put("asd", 11);
		t.put("asd1", 112);
		t.put("asd2", 113);
		Enumeration<Integer> enu = t.elements();
		while(enu.hasMoreElements()){
			System.out.println(enu.nextElement());
		}
		list.add(11);
		list.add(334);
		list.add(44);
		Iterator<Integer> asd = list.iterator();
		while(asd.hasNext()){
			System.out.println(asd.next());
			asd.remove();
		}
		System.out.println(list.size());
	}

}
