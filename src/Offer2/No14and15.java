package Offer2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No14and15 {
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length()>s2.length())return false;
        boolean res = false;
        int [] a = new int[26];
        int [] b = new int[26];
        int n = s1.length();
        int m = s2.length();
        for(int i = 0;i<n;i++){
            a[s1.charAt(i)-'a']++;
            b[s2.charAt(i)-'a']++;
        }
        if (Arrays.equals(a, b)) {
            return true;
        }
        for (int i = n;i<m;i++){
            b[s2.charAt(i)-'a']++;
            b[s2.charAt(i-n)-'a']--;
            if (Arrays.equals(a, b)) {
                return true;
            }
        }
        return res;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<Integer>();
        int [] a = new int[26];
        int [] b = new int[26];
        int n = s.length();
        int m = p.length();
        for(int i = 0;i<n;i++){
            a[s.charAt(i)-'a']++;
            b[p.charAt(i)-'a']++;
        }
        if (Arrays.equals(a, b)) {
            res.add(0);
        }
        for (int i = n;i<m;i++){
            b[p.charAt(i)-'a']++;
            b[p.charAt(i-n)-'a']--;
            if (Arrays.equals(a, b)) {
                res.add(i-n);
            }
        }
        return res;
    }
}
