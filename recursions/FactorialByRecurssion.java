package DataStructure.recursions;

public class FactorialByRecurssion {

	public static void main(String[] args) {

		int n=5;
		int fact=calculateFactByRecurssion(n);
		System.out.println("Factorial of "+n+" is "+fact);
	}

	private static int calculateFactByRecurssion(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return calculateFactByRecurssion(n-1)*n;
		}
		
	}

}
