package Offer2;

public class No18 {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        StringBuilder str1 = new StringBuilder();
        for (int i = 0,j = s.length()-1;i<s.length()/2;i++){
            char a = s.charAt(i);
            char b = s.charAt(j);
            if (Character.isLetterOrDigit(a)){
                str.append(Character.toLowerCase(a));
            }
            if (Character.isLetterOrDigit(b)){
                str1.append(Character.toLowerCase(b));
            }
        }

        return str.toString() == str1.reverse().toString()? true : false;
    }
}
