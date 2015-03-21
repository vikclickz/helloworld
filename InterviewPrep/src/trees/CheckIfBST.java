package trees;

public class CheckIfBST {

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
		//bst.traverse();
		//System.out.println(isBST(bst.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
		int[] sortArray = new int[20];
		copyBST(bst.root, sortArray);
		for (int i = 1; i < sortArray.length; i++) {
			if(sortArray[i-1] > sortArray[i]){
				System.out.println("helo");
			}else{
				System.out.println(i-1+" : "+sortArray[i-1]);
			}
		}
	}
	
	private static int index = 0;
	
	public static void copyBST(TreeNode node, int[] array){
		if(node.leftChild != null){
			copyBST(node.leftChild, array);
		}
		System.out.println(node.data);
		array[index] = node.data;
		index++;
		if(node.rightChild != null){
			copyBST(node.rightChild, array);
		}
		
	}
	
	public static boolean isBST(TreeNode root, int min, int max){
		
		if(root == null){
			return true;
		}
		if(root.data <= min || root.data > max){
			return false;
		}
		
		if(!(isBST(root.leftChild, min, root.data)) || !(isBST(root.rightChild, root.data, max))){
			return false;
		}
		
		return true;
	}

}
