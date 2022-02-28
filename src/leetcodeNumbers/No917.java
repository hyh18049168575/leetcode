package leetcodeNumbers;

public class No917 {
    public String reverseOnlyLetters(String s) {
        int i = 0,j = s.length();
        char[] a = s.toCharArray();
        while (i<j){
         while (!Character.isLetter(a[i]))i++;
         while (!Character.isLetter(a[j]))j--;
         char tem = a[i];
         a[i] = a[j];
         a[j] = tem;
         i++;j--;
        }
        return new String(a);
    }
}
