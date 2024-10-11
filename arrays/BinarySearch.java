package DataStructure.arrays;

/*
 * practice for both Iterative as well as Recursive
 */
public class BinarySearch {

	public static void main(String[] args) {

		int array[] = { 10, 11, 23, 44, 56, 66, 77, 99,100 ,105};
		int key = 99;
		int elementFoundIndex = IbinarySearch(array, key);
		if (elementFoundIndex != -1) {
			System.out.println("Element found at index: " + elementFoundIndex);
		} else {
			System.out.println("Element not found! ");

		}
		
		
		
		int key1 = 66;
		int elementFoundIndexByRec = RbinarySearch(array,0,array.length-1, key1);
		if (elementFoundIndexByRec != -1) {
			System.out.println("Element found at index: " + elementFoundIndexByRec);
		} else {
			System.out.println("Element not found! ");

		}
	}

	private static int RbinarySearch(int[] array, int low, int high, int key) {
		
		if (low <= high) {
			int mid = (low + high) / 2;
			if (key == array[mid]) {
				return mid;
			} else if (key < array[mid]) {
				return RbinarySearch( array,low,mid -1,key);
			} else {
				return RbinarySearch( array,mid+1,high,key);
			}
		}
		return -1;
	}

	private static int IbinarySearch(int[] array, int key) {
		int high = array.length-1;
		int low = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (key == array[mid]) {
				return mid;
			} else if (key < array[mid]) {
				high = mid -1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

}
