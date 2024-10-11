package DataStructure.recursions.advanced;

public class Length {
	static int count = 0;

	public static void main(String[] args) {
		String input = "suman";
		findLength(input);
		System.out.println("Length of String " + " " + count);

	}

	private static void findLength(String s) {
		//if (s.length() <= count) {
		if (s.length()-1 <count) {
			return;
		}
		count = count + 1;
		findLength(s);

	}

}
