package leetcodeNumbers;

import java.util.HashMap;

public class No953 {
    public static boolean isAlienSorted(String[] words, String order) {
        int len = words.length;
        if (len == 1 || len == 0)return true;
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0;i < 26;i++){
            map.put(order.charAt(i),i);
        }
        int l,r;
        for (int i = 1;i < len;i++){
            int x = 0;
            while (x < words[i-1].length() || x < words[i].length()){
                l = (x >= words[i-1].length())?-1 : map.get(words[i-1].charAt(x));
                r = (x >= words[i].length())?-1 : map.get(words[i].charAt(x++));
                if (r > l) break;
                if (r == l)continue;
                if (r < l)return false;
            }
        }
        return true;

    }
}
