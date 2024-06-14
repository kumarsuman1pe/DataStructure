package DataStructure.slidingWindows;

public class MaxSumOfSubarray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int windowSize=3;
       int result= findMaxSumOfSubarrayOfSizeK(arr,windowSize);
       System.out.println(result);
    }

    private static int findMaxSumOfSubarrayOfSizeK(int[] arr, int windowSize) {
        int maxSum=Integer.MIN_VALUE;
        int sum = 0,i=0,j=0;
      while (j<arr.length){
          sum=sum+arr[j];
          if(j-i+1<windowSize){
              j++;
          } else if (j-i+1==windowSize) {
              maxSum=Math.max(sum,maxSum);
              sum=sum-arr[i];
              i++;j++;
          }

      }
        return maxSum;
    }
}
