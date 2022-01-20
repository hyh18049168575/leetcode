package leetcodeNumbers;

import java.util.Stack;

public class No20 {
    public boolean isValid(String s) {
        Stack<Character> res = new Stack<Character>();
        char[] a = s.toCharArray();
        for (char c:a){
            if (c=='('){
                res.push(')');
            }
            else if (c == '['){
                res.push(']');
            }
            else if (c == '{'){
                res.push('}');
            }
            else if (res.isEmpty() || res.pop() != c){
                return false;
            }
        }
        return res.isEmpty();
    }
}
