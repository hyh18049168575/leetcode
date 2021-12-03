public class No1446 {
    public static int maxPower(String s) {
        int a = 1;
        int max = 1;
        char b[] = s.toCharArray();
        char c = b[0];
        for (int i=0; i<b.length-1; i++){
            if (b[i+1] == b[i]){
                a++;
                if (a > max){
                    max = a ;
                }
            }
            else {
                max = Math.max(a,max);
                a = 1;
            }
        }
        return max;
    }
}
