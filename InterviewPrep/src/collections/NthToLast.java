package collections;

public class NthToLast {

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
		NodeList node = nthToLast(list._head, 5);
		System.out.println(node.data);
		recurNthToLast(list._head, 5);

	}
	
	public static NodeList nthToLast(NodeList node, int k){
		if(node == null && k <= 0){
		return null;
		}
		NodeList p1 = node;
		NodeList p2 = node;
		for(int i=0; i < k-1;i++){
			if(p2.next != null){
				p2 = p2.next;
			}
		}
		while(p2.next != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		
		return p1;
	}
	
	public static int recurNthToLast(NodeList node, int k){
		
		if(node == null){
			return 0;
		}
		
		int i = recurNthToLast(node.next, k) + 1;
		if(i==k){
			System.out.println(node.data);
		}
		return i;
	}

}
