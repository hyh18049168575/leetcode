package Offer2;

import java.util.Stack;

public class No36 {
    public static final char[] Signs = {'+','-','*','/'};
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens){
            if (isSign(token)){
                calculate(stack,token);
            }
            else stack.push(Integer.parseInt(token));
        }
        return stack.pop();
    }
    public void calculate(Stack<Integer> stack,String token){
        int num1 = stack.pop(),num2 = stack.pop();
        int res = 0;
        switch (token){
            case "+":
                res = num1+num2;
                break;
            case "-":
                res = num2-num1;
                break;
            case "*":
                res = num2*num1;
                break;
            case "/":
                res = num2/num1;
                break;
            default:
                break;
        }
        stack.push(res);
    }
    public boolean isSign(String token){
        if (token.length()!=1)return false;
        char character = token.charAt(0);
        for (char sign:Signs){
            if (sign == character)return true;
        }
        return false;
    }
}
