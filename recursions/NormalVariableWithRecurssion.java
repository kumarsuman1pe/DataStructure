package DataStructure.recursions;

public class NormalVariableWithRecurssion {

	public static void main(String[] args) {
		int x=fun(5);
		System.out.println(x);
	}

	private static int fun(int n) {

		if (n > 0) {
			return fun(n - 1) + n;
		}
		return 0;
	}

}
