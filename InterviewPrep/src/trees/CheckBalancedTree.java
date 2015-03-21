package trees;

public class CheckBalancedTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.addNode(50);
		bst.addNode(10);
		bst.addNode(55);
		bst.addNode(99);
		bst.addNode(9);
		bst.addNode(23);
		bst.addNode(52);
		//bst.root;
		if(checkHeight(bst.root) == -1){
			System.out.println(false);
		}else{
			System.out.println(true);
		}
		
	}
	
	public static int checkHeight(TreeNode root){
		if(root == null){
			return 0;
		}
		int leftHeight = checkHeight(root.leftChild);
		if(leftHeight == -1){
			return -1;
		}
		int rightHeight = checkHeight(root.rightChild);
		if(rightHeight == -1){
			return -1;
		}
		
		int heightDiff = leftHeight - rightHeight;
		if(Math.abs(heightDiff) > 1){
			return -1;
		}else{
			return Math.max(leftHeight, rightHeight) + 1;
		}
		
	}

}
