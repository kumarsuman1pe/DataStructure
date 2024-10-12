package DataStructure.f2f;

public class FindSingleMissingEle {
    static int[] input = { 5,4,2,1,6,1,4,8};

    public static void main( String[] args ) {
        swapSort( 5 );
        printMissingAndDuplicateEle(input);
    }

    private static void printMissingAndDuplicateEle( int[] input ) {
        for ( int i = 0; i < input.length; i++ ) {
            if(input[i]!=i+1){
                System.out.print("Duplicate Ele: "+input[i] );
                System.out.println(" Missing Ele: "+ (i+1) );
            }
        }
    }

    private static void swapSort( int n ) {
        for ( int i = 0; i < n; i++ ) {
            while ( input[i] != input[input[i] - 1] ) {
                swap( i );
            }
        }
    }

    private static void swap( int i ) {
       //{ 2, 5, 3, 1, 2 };
        int temp = input[i];
        int temp2=input[input[i] - 1];
        input[i] =temp2;
        input[temp-1] = temp;
    }
}
