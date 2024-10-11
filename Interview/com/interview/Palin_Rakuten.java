package DataStructure.Interview.com.interview;

public class Palin_Rakuten {

	public static void main(String[] args) {
		String input="nitin";
		Boolean isPlain=checkIfPalin(input.toLowerCase());
		if(isPlain) {
			System.out.println("Palindrome..");
		}else {
			System.out.println("Not Palindrome..");

		}
	}

	private static Boolean checkIfPalin(String input) {
		
		for(int i=0,j=input.length()-1;i<j;i++,j--) {
			
			if(input.charAt(i)!=input.charAt(j)) {
				return false;
			}
		}
		
		return true;
	}

}
