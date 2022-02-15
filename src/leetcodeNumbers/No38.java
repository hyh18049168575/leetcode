package leetcodeNumbers;

public class No38 {
    public static String countAndSay(int n) {
        if (n == 1){
            return "1";
        }
        else {
            String a = countAndSay(n-1);
            StringBuilder b = new StringBuilder();
            int i = 0,j = 1,len = a.length();
            while (j < len) {
                if (a.charAt(i) != a.charAt(j)) {
                    b.append(j - i).append(a.charAt(i));
                    i = j;
                }
                j++;
            }
        b.append(j - i).append(a.charAt(i));
        return b.toString();
        }
    }
}
