package leetcodeNumbers;


public class No125 {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z]", "");
        char []a = s.toCharArray();
        System.out.println(a);
        for (int i = 0;i<a.length/2;i++){
            if (Character.toLowerCase(a[i]) != Character.toLowerCase(a[a.length-1-i])){
                return false;
            }
        }
        return false;
    }
}
