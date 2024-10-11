package DataStructure.recursions.advanced;

public class PrintAndReverse {

	public static void main(String[] args) {
		char[] array = "suman".toCharArray();
		printAndReverse(array, array.length - 1);
	}

	private static void printAndReverse(char[] array, int length) {
		if (length == -1) {
			System.out.println();
			return;
		}
		System.out.print(" " + array[length]);
		printAndReverse(array, length - 1);
		System.out.print(" " + array[length]);

	}

}
