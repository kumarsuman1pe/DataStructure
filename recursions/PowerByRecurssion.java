package DataStructure.recursions;

public class PowerByRecurssion {

	public static void main(String[] args) {
		int m = 2, n = 2;
		int result = powerUsingRecurssion(m, n);
		System.out.println("Power of " + m + " to the power " + n + " is :" + result);
	}

	private static int powerUsingRecurssion(int m, int n) {
		if (n == 0) {
			return 1;
		} else if(n>0) {
			return powerUsingRecurssion(m, n - 1) * m;
		}
		else {
			return -1;
		}
	}

}
