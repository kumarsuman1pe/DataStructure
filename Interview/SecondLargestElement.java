package DataStructure.Interview;

public class SecondLargestElement {
    public static void main( String[] args ) {
        // Write a Java program to find the second largest number in an array. (without any built-in utility function)
        // Input : {12, 35, 1, 10, 34, 1}
        // Output: 34
        int input[]={12, 35, 1, 10, 34, 1};
    int result=findSecondLargestElement(input);
        System.out.println("2nd largest ele,,,, "+result);

    }

    private static int findSecondLargestElement( int[] input ) {
       int first= Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for ( int i = 0; i <input.length ; i++ ) {
            if(input[i]>first){
                second=first;
                first=input[i];
            }else if ( input[i]>second )
            {
                second=input[i];
            }
        }return second;
    }
}
