package leetcodeNumbers;

import java.util.Arrays;

public class No242 {
    public static boolean isAnagram(String s, String t) {
        boolean a = false;
        if (s.length() != t.length()){
            a = false;
        }
        else {
            char [] b = s.toCharArray();
            char [] c = t.toCharArray();
            Arrays.sort(b);
            Arrays.sort(c);
            for (int i = 0;i<s.length();i++){
                if (b[i] != c[i]){
                    a = false;
                    break;
                }
                else{
                    a = true;
                }
            }
        }
        return a;
    }
}
