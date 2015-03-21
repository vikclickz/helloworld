package collections;

public class PartitionList {

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
		//NodeList node = list.search(1);
		//partitionList(23, node);
		NodeList testNode = partion4Pointer(23, list._head);
	}
	
	public static NodeList partion4Pointer(int x, NodeList node){
		if(node == null){
			return null;
		}
		NodeList beforeStart = null;
		NodeList afterStart = null;
		NodeList beforeEnd = null;
		NodeList afterEnd = null;
		while(node != null){
			NodeList next = node.next;
			node.next = null;
			if(node.data < x){
				if(beforeStart == null){
					beforeStart = node;
					beforeEnd = beforeStart;
				}else{
					beforeEnd.next = node;
					beforeEnd = beforeEnd.next;
				}
			}else{
				if(afterStart == null){
					afterStart = node;
					afterEnd = afterStart;
				}else{
					afterEnd.next = node;
					afterEnd = afterEnd.next;
				}
			}
			node = next;
		}
		if(beforeStart == null){
			return afterStart;
		}
		beforeEnd.next = afterStart;
		return beforeStart;
	}
	
	public static void partitionList(int x, NodeList node){
		if(node == null){
			return;
		}
		NodeList beforeNode = null;
		NodeList afterNode = null;
		while(node != null){
			NodeList nextNode = node.next;
			node.next = null;
			if(node.data < x){
					node.next = beforeNode;
					beforeNode = node;
			}else{
				node.next = afterNode;
				afterNode = node;
			}
			node = nextNode;
		}
		System.out.println("asd");
	}

}
