package trees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BreadthFirstSearch {
	
	public static void main(String[] args){
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.addNode(50); bst.addNode(10); bst.addNode(55); bst.addNode(99);
		 bst.addNode(9); bst.addNode(23); bst.addNode(52);
		 
//		bst.addNode(2);
//		bst.addNode(3);
//		bst.addNode(1);
		 bfs(bst.root, bst.find(23));
		 System.out.println(depth(bst.root, bst.find(55), 1));
	}
	
	public static void bfs(TreeNode root, TreeNode friend){
		Queue<TreeNode> queue = new LinkedList<>();
		Map<Boolean, Integer> visitedMap = new HashMap<>();
		visitedMap.put(true, root.data);
		queue.add(root);
		int level = 0;
		while(!queue.isEmpty()){
			TreeNode t = queue.poll();
			if(t.leftChild != null && t.rightChild != null){
				if(friend.data == t.leftChild.data || friend.data == t.rightChild.data){
					System.out.println("level is :: "+(level+1));
					break;
				}else{
					queue.add(t.leftChild);
					queue.add(t.rightChild);
					level = level + 1;
				}
			}
			
		}
	}
	
	public static int depth(TreeNode node, TreeNode friend, int depthVar){
		if(node == null){
			return 0;
		}
		
		if(node.data == friend.data){
			System.out.println("Friend is at depth :: "+depthVar);
			return depthVar;
		}
		depthVar = 1+Math.max(depth(node.leftChild, friend, depthVar+1),depth(node.rightChild, friend, depthVar+1));
		return depthVar;
	}

}
