package collections;

public class ReverseList {

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
		NodeList node = list.search(1);
		NodeList revNode = reverseList(node);
	
	}
	
	public static NodeList reverseList(NodeList node){
		if(node == null || node.next == null){
			return node;
		}
		
		NodeList remaningList = reverseList(node.next);
		node.next.next = node;
		node.next = null;
		return remaningList;
		
	}

}
