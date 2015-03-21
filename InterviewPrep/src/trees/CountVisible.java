package trees;

public class CountVisible {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		/*
		 * bst.addNode(50); bst.addNode(10); bst.addNode(55); bst.addNode(99);
		 * bst.addNode(9); bst.addNode(23); bst.addNode(52);
		 */
		bst.addNode(5);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(20);
		bst.addNode(21);
		bst.addNode(1);
		// bst.addNode(52);
		TreeNode node = new TreeNode();
		System.out.println(bst.root.data);
		System.out.println(visibleNodes(bst.root));
	}

	public static int visibleNodes(TreeNode T) {
		return numberOfVisibleNodes(T, Integer.MIN_VALUE);
	}

	public static int numberOfVisibleNodes(TreeNode T, int maxValue) {
		// Base Case defines exit criteria.
		if (T == null) {
			return 0;
		}

		int visibleNodesCount = 0;
		// Checks if the current node being iterated has value greater than max
		// value.
		// If true then updates the max value to current node value.
		if (T.data >= maxValue) {
			visibleNodesCount = 1;
			maxValue = T.data;
		}
		// Calculates the maximum number of visible nodes by visiting the right
		// and left subtree and visiting each node.
		return visibleNodesCount + numberOfVisibleNodes(T.leftChild, maxValue)
				+ numberOfVisibleNodes(T.rightChild, maxValue);
	}

}
