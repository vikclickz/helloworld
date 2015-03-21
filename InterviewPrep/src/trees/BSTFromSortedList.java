package trees;

import collections.CustomLinkedList;
import collections.NodeList;

public class BSTFromSortedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CustomLinkedList list = new CustomLinkedList();
		list.addToTail(2);
		list.addToTail(4);
		list.addToTail(6);
		list.addToTail(8);
		list.addToTail(10);
		list.addToTail(12);
		list.addToTail(14);
		BSTFromSortedList a = new BSTFromSortedList();
		TreeNode root = a.sortedListToBST(list._head);

	}
	
	static NodeList h;
	 
	public TreeNode sortedListToBST(NodeList head) {
		if (head == null)
			return null;
 
		h = head;
		int len = getLength(head);
		return sortedListToBST(0, len - 1);
	}
 
	// get list length
	public int getLength(NodeList head) {
		int len = 0;
		NodeList p = head;
 
		while (p != null) {
			len++;
			p = p.next;
		}
		return len;
	}
 
	// build tree bottom-up
	public TreeNode sortedListToBST(int start, int end) {
		if (start > end)
			return null;
 
		// mid
		int mid = (start + end) / 2;
 
		TreeNode left = sortedListToBST(start, mid - 1);
		TreeNode root = new TreeNode(h.data);
		h = h.next;
		TreeNode right = sortedListToBST(mid + 1, end);
 
		root.leftChild = left;
		root.rightChild = right;
 
		return root;
	}

}
