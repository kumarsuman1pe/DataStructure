package DataStructure.arrays;

public class FindMultipleMissingElement {

	public static void main(String[] args) {
		int[] list = { 3, 6, 7, 9, 15 };
		findAllMissingElementFromList(list);
	}
	/* 
	 * by candidate in interview
	 */
//	import java.util.Arrays;
//	class HelloWorld {
//	    public static void main(String[] args) {
//	        int[] list = {3,6,7,9,15};
//	        int min = Arrays.stream(list).min().orElse(0);
//	        int max = Arrays.stream(list).max().orElse(0);
//	        for(int i= min +1;i<max;i++){
//	            final int c = i;
//	            if(Arrays.stream(list).noneMatch(n->n==c)){
//	                System.out.println(c);
//	            }
//	        }
//	        
//	    }
//	}
	private static void findAllMissingElementFromList(int[] list) {
		int diff = list[0];
		System.out.println("Missing Elements are!...");
		int missedEle = 0;
		for (int i = 0; i < list.length; i++) {
			if (diff != list[i] - i) {
				missedEle = i + diff;
				while(missedEle<list[i]) {
				System.out.println(missedEle);
				diff++;
				missedEle++;
				}
			}
		}
	}

}
