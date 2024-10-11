package DataStructure.arrays;

public class FindSingleMissingElement {

	public static void main(String[] args) {
		int[] list = new int[] { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
		int number =10;
		int missingele = findSingleMissingEle(list, number);
		System.out.println("Missing Element is " + missingele);
	}

	private static int findSingleMissingEle(int[] list, int num) {
		int totalSum = num * (num +1)/ 2;
		int sum = 0;
		for (int ele : list) {
			sum += ele;
		}
		return totalSum - sum;
	}

}
