package trees;

import java.util.ArrayList;

public class CreateDepthList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.addNode(50); bst.addNode(10); bst.addNode(55); bst.addNode(99);
		 bst.addNode(9); bst.addNode(23); bst.addNode(52);
		 ArrayList<ArrayList<TreeNode>> data = createDepthList(bst.root);
		 for (ArrayList<TreeNode> arrayList : data) {

			 for (int i = 0; i < arrayList.size(); i++) {
				System.out.print(arrayList.get(i).data);
			}
			 System.out.println();
		}
	}
	
	public static ArrayList<ArrayList<TreeNode>> createDepthList(TreeNode root){
		
		ArrayList<ArrayList<TreeNode>> result = new ArrayList<>();
		ArrayList<TreeNode> current = new ArrayList<>();
		current.add(root);
		while(current.size() > 0){
		result.add(current);
		ArrayList<TreeNode> parent = current;
		current = new ArrayList<>();
		for (TreeNode treeNode : parent) {
			if(treeNode.leftChild != null){
				current.add(treeNode.leftChild);
			}
			if(treeNode.rightChild != null){
				current.add(treeNode.rightChild);
			}
		}
		}
		
		return result;
	}

}
