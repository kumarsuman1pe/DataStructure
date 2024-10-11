package DataStructure.recursions;

/***
 * Calling recursion example or Ascending recursion
 * 
 * @author sumankumar
 *
 */
public class TailRecursion {

	public static void main(String[] args) {
		int n = 4;
		fun(n);
	}

	private static void fun(int n) {
		// base condition: to terminate the recursion
		if (n > 0) {
			System.out.println(n);
			fun(n - 1);

		}
	}

}
