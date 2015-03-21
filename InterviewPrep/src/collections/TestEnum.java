package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class TestEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<EnumItem> myList = new LinkedList<>();
		myList.add(EnumItem.Prod1);
		myList.add(EnumItem.Prod2);
		myList.add(EnumItem.Prod3);
		myList.add(EnumItem.Prod4);
		System.out.println("Before Sort :: ");
		for (EnumItem enumItem : myList) {
			System.out.println(enumItem.getPrice());
			
		}
		
		Collections.sort(myList, new Comparator<EnumItem>() {

			@Override
			public int compare(EnumItem o1, EnumItem o2) {
				Integer obj = o1.getPrice();
				return obj.compareTo(o2.getPrice());
			}
		
		});
		System.out.println("After Sorting :: ");
		for (EnumItem enumItem : myList) {
			System.out.println(enumItem.getPrice());
			enumItem.setPrice(333);
		}
	}

}
