package Offer2;

public class No17 {
    int[] map2;
    int[] map1;
    public String minWindow(String s, String t) {
        int length1 = s.length();
        int length2 = t.length();
        if (length2>length1) return new String();
        map1 = new int[96];
        map2 = new int[96];
        int dif=0;
        for (int i = 0; i < length2; i++) {
            int i1 = t.charAt(i) - ' ';
            map1[i1]++;
            if (map1[i1]==1) dif++;
        }
        int left=0,right=0,count=0;
        String ans=new String(s+' ');
        while (right<length1){
            int i = s.charAt(right++) - ' ';
            map2[i]++;
            if (map2[i]==map1[i]){
                count++;
            }
            while (count==dif){
                if (ans.length()>right-left){
                    ans=new String(s.substring(left,right));
                }
                int i1 = s.charAt(left++) - ' ';
                map2[i1]--;
                if (map2[i1]<map1[i1]) count--;
            }
        }
        if (ans.length()==length1+1) return new String();
        return ans;
    }
//"ADOBECODEBANC"
//        "ABC"
    public static String minWindow2(String s, String t) {

        int n = s.length();
        int m = t.length();
        if (m>n)return new String();
        int[] map1 = new int[96];
        int[] map2 = new int[96];
        int dif = 0;
        for(int i = 0;i<m;i++){
            int i1 = t.charAt(i) - ' ';
            map1[i1]++;
            if (map1[i1] == 1)dif++;
        }
        int l=0,r=0,cnt=0;
        String res = new String(s + ' ');
        while (r < n){
            int i = s.charAt(r++) -' ';
            map2[i]++;
            if (map2[i] == map1[i])dif--;
            while (dif == cnt){
                res = new String(res.length()>r-l?s.substring(l,r):res);
                int i1 = s.charAt(l++)-' ';
                map2[i1]--;
                if (map2[i1]<map1[i1])dif++;
            }
        }
        if (res.length() == s.length()+1)return new String();
        return res;

    }
}
