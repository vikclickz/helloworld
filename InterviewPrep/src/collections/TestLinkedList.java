package collections;

import java.util.Collections;
import java.util.LinkedList;

public class TestLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CustomLinkedList list = new CustomLinkedList();
		list.addToTail(2);
		list.addToTail(4);
		list.addToTail(25);
		list.addToTail(22);
		list.addToTail(44);
		list.addToTail(1);
		list.addToTail(26);
		list.addToTail(29);
		System.out.println(list.listSize);
		list.remove(2);
		System.out.println(list.listSize);
		System.out.println(list.search(3).data);
		LinkedList<NodeList> llist = new LinkedList<>();
		llist.add(new NodeList(22));
		llist.add(new NodeList(25));
		llist.add(new NodeList(4));
		llist.add(new NodeList(15));
		Collections.sort(llist, new NodeComparator());
		for (NodeList nodeList : llist) {
			System.out.println(nodeList.data);
		}

	}

}
