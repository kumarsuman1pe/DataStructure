package DataStructure.arrays;

public class RotateRightByKPosition {
    public static void main( String[] args ) {
        int arr[]={1,2,3,4,5,6};
        int k=2;
        Solution1 sol=new Solution1();
        sol.rotateLeftByKPosition(arr,k);
        sol.printArray(arr);
    }
}
class Solution1{

    public void rotateLeftByKPosition( int[] arr, int k ) {
        int n=arr.length-1;
        reverseArray(arr,0,n);
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,n);

    }

    private void reverseArray( int[] arr, int i, int n ) {
        while ( i<n ){
            int temp=arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
            i++;n--;
        }
    }

    public void printArray( int[] arr ) {
        for ( int eachEle:arr )
            System.out.print( eachEle+" " );
    }
}