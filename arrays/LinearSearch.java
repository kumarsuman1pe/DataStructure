package DataStructure.arrays;

import java.util.List;

/*
 * write  all three version of Linear Search
 * Normal
 * Enhanced Version: Transposition And Move to front
 */
public class LinearSearch {
	public static void main(String[] args) {
		int array[] = { 1, 11, 23, 44, 55, 66 };

		int index = linearSearch(array, 55);

		if (index != -1) {
			System.out.println("Element found at index: " + index);
		} else {
			System.out.println("Element not found in given array: ");

		}

		int transposeIndex = transposelLnearSearch(array, 66);

		if (transposeIndex != -1) {
			System.out.println("Element found at index: " + transposeIndex);
		} else {
			System.out.println("Element not found in given array: ");

		}
		// move to Head

		int moveToZeroIndex = moveToZeroLnearSearch(array, 11);

		if (transposeIndex != -1) {
			System.out.println("Element found at index: " + moveToZeroIndex);
		} else {
			System.out.println("Element not found in given array: ");

		}

	}

	private static int moveToZeroLnearSearch(int[] array, int key) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				swapWithIndexZero(array, i);
				return i;
			}
		}

		return -1;
	}

	private static void swapWithIndexZero(int[] array, int i) {
		int temp = array[i];
		array[i] = array[0];
		array[0] = temp;
	}

	private static int transposelLnearSearch(int[] array, int key) {
		int foundAtIndex = -1;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				swap(array, i);
				return i;
			}
		}

		return foundAtIndex;
	}

	private static void swap(int array[], int i) {
		int temp = array[i];
		array[i] = array[i - 1];
		array[i - 1] = temp;
	}

	private static int linearSearch(int[] array, int key) {
		int foundAtIndex = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				foundAtIndex = i;
			}

		}
		return foundAtIndex;
	}

}
