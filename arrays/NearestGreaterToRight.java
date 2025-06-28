package DataStructure.arrays;

import java.util.Stack;

public class NearestGreaterToRight {
    public static void main( String[] args ) {
        int[] input={2,3,1,0,6};
        int output[]=new int[input.length-1];

        SolutionNearestGreaterToRight sol=new SolutionNearestGreaterToRight();
        output=  sol.findNearestGreaterToRight( input );
       for ( int each:output )
       {
        System.out.print(" "+each+" ");
       }
    }
}

class SolutionNearestGreaterToRight {
    public int[] findNearestGreaterToRight( int[] input ) {
        int size = input.length;
        int[] sol = new int[size];
        int cnt = size-1;
        Stack<Integer> stack = new Stack<Integer>();
        for ( int i = size-1; i >= 0; i-- ) {
            if ( stack.isEmpty() ) {
                sol[cnt] = -1;
                cnt--;
            } else {
                if ( stack.peek() > input[i] ) {
                    sol[cnt] = stack.peek();
                    cnt--;
                } else {
                    while ( !stack.isEmpty() && stack.peek() < input[i] ) {
                        stack.pop();
                    }
                    if ( stack.isEmpty() ) {
                        sol[cnt] = -1;
                        cnt--;
                    } else {
                        sol[cnt] = stack.peek();
                        cnt--;
                    }
                }
            }
            stack.push( input[i] );
        }
        return sol;
    }
}