package DataStructure.stack;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Stream;

/*
find the next greater elements to its left
 */
public class NextGreatNumberToLeft {
    public static void main(String[] args) {
        int[] arr={4,3,6,8,9,1,11};
        findNextGreaterToLeft(arr);
    }
    private static void findNextGreaterToLeft(int[] arr) {
      Stack<Integer> stack = new Stack<>();
      String[] result = new String[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && stack.peek()<arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i]="_";
            }
            else {
                result[i]=String.valueOf(stack.peek());
            }
            stack.push(arr[i]);
        }
        Arrays.stream(result).forEach(e->System.out.print(e+" "));
    }
}
