package DataStructure.strings;

public class ValidateString {

	public static void main(String[] args) {
		String invalid = "Suman123@";
		boolean isValidString = isValid(invalid);
		System.out.println(isValidString);

		String valid = "Suman125";

		boolean isValidString1 = isValid(valid);
		System.out.println(isValidString1);
	}

	private static boolean isValid(String name) {
		for (int i = 0; i < name.length(); i++) {

			if (!(name.charAt(i) >= 65 && name.charAt(i) <= 90) && !(name.charAt(i) >= 97 && name.charAt(i) <= 122)
					&& !(name.charAt(i) >= 48 && name.charAt(i) <= 57)) {

				return false;
			}
		}

		return true;
	}

}
