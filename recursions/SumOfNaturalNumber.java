package DataStructure.recursions;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		int n = 10;
		int result = sumOfNaturalNumberByRecurssion(n);
		System.out.println("Sum of " + n + " Natural number is :" + result);
	}

	private static int sumOfNaturalNumberByRecurssion(int n) {

		if (n == 0) {
			return 0;
		}
		else if(n>0)
		{
			return sumOfNaturalNumberByRecurssion(n - 1) + n;
		}
		return -1;
	
	}

}
