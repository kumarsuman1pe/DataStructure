package DataStructure.arrays;

import java.util.Stack;

public class StockSpanProblem {
    public static void main( String[] args ) {
        int[] input = { 100, 80, 60, 70, 60, 75, 85 };
        int span[];
        SolutionStockSpanProblem ssp = new SolutionStockSpanProblem();
        span = ssp.findNearestGreaterToRight( input );
        for ( int each : span ) {
            System.out.println( " " + each + " " );
        }
    }
}

class SolutionStockSpanProblem {

    public int[] findNearestGreaterToRight( int[] input ) {
        int n = input.length;
        int leftGreaterElemetsIndex[] = new int[n];
        int span[] = new int[n];
        Stack<Pair> stack = new Stack<>();
        for ( int i = 0; i < n; i++ ) {
            if ( stack.isEmpty() ) {
                leftGreaterElemetsIndex[i] = -1;
            } else {
                if ( stack.peek().value > input[i] ) {
                    leftGreaterElemetsIndex[i] = stack.peek().index;
                } else {
                    while ( !stack.isEmpty() && stack.peek().value < input[i] ) {
                        stack.pop();
                    }
                    if ( stack.isEmpty() ) {
                        leftGreaterElemetsIndex[i] = -1;
                    } else {
                        leftGreaterElemetsIndex[i] = stack.peek().index;
                    }
                }
            }
            stack.push( new Pair( input[i], i ) );
        }
        for ( int i = 0; i < n; i++ ) {
            span[i] = i - leftGreaterElemetsIndex[i];
        }
        return span;
    }
}

class Pair {
    int value;
    int index;

    public Pair( int value, int index ) {
        this.value = value;
        this.index = index;
    }
}