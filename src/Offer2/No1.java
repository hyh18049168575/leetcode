package Offer2;

public class No1 {
    public int divide(int a, int b) {
        if(a == Integer.MIN_VALUE && b == -1){
            return Integer.MAX_VALUE;
        }
        int flag = 0;
        if (a > 0) {
            flag += 1;
            a = -a;
        }
        if (b > 0){
            flag += 1;
            b = -b;
        }
        int res = 0;
        while (a <= b){
            int value = b;
            int k = 1;
            while (value >= 0xc0000000 && a <= value+value){
                k += k;
                value += value;
            }
            a -= value;
            res += k;
        }
        return flag == 1?-res:res;
    }
}
