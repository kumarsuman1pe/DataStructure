package DataStructure.strings;

public class StringLength {

	public static void main(String[] args) {
		String greet = "Hello World";

		int greetLength = calculateLenght(greet);
		System.out.println(greetLength);
	}

	private static int calculateLenght(String greet) {
		int calculatedLength = 0;
		char charArray[] = greet.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			calculatedLength++;
		}

		return calculatedLength;

	}

}
