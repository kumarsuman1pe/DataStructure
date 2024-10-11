package DataStructure.recursions;

public class palinRec {

	public static void main(String arg[]) {
		String s="madam";
		boolean isPalin=checkpalin(s);
		System.out.println(isPalin);
	}

	private static boolean checkpalin(String s) {
		if(s.length()<=1) {
			return true;
		}
		
		if(s.charAt(0)==s.charAt(s.length()-1)) {
			return checkpalin(s.substring(1,s.length()-1));
		}else {
			return false;
		}
		
		
		
	}
}
