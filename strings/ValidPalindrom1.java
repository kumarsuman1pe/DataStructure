package DataStructure.strings;

public class ValidPalindrom1 {

	public static void main(String[] args) {
		String str = "race a car";
		System.out.println(isPalindrome(str));

	}

	public static boolean isPalindrome(String s) {
		String cleanPhrase=s.toLowerCase().replaceAll("[^a-z0-9]", "");
		for (int i = 0, j = cleanPhrase.length() - 1; i <= j; i++, j--) {

		
			if (cleanPhrase.charAt(i) != cleanPhrase.charAt(j)) {
				return false;
			}
		}

		return true;
	}
}
