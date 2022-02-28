package Offer2;

import java.util.Stack;

public class No38 {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int len = temperatures.length;
        int res[] = new int[len];
        for (int i = 0;i < len;i++){
            stack.push(temperatures[i]);
        }
        while (stack.isEmpty()){
            int a = stack.pop();

        }
        return res;
    }
}
