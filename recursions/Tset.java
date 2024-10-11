package DataStructure.recursions;

public class Tset {

	public static void main(String[] args) {
		int n = 8;
		if (printPrime(n)) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not Prime number");
		}
	}

	private static boolean printPrime(int n) {
		boolean isPrime = true;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0 && i != n) {
				isPrime=false;
				break;
			}

		}
		return isPrime;
	}

}
