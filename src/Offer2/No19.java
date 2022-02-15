package Offer2;
//"abc"
public class No19 {
    public boolean validPalindrome(String s) {
        int i = 0,j = s.length()-1;
        while (i<j){
            if (s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else break;
        }
        if (j - i <= 1)return true;
        String s1 = s.substring(i+1,j+1);
        String s2 = s.substring(i,j);
        if (check(s1) || check(s2))return true;
        return false;
    }
    public boolean check(String s){
        int i = 0,j = s.length()-1;
        while (i<j){
            if (s.charAt(i) != s.charAt(j))return false;
            if (s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
        }
        return true;
    }
}
