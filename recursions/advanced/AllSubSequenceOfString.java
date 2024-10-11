package DataStructure.recursions.advanced;
/***
 * VVI asked for many interview
 * for now just kind of mugup this concepts
 * 
 * @author sumankumar
 *
 */
public class AllSubSequenceOfString {

	public static void main(String[] args) {
		String input = "abc";
		String output = "";
		prinSubSequencesOfString(input, output);
	}

	private static void prinSubSequencesOfString(String input, String output) {
		System.out.println(input);

		if (input.length() == 0) {
			System.out.println(output);
			return;
		}
		//exclude the alphabet
		prinSubSequencesOfString(input.substring(1),output);
		//include the alphabet
		prinSubSequencesOfString(input.substring(1),output+input.charAt(0));

	}

}
