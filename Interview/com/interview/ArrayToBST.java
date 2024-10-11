package DataStructure.Interview.com.interview;

public class ArrayToBST {
/***
 * 1.) Array = [6, 3, 8, 1, 5, 7, 9, 0 , 2, 4]
Output ->
                   6
   	        3            8 
        1       5     7     9
     0    2   4

 * @param args
 */
	public static void main(String[] args) {
		int[] input = {6, 3, 8, 1, 5, 7, 9, 0 , 2, 4};
		BST tree=new BST(input[0]);
		tree.addChild(input[1],tree);
		
		

		
		
	}

}
class BST{
	BST lChild;
	BST rChild;
	int data;
	public BST(int data) {	
		this.data=data;	
		
	}
	public void addChild(int data,BST root) {
		BST temp=new BST(data);
		root.lChild=temp;
	}

}