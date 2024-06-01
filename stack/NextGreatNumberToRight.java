package DataStructure.stack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class NextGreatNumberToRight {
    public static void main(String[] args) {
      int[] array = {1,5,3,4,11,7,2,9};
        printNextGreaterNumberToLeft(array);
    }

    private static void printNextGreaterNumberToLeft(int[] array) {
        List<String> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = array.length-1; i >= 0; i--) {


            while (!stack.isEmpty() &&  stack.peek() < array[i]) {
                stack.pop();
            }
            if(!stack.isEmpty()){
                result.add(String.valueOf(stack.peek()));
            }
            else {
                result.add("-");
            }


                stack.push(array[i]);


        }
for (int i=result.size()-1; i>=0; i--) {
    System.out.print(" "+result.get(i));
}
    }
}
