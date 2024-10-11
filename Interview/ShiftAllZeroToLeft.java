import java.util.Arrays;

public class ShiftAllZeroToLeft {

	public static void main(String[] args) {
		int input[] = new int[] { 2, 1, 0, 0, 1, 1 ,0};
		shiftAllZeroToLeft(input);

	}

	private static void shiftAllZeroToLeft(int[] input) {
		int targetIndex = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] == 0) {
				swap(input, i, targetIndex);
				targetIndex++;
			} 
		}
		System.out.println("Resultant array: " + Arrays.toString(input));

	}

	private static void swap(int[] input, int i, int j) {
		int temp = input[j];
		input[j] = input[i];
		input[i] = temp;

	}

}
