package DataStructure.Interview.com.interview;

import java.util.HashMap;
import java.util.Map;

public class TwoSumIndeces {


    public static int[] twoSumIndices(int[] nums, int target) {
        Map<Integer, Integer> numIndices = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numIndices.containsKey(complement)) {
                return new int[]{numIndices.get(complement), i};
            }
            numIndices.put(nums[i], i);
        }

        // If no solution is found
        return null;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 0};
        int targetSum = 3;

        int[] result = twoSumIndices(array, targetSum);

        if (result != null) {
            System.out.println("Indices of the two numbers that add up to " + targetSum + ": [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No such indices found.");
        }
    }
}
