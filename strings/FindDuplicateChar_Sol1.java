package DataStructure.strings;
/***
 * 
 * @author sumankumar
 * 
 *Finding duplicate character using bitwise operater
 *
 *Used concepts here 
 *Masking
 *Merging
 *
 *left shift 
 */
public class FindDuplicateChar_Sol1 {

	public static void main(String[] args) {
		String str = "sumankumar";

		findDuplicateChar(str);
	}

	private static void findDuplicateChar(String str) {

		char ele[] = str.toCharArray();
		int h = 0;
		// int x=1;
		for (int i = 0; i < ele.length; i++) {
			int x = 1;
			x = x << ele[i] - 97;

			if ((h & x) > 0)// masking opertaion check udemy notes
			{
				System.out.println("Duplicate ele %c " + ele[i]);
			} else {
				h = h | x;// merging check udemy notes
			}
		}

	}

}
