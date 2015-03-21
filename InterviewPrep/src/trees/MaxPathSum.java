package trees;

public class MaxPathSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		/*
		 * bst.addNode(50); bst.addNode(10); bst.addNode(55); bst.addNode(99);
		 * bst.addNode(9); bst.addNode(23); bst.addNode(52);
		 */
		bst.addNode(2);
		bst.addNode(3);
		bst.addNode(1);
		maxPathSum(bst.root);

	}
	
	static int max; 
	 
	public static int maxPathSum(TreeNode root) {
		max = (root == null) ? 0 : root.data;
		findMax(root);
		return max;
	}
 
	public static int findMax(TreeNode node) {
		if (node == null)
			return 0;
 
		// recursively get sum of left and right path
		int left = Math.max(findMax(node.leftChild), 0);
		int right = Math.max(findMax(node.rightChild), 0);
 
		//update maximum here
		max = Math.max(node.data + left + right, max);
 
		// return sum of largest path of current node
		return node.data + Math.max(left, right);
	}

}
