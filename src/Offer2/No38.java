package Offer2;

import java.util.Stack;
//输入: temperatures = [73,74,75,71,69,72,76,73]
//输出: [1,1,4,2,1,1,0,0]
//输入: temperatures = [30,40,50,60]
//输出: [1,1,1,0]
//输入: temperatures = [30,60,90]
//输出: [1,1,0]

public class No38 {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
//        Stack<Integer> stack1 = new Stack<>();
        int len = temperatures.length;
        int res[] = new int[len];
        for (int i = 0;i<len;i++){
            int a = temperatures[i];
            while (!stack.isEmpty() && a > temperatures[stack.peek()]) {
                res[stack.peek()] = i - stack.pop();

            }
            stack.push(i);
        }
        return res;
    }
}
