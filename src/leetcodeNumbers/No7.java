package leetcodeNumbers;

public class No7 {
    public int reverse(int x) {
        int res = 0;
        int a = 0;
        int b = 0;
        boolean flag = true;
        if(x < 0){
            flag = false;
            x = Math.abs(x);
        }
        while (x != 0){
            if(res > (Integer.MAX_VALUE-(res%10))/10){
                return 0;
            }
            b = x % 10;
            x = x / 10;
            res = 10 * res + b;
        }
        return flag? res : -res;
    }
}
