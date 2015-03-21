package trees;

public class BinaryTreeTest {

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
//		for(int i=0;i<bst.treeSize;i++){
//			System.out.println();
//		}
		System.out.println("tree created"+bst.treeSize);
		bst.traverse();
		bst.delete(55);
		bst.traverse();
	}

}
