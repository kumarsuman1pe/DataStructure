package DataStructure.f2f;

import java.util.Arrays;

public class FindSingleMissingEle1ToNProblem {
    public static void main(String[] args) {
        int input[]={5,4,2,1,6,7,4,8};
        findSingleMissingAndDuplicateEle(input);
    }

    private static void findSingleMissingAndDuplicateEle(int[] input) {
        for (int i = 0; i < input.length; i++) {
            while(input[i]!=input[input[i]-1]){
                extracted(input, i);
            }
            i++;
        }
        for (int i = 0; i < input.length; i++) {
            if(i+1!=input[i]){
                System.out.println("Duplicate ele: "+input[i]+" Missing Ele: "+(i+1));
            }
        }

    }

    private static void extracted(int[] input, int i) {
        int temp = input[i];
        int temp2= input[input[i]-1];
        int swappedIndex= input[i]-1;
        input[i]=temp2;
        input[swappedIndex]=temp;
    }
}
