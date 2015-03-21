package collections;

public class AddNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CustomLinkedList number1 = new CustomLinkedList();
		number1.addToTail(6);
		number1.addToTail(1);
		number1.addToTail(7);
		CustomLinkedList number2 = new CustomLinkedList();
		number2.addToTail(2);
		number2.addToTail(9);
		number2.addToTail(5);
		NodeList number1Node = number1.search(1);
		NodeList number2Node = number2.search(1);
		NodeList addedNumbers = addLists(number1Node, number2Node);
		while(addedNumbers != null){
			System.out.println(addedNumbers.data);
			addedNumbers = addedNumbers.next;
		}
	}
	
	public static NodeList addLists(NodeList list1,NodeList list2){
		NodeList sumList = null;
		boolean doesCarry = false;
		while(list1 != null && list2 != null){
			int numberOne = list1.data;
			int numberTwo = list2.data;
			int listNumber = numberOne+numberTwo;
			if(listNumber%10 > 0){
				doesCarry = true;
			}
			if(sumList == null){
				sumList = new NodeList(listNumber);
			}else{
				while(sumList != null){
					sumList = sumList.next;
				}
				sumList = new NodeList(listNumber);
			}
		}
		
		return null;
	}

}
