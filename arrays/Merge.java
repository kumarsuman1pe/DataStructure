package DataStructure.arrays;

import java.util.Arrays;

/*
 * Merge: Is a process where two sorted arrays is merged(combined) to get a brand new sorted Arrays.
 *if we have duplicate then both elements should be present in third arrays
 */

public class Merge {

	public static void main(String[] args) {
		int[] list1 = new int[] { 2, 4, 6, 8, 10 };
		int[] list2 = new int[] { 3, 5, 6, 7, 9, 11 };

		int[] mergedList = mergeLists(list1, list2);
		System.out.println("List1!.." + Arrays.toString(list1));
		System.out.println("List2!.." + Arrays.toString(list2));

		System.out.println("After Merging List1 and List2.....");
		System.out.println(Arrays.toString(mergedList));

	}

	private static int[] mergeLists(int[] l1, int[] l2) {
		int[] l3 = new int[l1.length + l2.length];
		int i = 0, j = 0, k = 0;
		while (i < l1.length && j < l2.length) {
			if (l1[i] < l2[j]) {
				l3[k++] = l1[i++];
			} else if (l2[j] < l1[i]) {
				l3[k++] = l2[j++];

			} else {
				l3[k++] = l1[i++];

			}

		}
		for (; i < l1.length; i++) {
			l3[k] = l1[i];
		}
		for (; j < l2.length; j++) {
			l3[k] = l2[j];
		}
		return l3;

	}
}
