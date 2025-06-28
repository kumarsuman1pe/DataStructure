package DataStructure.Interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Altrimetric2k25 {
   // Write a Java program to find the second largest number in an array. (without any built-in utility function)
    // Input : {12, 35, 1, 10, 34, 1}
    // Output: 34

   // Find All Pairs with Given Sum in Array Given Array: [2, 7, 11, 15, -2, 4, 8, 1] Target Sum: 9 Output {(2, 7), (-2, 11), (1, 8)}
   //Given Input : 1, 2, 3, 4, 5, 3, 2, 6, 7, 8, 8) Output : [2, 3, 8]
    public static void main( String[] args )
   {

       Set<Integer> hs1=new HashSet<>();
       Set<Integer> res=new HashSet<>();
       List<Integer> input= Arrays.asList( 1, 2, 3, 4, 5, 3, 2, 6, 7, 8, 8 );

      input.stream().map( e->hs1.contains( e ) ).forEach( System.out::print );

      /*int[] input= {2, 7, 11, 15, -2, 4, 8, 1};
      int sum=9;
      Set<Integer> hs=new HashSet<>();
       for ( int i = 0; i <input.length ; i++ ) {
           int target=sum-input[i];
           if ( !hs.add(target) ){
              // System.out.println("pair " +target+" ,"+ input[i]  );
           }else
           {
               hs.add(input[i] );
           }
       }*/

    }
}
