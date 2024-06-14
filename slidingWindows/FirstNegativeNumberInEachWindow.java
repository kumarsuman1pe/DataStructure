package DataStructure.slidingWindows;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeNumberInEachWindow {
    public static void main(String[] args) {
        int[] arr={1,-2,-3,4,5,-6,7,8,9};
        int windowSize=3;
        fidFirstNegativeNumberInEachWindow(arr, windowSize);
    }

    private static void fidFirstNegativeNumberInEachWindow(int[] arr, int windowSize) {
       int j=0, i=0;
        Queue<Integer> queue=new LinkedList<>();
        while (j<arr.length){
            // hit the window size
            if(arr[j]<0){
                queue.offer(arr[j]);
            }
            if(j-i+1<windowSize){
                j++;
            } else if (j-i+1== windowSize) {
                if(queue.isEmpty()){
                    System.out.print(" "+ 0);
                }else{
                    System.out.print(queue.peek());
                    if(arr[i]==queue.peek()){
                        queue.poll();
                    }
                }
                i++;j++;
            }
        }
    }
}

