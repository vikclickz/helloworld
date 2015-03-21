package collections;

public class DeleteNode {

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
		System.out.println(list.search(3).data);
		deleteNode(list.search(3));
		System.out.println(list.search(3).data);
        
	}
	
	public static boolean deleteNode(NodeList n){
		if(n == null || n.next == null){
			return false;
		}
		
			n.data = n.next.data;
			n.next = n.next.next;
		
		return true;
	}

}
