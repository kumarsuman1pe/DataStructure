package DataStructure.strings;

public class FindLenghtOfLastWord {

	public static void main(String[] args) {
		
	System.out.println(lengthOfLastWord(" Hello Wommmrld  d"));
	}
	public static int lengthOfLastWord(String s) {
		int tempcont = 0,count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				count++;
			}
			else {
				if(count>0) {
				tempcont=count;
				count=0;
				}
			}
		}
		return count>0?count:tempcont;
		
	}
}
