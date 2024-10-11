package DataStructure.Interview.com.interview;

import java.util.Arrays;

public class FIndDuplicateMissingEle {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 5, 6, 5, 7,7,9 };
		// do swapSort
		int[] processedArray = findMissingAndDuplicateEle(array);
		// scan and check for index and indexed value		
        Arrays.stream(processedArray).forEach(System.out::print);

        printMissingAndDuplicateEle(processedArray);
	}

	private static void printMissingAndDuplicateEle(int[] processedArray) {
		for (int i = 0; i < processedArray.length; i++) {
			if(processedArray[i]!=i+1) {
				System.out.println("Missing ele: "+(i+1) +" Duplicate ele: "+processedArray[i]);
			}
		}
		
	}

	private static int[] findMissingAndDuplicateEle(int[] a) {
		for (int i = 0; i < a.length; i++) {
			while (a[i] != i + 1) {
				if (a[i] != a[a[i] - 1]) {
					swap(a, i, a[i] - 1);
				} else {
					i++;
				}
			}
		}

		return a;

	}

	private static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}

}
