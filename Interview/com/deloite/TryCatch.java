package DataStructure.Interview.com.deloite;

public class TryCatch {
	public static void main(String[] args) {

		System.out.println(testMethod());// 2,5
	}

	static int testMethod() {
		int i = 1;
		try {
			i = i + 1;
			return i;
		} catch (Exception e) {
			i = i + 2;
		} finally {
			i = i + 3;
			System.out.println(i);
		}
		return i;
	}

}
