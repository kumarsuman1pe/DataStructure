package DataStructure.tree;

public class TreeCreation {

	private TreeNode root;

	private class TreeNode {
		TreeNode left;
		TreeNode right;
		int data;

		public TreeNode(int data) {
			this.data = data;
		}
	}
		public void createTree() {
			TreeNode first = new TreeNode(1);
			TreeNode second = new TreeNode(2);
			TreeNode third = new TreeNode(3);
			TreeNode fourth = new TreeNode(4);
			TreeNode fifth = new TreeNode(5);

			root = first;
			first.left = second;
			first.right = third;
			second.left = fourth;
			second.right = fifth;
		}
	

	public static void main(String[] args) {
		TreeCreation tree=new TreeCreation();
		tree.createTree();
		System.out.println(tree.root.data);
	}

}
