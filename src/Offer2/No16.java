package Offer2;

public class No16 {
    public static int lengthOfLongestSubstring(String s) {
        int res = 0;
        boolean [] a = new boolean[256];

        for (int l = 0,r = 0, n = s.length();r < n; r++){
            int index = s.charAt(r);
            while (l <= r && a[index]){
                a[s.charAt(l++)] = false;
            }
            a[index] = true;
            res = Math.max(res,r-l+1);
        }
        return res;
    }
    public static int lengthOfLongestSubstring2(String s) {
        int res = 0;
        int [] a = new int[256];
        for (int l = 0,r = 0, n = s.length();r < n; r++){
            int index = s.charAt(r);
            while (l <= r && a[index] == 1){
                a[s.charAt(l++)]--;
            }
            a[index]++;
            res = Math.max(res,r-l+1);
        }
        return res;
    }
}
