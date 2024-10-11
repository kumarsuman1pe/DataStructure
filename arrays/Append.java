package DataStructure.arrays;

public class Append {
	public static final int SIZE = 10;
	static int[] myArray = new int[SIZE];

	public static void main(String[] args) {
		initializeArray(myArray);
		System.out.println("Before appending element :");
		display(myArray);
		append(111);
		System.out.println("\nAfter appending element :");
		display(myArray);

	}

	private static void initializeArray(int[] myArr) {
		for (int i = 0; i < SIZE; i++) {
			if (i < 9) {
				myArr[i] = i;
			} else {
				myArray[i] = -1;
			}
		}

	}

	private static void display(int[] myArr) {
		for (int ele : myArr) {
			System.out.print(ele + " ");
		}
	}

	/**
	 * traverse to the end of list and then add the specified value iff array is not
	 * full if its already full create a temp of size twice of actual array and then
	 * copy the element from actual array to temp array AND finally refer the temp
	 * array as actal array
	 * 
	 * @param ele 1 2 1
	 */

	private static void append(int ele) {
		int count = 0;
		while (count<SIZE && myArray[count] != -1) {
			count++;

		}
		if (count < myArray.length) {
			myArray[count] = ele;
		}
	}
}
