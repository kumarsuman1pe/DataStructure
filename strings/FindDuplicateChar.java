package DataStructure.strings;

public class FindDuplicateChar {

	public static void main(String[] args) {
		findDuplicateChar("anjaliilzz");
	}

	private static void findDuplicateChar(String s) {

		int hashTable[] = new int[26];
		for (int i = 0; i < s.length(); i++) {

			hashTable[s.charAt(i) - 97]++;
		}
		for (int i = 0; i < hashTable.length; i++) {
			if(hashTable[i]>1) {
				System.out.println((char)(i+97));
			}
			
		}
	}

}
