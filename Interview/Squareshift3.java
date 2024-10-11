package DataStructure.Interview;

import java.util.Arrays;

public class Squareshift3 {
    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 5 };
        int k =15%(input.length);
        // op: 45123

        int d = input.length - k;

        reverse(input, 0, d - 1);
        reverse(input, d, input.length - 1);

        reverse(input, 0, input.length - 1);
        printArray(input);
    }

    private static void printArray(int[] input) {
        System.out.println("Rotated array...");
        Arrays.stream(input).forEach(System.out::print);
    }

    private static void reverse(int[] input, int i, int j) {

        while (i <= j) {
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;
            i++;j--;
        }
    }
}