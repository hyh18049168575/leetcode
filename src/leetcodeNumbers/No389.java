package leetcodeNumbers;

import java.util.Arrays;

public class No389 {
    public static char solution(String s,String t){
        char ans = t.charAt(t.length()-1);
        for(int i = 0; i < s.length(); i++) {
            ans ^= s.charAt(i);
            ans ^= t.charAt(i);
        }
        return ans;
    }
}
