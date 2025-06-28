package DataStructure.Interview;

import java.util.HashSet;
import java.util.Set;

public class AllPairOfSum {
    public static void main( String[] args ) {
        // Find All Pairs with Given Sum in Array Given Array: [2, 7, 11, 15, -2, 4, 8, 1]
        // Target Sum: 9
        // Output {(2, 7), (-2, 11), (1, 8)}
       int[]  array= {2, 7, 11, 15, -2, 4, 8, 1};
       int targetSum=9;
        printAllPairOfGivenSum(array,targetSum);
    }

    private static void printAllPairOfGivenSum( int[] array, int targetSum ) {
        Set<Integer> hs=new HashSet<>();
        for ( int i = 0; i < array.length; i++ ) {
          int targetEle=targetSum-array[i];
            if(hs.contains( targetEle )){
                System.out.println("Pair ... "+ array[i]+" "+targetEle);
            }else {
                hs.add( array[i] );
            }
        }
    }
}
