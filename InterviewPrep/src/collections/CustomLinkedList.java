package collections;

public class CustomLinkedList {
	
	public NodeList _head;
	public int listSize = 0;
	
	public void addToTail(int data){
		
		if(_head== null){
			_head = new NodeList(data);
			listSize++;
		}else{
			NodeList traversingNode = _head;
			while(traversingNode.next != null){
				traversingNode = traversingNode.next;
			}
			traversingNode.next = new NodeList(data);
			listSize++;
		}
	}
	
	public boolean remove(int index){
		
		if(index>listSize || index < 1){
			return false;
		}else{
			NodeList traversingNode = _head;
			for(int i = 1; i<index-1; i++){
				traversingNode = traversingNode.next;
			}
			traversingNode.next = traversingNode.next.next;
			listSize--;
		}
		
		return false;
	}
	
	public NodeList search(int index){
		if(index>listSize || index<1){
			return null;
		}
		NodeList traversingNode = _head;
		for(int i=1; i<index;i++){
			traversingNode = traversingNode.next;
		}
		
		return traversingNode;
	}

}
