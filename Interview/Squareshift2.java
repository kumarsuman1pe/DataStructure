package DataStructure.Interview;

import java.util.Stack;

public class Squareshift2 {
    public static void main(String[] args) {
        // 16, 17, 5, 3, 4, 2
        // op : 17, 5 ,4
        int[] input = { 16, 17, 5, 3, 2,4 };
        findHeighestFromRight(input);
    }

    private static void findHeighestFromRight(int[] input) {
    Stack<Integer> stack=new Stack<Integer>();
        for(int i=input.length-1;i>=0;i--){
           
            while(!stack.isEmpty() && input[i]>stack.peek()){
                stack.pop();
            }
            
            
            if (input.length-1!=i && stack.isEmpty()) {
                System.out.println(input[i]);
                
            }
            stack.push(input[i]);
        }
    }

}
