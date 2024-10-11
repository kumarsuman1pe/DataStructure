package DataStructure.arrays;

public class InsertIntoArray {
	/*
	 * create a brand new array with size 1 more than the current one and copy from
	 * existing to new Array and while copying check insert position and handle
	 * properly
	 * 
	 */

	public static void main(String[] args) {
		int[] oldArray = new int[] { 2, 3, 4, 6, 8 };
		int ele = 11;
		int position = 2;
		int[] newArray = insertByPosition(oldArray, ele, position);
		printArray(newArray);
	}

	private static void printArray(int[] oldArray) {
		for (int ele : oldArray)
			System.out.print(" " + ele);
	}

	private static int[] insertByPosition(int[] a, int ele, int pos) {
		int b[] = new int[a.length + 1];
		for (int i = 0, j = 0; i < a.length; i++) {
			if (i == pos) {
				b[j++] = ele;
			}
			b[j++] = a[i];

		}
		return b;

	}
}
