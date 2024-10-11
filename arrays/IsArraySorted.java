package DataStructure.arrays;

public class IsArraySorted {

	public static void main(String[] args) {
		int[] list = { 2, 4, 66, 2, 88, 100 };
		boolean flag = isSorted(list);
		if (flag) {
			System.out.println("List is already sorted!...");
		} else {
			System.out.println("List is not sorted!..");
		}

	}

	private static boolean isSorted(int[] list) {
		boolean isSorted = true;
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] > list[i + 1]) {
				isSorted = false;
			}
		}
		return isSorted;
	}

}
