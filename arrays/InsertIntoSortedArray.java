package DataStructure.arrays;

import java.util.Arrays;

public class InsertIntoSortedArray {

	public static void main(String[] args) {
		int ele = 1;
		int[] list = new int[5];
		list[0] = 2;
		list[1] = 4;
		list[2] = 6;
		list[3] = 8;
		System.out.println(Arrays.toString(list));

		insertIntoSortedArray(list, ele);
		System.out.println(Arrays.toString(list));

	}

	private static void insertIntoSortedArray(int[] list, int ele) {
		int i = list.length - 2;
		while (i >= 0 && list[i] > ele) {
			list[i + 1] = list[i];
			i--;

		}
		list[i + 1] = ele;
	}

}
