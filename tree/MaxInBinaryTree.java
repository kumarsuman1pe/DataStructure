package DataStructure.tree;

public class MaxInBinaryTree {
	private TreeNode root;

	class TreeNode {
		TreeNode left;
		TreeNode right;
		int data;

		public TreeNode(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		MaxInBinaryTree bt = new MaxInBinaryTree();
		bt.createTree();
		bt.printTree(bt.root);
		System.out.println("Maximum of Tree is: "+bt.findMax());
	}

	private int findMax() {
		return findMax(root);

	}

	private int findMax(TreeNode root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		int result=root.data;
		int left=findMax(root.left);
		int right=findMax(root.right);
		
		if(left>result) {
			result=left;
		}
		if(right>result) {
			result=right;
		}

		return result;
	}

	public void createTree() {
		TreeNode zero = new TreeNode(10);
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);

		root = zero;
		zero.left = one;
		zero.right = two;
		one.left = three;
		one.right = four;
		two.left = five;

	}

	public void printTree(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.println(root.data);
		if (root.left != null) {
			printTree(root.left);
		}
		if (root.right != null) {
			printTree(root.right);
		}
	}

}
