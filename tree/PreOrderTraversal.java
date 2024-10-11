package DataStructure.tree;

/***
 * 
 * @author sumankumar 
 * 
 * class to demonstrate the pre order traserval
 */
public class PreOrderTraversal {
	private TreeNode root;

	public static void main(String[] args) {
		PreOrderTraversal bt = new PreOrderTraversal();
		bt.createTree();
		bt.preorder(bt.root);
	}

	private void preorder(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);
		preorder(root.left);
		preorder(root.right);

	}

	public void createTree() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		root = first;
		root.left = second;
		root.right = third;
		second.left = fourth;
		second.right = fifth;

	}

	/***
	 * Inner class to create tree data type
	 *
	 */
	public class TreeNode {
		TreeNode left;
		TreeNode right;
		int data;

		TreeNode(int data) {
			this.data = data;
		}

	}

}
