package trees;

import java.util.LinkedList;

public class FindFriendDepth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.addNode(50); bst.addNode(10); bst.addNode(55); bst.addNode(99);
		 bst.addNode(9); bst.addNode(23); bst.addNode(52);
		 
//		bst.addNode(2);
//		bst.addNode(3);
//		bst.addNode(1);
		 System.out.println(friendDepth(bst.root, bst.find(23)));

	}
	
	public static int friendDepth(TreeNode n,TreeNode destNode){
		if(n == null){
			return 0;
		}
		LinkedList<TreeNode> list = new LinkedList<>();
		LinkedList<Integer> depth = new LinkedList<>();
		list.add(n);
		int value = 1;
		while(!list.isEmpty()){
			TreeNode t = list.poll();
			
			if(t.data == destNode.data){
				return value + 1;
			}
			if(t.leftChild != null){
				list.add(t.leftChild);
				
			}
			if(t.rightChild!=null){
				list.add(t.rightChild);
			}
			value++;
		}
		return 0;
	}

}
