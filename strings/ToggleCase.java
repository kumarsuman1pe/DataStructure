package DataStructure.strings;

public class ToggleCase {

	public static void main(String[] args) {
		String name = "SuMan KuMARZ";

		System.out.println("String before method call " + name);

		String chagedToUppercaseString = toggleString(name);
		System.out.println("String after method call " + chagedToUppercaseString);

	}

	private static String toggleString(String name) {
		char[] stringCharArray = name.toCharArray();
		for (int i = 0; i < stringCharArray.length; i++)
			if (stringCharArray[i] >= 65 && stringCharArray[i] <= 90) {
				stringCharArray[i] = (char) (stringCharArray[i] + 32);
			} else if (stringCharArray[i] >= 97 && stringCharArray[i] <= 122) {

				stringCharArray[i] = (char) (stringCharArray[i] - 32);
			}
		return new String(stringCharArray);

	}

}
