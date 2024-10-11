package DataStructure.strings;

public class CountWords {

	public static void main(String[] args) {
		String string = "I am java  developer ";

		int numerOfWords = countWords(string);
		System.out.println("Number of word present in given string is :" + numerOfWords);
	}

	private static int countWords(String string) {
		int wordCount = 0;

		for (int i = 0; i < string.length() - 1; i++) {
			if (string.charAt(i) == ' ' && string.charAt(i + 1) != ' ') {
				wordCount++;
			}
		}

		return wordCount + 1;
	}

}
