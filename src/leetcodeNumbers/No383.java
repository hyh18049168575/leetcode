package leetcodeNumbers;

public class No383 {
    public static boolean canConstruct(String a, String b) {
        int[] c = new int[26];
        for (char d : b.toCharArray()) c[d-'a']++ ;
        for (char d : a.toCharArray()) if (--c[d-'a']<0) {
            return false;
        }
        return true;
    }
}
