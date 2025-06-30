package DataStructure.arrays;

import java.util.Stack;
import java.util.stream.Stream;

public class NearestSmallerToRight {
    public static void main( String[] args ) {
        int[] arr = { 1, 3, 2, 4 };
        Integer ans[] = new Integer[arr.length];
        SolutionNearestSmallerToRight sol = new SolutionNearestSmallerToRight();
        ans = sol.findNearestGreaterToLeft( arr );
        Stream.of( ans ).forEach( x-> System.out.print( " "+x ) );
    }
}

class SolutionNearestSmallerToRight {
    public Integer[] findNearestGreaterToLeft( int[] arr ) {
        int n = arr.length;
        Integer ans[] = new Integer[n];
        Stack<Integer> stack = new Stack<Integer>();
        for ( int i = n-1; i >= 0; i-- ) {
            if ( stack.isEmpty() ) {
                ans[i] = -1;
            } else {
                if ( stack.peek() < arr[i] ) {
                    ans[i] = stack.peek();
                } else {
                    while ( !stack.isEmpty() && stack.peek() > arr[i] ) {
                        stack.pop();
                    }
                    if ( stack.isEmpty() ) {
                        ans[i] = -1;
                    } else {
                        ans[i] = stack.peek();
                    }
                }
            }
            stack.push( arr[i] );
        }
        return ans;
    }
}