package DataStructure.arrays;

public class RemoveFromArray {
	/*
	 * create new array with size 1 less than the existing array then keep copying
	 * form existing to new array and while copy do continue for given index
	 */
	public static void main(String[] args) {
		int[] oldArray = { 2, 3, 5, 6, 8, 1, 3 };
		int index = 5;
		int[] newArray = removeElebyGivenIndex(oldArray, index);
		for (int x : newArray) {
			System.out.print(x + " ");
		}
	}

	private static int[] removeElebyGivenIndex(int[] oldArray, int index) {

		int[] newArray = new int[oldArray.length - 1];

		for (int i = 0, j = 0; i < oldArray.length; i++) {
			if (i == index)
				continue;
			newArray[j++] = oldArray[i];

		}
		return newArray;
	}

}
