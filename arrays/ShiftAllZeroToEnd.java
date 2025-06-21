package DataStructure.arrays;

import java.util.Arrays;

public class ShiftAllZeroToEnd {
    public static void main( String[] args ) {
        int rawArray[] = { 1, 3, 0, 4, 0, 7, 9 };
        shiftAllZeroToRight( rawArray );
        printArray( rawArray );
    }

    private static void printArray( int[] rawArray ) {
        Arrays.stream( rawArray ).forEach( System.out::print );
    }

    private static void shiftAllZeroToRight( int[] rawArray ) {
        int n = rawArray.length;
        int j = 0;
        for ( ; j < n - 1; j++ ) {
            if ( rawArray[j] == 0 ) {
                break;
            }
        }
        for ( int i = j + 1; i < n; i++ ) {
            if ( rawArray[i] != 0 ) {
                rawArray[j] = rawArray[i];
                j++;
            }
        }
        while ( j < n ) {
            rawArray[j] = 0;
            j++;
        }
    }
}
