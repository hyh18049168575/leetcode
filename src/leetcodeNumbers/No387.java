package leetcodeNumbers;
import java.util.Arrays;

public class No387 {
    public static int firstUniqChar(String s) {
        int b = -1;
        char [] a = s.toCharArray();
        for (int i = 0; i < a.length;i++){
            boolean c = false;
            for (int j = 0; j < a.length;j++){
                if (i != j && a[i] == a[j]){
                    c = false;
                    break;
                }
                c = true;
            }
            if (c == true){
                b = i;
                break;
            }
        }
        System.out.println(b);
        return b;
    }
}
