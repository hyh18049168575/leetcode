package Offer2;

import java.util.Stack;

public class No37 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int as: asteroids){
            if (!stack.isEmpty() && as > 0 && stack.peek() < 0){
                if (stack.peek() == -as){
                    stack.pop();
                    continue;
                }
                else if (stack.peek() < -as)continue;
                else{
                    while (!stack.isEmpty() && stack.peek() > -as)stack.pop();
                    if (stack.isEmpty())stack.push(as);
                }
            }
            else stack.push(as);
        }
        int [] res = new int[stack.size()];
        for (int i = stack.size() - 1;i >= 0;i--){
            res[i] = stack.pop();
        }
        return res;
    }
}
