package DataStructure.Interview.com.interview;

public class ReverseStringWithouSpecialChar {

	public static void main(String[] args) {
		String input = "HELLO WORLD! 123";
		System.out.print(reverseStr(input));

	}

	public static String reverseStr(String input) {

		char[] inputArray = input.toCharArray();
		for (int i = 0, j = inputArray.length - 1; i < j; i++, j--) {

			while (i<inputArray.length - 1 && (inputArray[i] < 65 || inputArray[i] > 96)) {
				i++;
			}
			while (j>0 && (inputArray[j] < 65 || inputArray[j] > 96)) {
				j--;
			}
			char temp = inputArray[i];

			inputArray[i] = inputArray[j];
			inputArray[j] = temp;
		}
		return String.valueOf(inputArray) ;
	}

}