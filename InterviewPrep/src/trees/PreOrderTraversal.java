package trees;

import java.util.ArrayList;

public class PreOrderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.addNode(50); bst.addNode(10); bst.addNode(55); bst.addNode(99);
		 bst.addNode(9); bst.addNode(23); bst.addNode(52);
		 //preOrderTraversal(bst.root);
		 for (Integer i : traversalList) {
			System.out.print(i+" ");
		}

	}
	static ArrayList<Integer> traversalList = new ArrayList<>();
	public static void preOrderTraversal(TreeNode root){
		traversalList.add(root.data);
		if(root.leftChild != null){
			preOrderTraversal(root.leftChild);
		}
		if(root.rightChild != null){
			preOrderTraversal(root.rightChild);
		}
		
	}

}
