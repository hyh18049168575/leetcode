package leetcodeNumbers;

public class No1816 {
    public static String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i = 0, b = 0; i < n && b < k; i++) {
            char c = s.charAt(i);
            if (c == ' ') b++;
            if (b < k) sb.append(c);
        }
        System.out.println(sb);
        return sb.toString();
    }
}
