package DataStructure.strings;

public class Reverse {

	public static void main(String[] args) {
		String name = "ASHISH";

		String reversedString = reverse(name);
		System.out.println("Original String... " + name);

		System.out.println("Reversed String... " + reversedString);
	}

	private static String reverse(String name) {
		StringBuffer sb = new StringBuffer(name);
		for (int i = 0, j = name.length()-1; i < j; i++, j--) {
			char temp = sb.charAt(j);
			sb.setCharAt(j, sb.charAt(i));
			sb.setCharAt(i, temp);
		}
		return sb.toString();
	}
}
