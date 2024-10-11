package DataStructure.Interview.com.interview;

public class PrintOccuranceAndChar {
	public static void main(String[] args) {
		// aaDDDcccaa
		// output-> 2a3D3c2a
		// String str = "abcdddd";
		String str = "aaDDDcccaa";

		char[] tempArray = str.toCharArray();
		char temp;
		int count = 0;
		StringBuffer sb = new StringBuffer(str.length());
		for (int i = 0; i < tempArray.length; i++) {
			temp = tempArray[i];
			count = 1;
			while (i < str.length() - 1 && temp == tempArray[i + 1]) {
				count++;
				i++;
			}
			sb.append(count).append(temp);
		}
		System.out.println(sb.toString());
	}
}
