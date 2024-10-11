package DataStructure.recursions;

public class Factorial {

	public static void main(String[] args) {
		int n = 4;
		int result = fact(n);
		System.out.println(result);
	}

	private static int fact(int n) {
									//Step 1: base case
		if (n == 0) {
			return 1;
		}
		int smallResult=fact(n-1);	//Step 2: recursive case Assumptions
		return n*smallResult;		//Step 3: calculation

	}

}
