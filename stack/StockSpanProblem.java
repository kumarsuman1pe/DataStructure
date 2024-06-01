package DataStructure.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StockSpanProblem {
    // input: {100, 80, 60, 70, 60, 75, 85};
    // op:1 1 1 2 1 4 6
    public static void main(String[] args) {
        int[] stock = {100, 80, 60, 70, 60, 75, 85};
        int[] span = calculateStockSpan(stock);
        for (int i = 0; i < span.length; i++) {
            System.out.print(i - span[i] + " ");
        }
    }

    private static int[] calculateStockSpan(int[] stock) {
        int[] span = new int[stock.length];
        Stack<List<Integer>> stack = new Stack<>();
        for (int i = 0; i < stock.length; i++) {
            List<Integer> list = new ArrayList<>(2);
            while (!stack.isEmpty() && stack.peek().get(1) < stock[i]) {

                stack.pop();
            }
            if (!stack.isEmpty()) {
                span[i] = stack.peek().get(0);
            } else {
                span[i] = -1;
            }
            list.add(0, i);
            list.add(1, stock[i]);
            stack.push(list);
            //list.clear();
        }
        return span;
    }
}
