package DataStructure.arrays;

public class Reverse {

	public static void main(String[] args) {
		int[] list = new int[] { 2, 4, 6, 8, 10 };
		System.out.println("Original Array...");
		display(list);
		// reverseV1(list);
		reverseV2(list);
		System.out.println("\nReversed Array...");
		display(list);

	}

	/*
	 * perform reverse on same array Time Complexity:O(n)
	 */
	private static void reverseV2(int[] list) {
		for (int i = 0, j = list.length - 1; i < j; i++, j--) {
			swap(list, i, j);
		}
	}

	private static void swap(int[] list, int i, int j) {
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}

	/*
	 * taking help of Auxiliary array time complexity:O(n) dont forget to copy the
	 * temp array to original array
	 */
	private static void reverseV1(int[] list) {
		int[] tempArray = new int[list.length];
		for (int i = list.length - 1, j = 0; i >= 0; i--, j++) {
			tempArray[j] = list[i];
		}
		for (int i = 0; i < list.length; i++) {
			list[i] = tempArray[i];
		}

	}

	private static void display(int[] list) {
		for (int ele : list) {
			System.out.print(" " + ele);
		}
	}
}
