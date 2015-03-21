package collections;



public class MergeTwoSortedLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CustomLinkedList list = new CustomLinkedList();
		list.addToTail(1);
		list.addToTail(3);
		list.addToTail(5);
		CustomLinkedList list2 = new CustomLinkedList();
		list2.addToTail(2);
		list2.addToTail(4);
		list2.addToTail(6);
		NodeList listItem = mergeTwoLists(list._head, list2._head);

	}
	
	public static NodeList mergeTwoLists(NodeList l1, NodeList l2){
		 NodeList p1 = l1;
	        NodeList p2 = l2;
	 
	        NodeList fakeHead = new NodeList(0);
	        NodeList p = fakeHead;
	 
	        while(p1 != null && p2 != null){
	          if(p1.data <= p2.data){
	              p.next = p1;
	              p1 = p1.next;
	          }else{
	              p.next = p2;
	              p2 = p2.next;
	          }
	 
	          p = p.next;
	        }
	 
	        if(p1 != null)
	            p.next = p1;
	        if(p2 != null)
	            p.next = p2;
	 
	        return fakeHead.next;
	    }

}
