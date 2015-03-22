package trees;

public class SymmetricTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.leftChild = new TreeNode(2);
		root.rightChild = new TreeNode(2);
		TreeNode left = root.leftChild;
		left.leftChild = new TreeNode(3);
		left.rightChild = new TreeNode(4);
		TreeNode right = root.rightChild;
		right.leftChild = new TreeNode(4);
		right.rightChild = new TreeNode(3);;
		System.out.println(isSymmertricTree(root.leftChild, root.rightChild));
	}
	
//	public static boolean isSymmetricTree(TreeNode root){
//		if(null == root){
//			return false;
//		}
//		return isSymmertricTree(TreeNode root.leftChild, TreeNode root.rightChild);
//	}
	public static boolean isSymmertricTree(TreeNode left, TreeNode right){
		if(left == null && right == null){
			return true;
		}
		if(left == null || right == null){
			return false;
		}
		if(left.data != right.data){
			return false;
		}
		if(!isSymmertricTree(left.leftChild, right.rightChild)){
			return false;
		}
		if(!isSymmertricTree(left.rightChild, right.leftChild)){
			return false;
		}
		return true;
	
	}
}

