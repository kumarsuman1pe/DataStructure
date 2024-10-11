package DataStructure.strings;
/***
 * 
 * @author sumankumar
 *
 */
public class ChangeToUpperCase {

	public static void main(String[] args) {
		String name = "suman";
		System.out.println("String before method call " + name);

		String chagedToUppercaseString = changeToUppercase(name);
		System.out.println("String after method call " + chagedToUppercaseString);
	}

	private static String changeToUppercase(String name) {
		char[] stringCharArray = name.toCharArray();
		for (int i = 0; i < stringCharArray.length; i++)

		{
			stringCharArray[i] = (char) (stringCharArray[i] - 32);
		}
		return new String (stringCharArray);

	}
}
