package DataStructure.arrays;

import java.util.Iterator;

/***
 * 
 * @author sumankumar append : add at last
 */
public class Append2 {
	private static int ARRAY_SIZE = 10;
	private static int array[] = new int[ARRAY_SIZE];

	public static void main(String[] args) {

		initalizeArray(array);
		System.out.println("Original array..!");
		display(array);

		append(array, 555);
		append(array, 555);
		append(array, 555);
		append(array, 555);
		append(array, 555);
		append(array, 555);
		append(array, 555);

		System.out.println("\nArray after appended..!");

		display(array);
	}

	private static void display(int[] array2) {
		for (int i = 0; i < array2.length; i++) {
			System.out.print(" " + array2[i]);
		}
	}

	private static void initalizeArray(int[] array) {
		for (int i = 0; i < 5; i++) {
			array[i] = i + 10;
		}
		for (int i = 5; i < ARRAY_SIZE; i++) {
			array[i] = -1;
		}
	}

	private static void append(int[] array, int numberToAppend) {
		int i = 0;
		for (i = 0; i < ARRAY_SIZE; i++) {
			if (array[i] == -1)
				break;
		}
		if (i < ARRAY_SIZE)
			array[i] = numberToAppend;

	}

}
