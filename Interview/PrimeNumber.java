package DataStructure.Interview;

public class PrimeNumber {
    public static void main( String[] args ) {
        printPrimeNumber( 40 );
    }

    private static void printPrimeNumber( int n ) {
        for ( int i = 0; i < n; i++ ) {
            if ( isPrime( i ) ) {
                System.out.print( " " + i );
            }
        }
    }

    private static boolean isPrime( int n ) {
        if ( n <= 1 ) return false;
        for ( int i = 2; i <n; i++ ) {
            if ( n % i == 0 ) {
                return false;
            }
        }
        return true;
    }
}


