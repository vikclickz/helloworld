package trees;

public class BinarySearchTree {
	
	TreeNode root;
	int treeSize = 0;
	
	
	public boolean addNode(int data){
		
		TreeNode nodeToAdd = new TreeNode(data);
		
		if(root == null){
			root = nodeToAdd;
			treeSize++;
		}
		
//		Node traversingNode = root;
		
		traverseAndAddNode(root,nodeToAdd);
		
		return false;
	}

	private void traverseAndAddNode(TreeNode traversingNode, TreeNode nodeToAdd) {
		
		if(nodeToAdd.data < traversingNode.data){
			
			if(traversingNode.leftChild == null){
				nodeToAdd.parentNode = traversingNode;
				traversingNode.leftChild = nodeToAdd;
				treeSize++;
			}else{
				traverseAndAddNode(traversingNode.leftChild,nodeToAdd);
			}
		}else if(nodeToAdd.data > traversingNode.data){
			if(traversingNode.rightChild == null){
				nodeToAdd.parentNode = traversingNode;
				traversingNode.rightChild = nodeToAdd;
				treeSize++;
			}else{
				traverseAndAddNode(traversingNode.rightChild,nodeToAdd);
			}
			
		}
			
		
	}
	
	public boolean delete(int data){
		
		TreeNode nodeToBeDeleted = find(data);
		if(nodeToBeDeleted != null){
			if(nodeToBeDeleted.leftChild == null && nodeToBeDeleted.rightChild == null){
				deleteCaseOne(nodeToBeDeleted);
			}else if(nodeToBeDeleted.leftChild != null && nodeToBeDeleted.rightChild !=null){
				deleteCase3(nodeToBeDeleted);
			}
			else if(nodeToBeDeleted.leftChild != null){
				deleteCase2(nodeToBeDeleted);
			}else if(nodeToBeDeleted.rightChild != null){
			
			}
		}
		return false;
	}
	
	private void deleteCase2(TreeNode nodeToBeDeleted) {

		if(nodeToBeDeleted.parentNode.leftChild == nodeToBeDeleted){
			if(nodeToBeDeleted.leftChild != null){
				nodeToBeDeleted.parentNode.leftChild = nodeToBeDeleted.leftChild;
			}else if(nodeToBeDeleted.rightChild != null){
				nodeToBeDeleted.parentNode.leftChild = nodeToBeDeleted.rightChild;
			}
		}else if(nodeToBeDeleted.parentNode.rightChild == nodeToBeDeleted){
			if(nodeToBeDeleted.leftChild != null){
				nodeToBeDeleted.parentNode.rightChild = nodeToBeDeleted.leftChild;
			}else if(nodeToBeDeleted.rightChild != null){
				nodeToBeDeleted.parentNode.rightChild = nodeToBeDeleted.rightChild;
			}
		}
	}
	
	// Node has both children populated
	private void deleteCase3(TreeNode node){
		TreeNode minNode = minLeftTraversal(node);
		deleteCase2(minNode);
		minNode.parentNode = node.parentNode;
		minNode.leftChild = node.leftChild;
		minNode.rightChild = node.rightChild;
		if(node.parentNode.leftChild == node){
			node.parentNode.leftChild = node;
		}else if(node.parentNode.rightChild == node){
			
			node.parentNode.rightChild = node;
		}
	}

	
	private TreeNode minLeftTraversal(TreeNode node){
		if(node.leftChild == null){
			return node;
		}
		return minLeftTraversal(node.leftChild);
	}
	
	private void deleteCaseOne(TreeNode nodeToBeDeleted){
		if(nodeToBeDeleted.parentNode.leftChild == nodeToBeDeleted){
			nodeToBeDeleted.parentNode.leftChild = null;
		}else if(nodeToBeDeleted.parentNode.rightChild == nodeToBeDeleted){
			nodeToBeDeleted.parentNode.rightChild = null;
		}
	}
	
	public TreeNode find(int data){
		
		if(root != null){
			return findNode(root, new TreeNode(data));
		}
		return null;
	}
	
	
	private TreeNode findNode(TreeNode searchNode, TreeNode node) {
		if(searchNode == null){
			return null;
		}
		if(searchNode.data == node.data){
			return searchNode;
		}else{
			TreeNode returnNode = findNode(searchNode.leftChild, node);
			if(returnNode == null){
				returnNode = findNode(searchNode.rightChild, node);
			}
			return returnNode;
		}
//		return null;
	}

	public void traverse(){
		if(root != null){
			TreeNode nodeToTraverse = root;
			
			if(nodeToTraverse.leftChild == null && nodeToTraverse.rightChild == null){
				System.out.println(nodeToTraverse.data);
			}
			else{
				postOrderTraversal(nodeToTraverse);
			}
		}
	}
	
	//Inorder Traversal
	private void inOrderTraversal(TreeNode nodeToTraverse){
			
			if(nodeToTraverse.leftChild != null){
				inOrderTraversal(nodeToTraverse.leftChild);
			}
			
			System.out.println(nodeToTraverse.data);
			
			if(nodeToTraverse.rightChild != null){
				inOrderTraversal(nodeToTraverse.rightChild);
			}
			
	}
	
	//PreOrder Traversal
		private void preOrderTraversal(TreeNode nodeToTraverse){
				System.out.println(nodeToTraverse.data);
				if(nodeToTraverse.leftChild != null){
					preOrderTraversal(nodeToTraverse.leftChild);
				}
				
				
				
				if(nodeToTraverse.rightChild != null){
					preOrderTraversal(nodeToTraverse.rightChild);
				}
				
		}
		
		//PostOrder Traversal
		private void postOrderTraversal(TreeNode nodeToTraverse){
				
				if(nodeToTraverse.leftChild != null){
					postOrderTraversal(nodeToTraverse.leftChild);
				}
				
				
				if(nodeToTraverse.rightChild != null){
					postOrderTraversal(nodeToTraverse.rightChild);
				}

				System.out.println(nodeToTraverse.data);
				
		}
	

}
