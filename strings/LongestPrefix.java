package DataStructure.strings;

public class LongestPrefix {

	public static void main(String[] args) {
		String str[] = { "ab", "a" };
		System.out.println(longestCommonPrefix(str));
	}

	public static String longestCommonPrefix(String[] arr) {
		StringBuffer sb = new StringBuffer();
		if(arr.length==0){
			return	"";

		}
		for (int i = 0; i < arr[0].length(); i++) {
			for (int j =1; j <arr.length; j++) 
			{
				if ( i>=arr[j].length()) {
					return sb.toString();
				}
				if ( arr[0].charAt(i)!= arr[j].charAt(i)) {
					return sb.toString();
				} 
			}
			
			sb.append(arr[0].charAt(i));
			

		}

		return sb.toString();
	}
}
