package Offer2;

public class No2 {
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry!=0){
            int digitA = i >= 0 ? a.charAt(i)-'0' : 0;
            int digitB = j >= 0 ? b.charAt(j)-'0' : 0;
            int sum = digitA+digitB+carry;
            carry = sum > 1 ? 1:0;
            sum = carry == 0 ? sum:sum-2;
            sb.append(sum);
            j--;i--;
        }
        String res = sb.reverse().toString();
        System.out.println(res);
        return res;
    }
}
