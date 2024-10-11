package DataStructure.arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int nums[] = { -2, 2, 4, 4, 4, 4, 5, 5 };

        int numberOfUniqueEle = removeDuplicates(nums);
        System.out.println(" Total number of Unique Ele " + numberOfUniqueEle);
    }

    private static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        System.out.println(" Array with unique elemts: ");
        for (int i = 0; i <= j; i++) {
            System.out.print(" " + nums[i]);

        }
        return j+1;
    }
}