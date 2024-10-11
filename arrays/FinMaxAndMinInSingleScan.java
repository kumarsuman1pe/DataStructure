package DataStructure.arrays;

import java.util.List;

/***
 * find min and max in single scan of list
 * 
 * @author sumankumar
 *
 */
public class FinMaxAndMinInSingleScan {

	public static void main(String[] args) {

		int list[] = { 1, 32, 5, 6, 8, -1 };
		findMinAndMaxInSingleScan(list);

	}

	private static void findMinAndMaxInSingleScan(int[] array) {

		int max = array[0];
		int min = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			} else if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.printf("Max %d Min %d ", max, min);
	}

}
