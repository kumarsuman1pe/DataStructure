package DataStructure.recursions;

public class Exponent {

	public static void main(String[] args) {
		int power = callPower(2, 5);
		System.out.println(power);
	}

	private static int callPower(int m, int n) {
		if (n == 0) {
			return 1;
		} else {
			return m * callPower(m, n - 1);
		}
	}
}
