package DataStructure.arrays;

import java.util.Arrays;

public class ShiftAndRotate {

	public static void main(String[] args) {
		int[] list = new int[5];
		list[0] = 1;
		list[1] = 2;
		list[2] = 3;
		list[3] = 4;
		list[4] = 5;
		System.out.println("Original Array!!..."+Arrays.toString(list));
		shiftBy1Position(list);
		System.out.println("After Shift by 1 pos!!......" + Arrays.toString(list));
		rotateBy1Position(list);
		System.out.println("After Rotate!......" + Arrays.toString(list));

	}

	private static void rotateBy1Position(int[] list) {
		int temp = list[0];
		for (int i = 0; i < list.length - 1; i++) {
			list[i] = list[i + 1];
		}
		list[list.length - 1] = temp;
	}

	private static void shiftBy1Position(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			list[i] = list[i + 1];
		}
		list[list.length - 1] = 0;
	}

}
