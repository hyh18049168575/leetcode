package leetcodeNumbers;

import java.util.HashMap;

public class No3 {
    public static void main(String[] args) {
        System.out.println(No3("abba"));
    }
    public static int No3(String s){
        if (s.length() == 0)return 0;
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                l = Math.max(l, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            res = Math.max(res, i - l + 1);
        }
        return res;
    }
}
