package DataStructure.recursions;

public class RecursionTracing {

	public static void main(String[] args) {
		int x = 5;

		recursion(x);
	}

	/*
	 * Head recursion:Ascending phase
	 * 
	 * Real power of Recursion :It has Ascending and Descending phase
	 * 
	 * It can be traced using Tree
	 * 
	 */
	private static void recursion(int x) {
		if (x > 0) {
			System.out.println(x);//Ascending Phase//Calling Phase
			recursion(x - 1);
			System.out.println(x);//descending Phase//returning phase
		}
	}
}
