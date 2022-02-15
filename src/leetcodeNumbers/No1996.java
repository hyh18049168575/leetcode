package leetcodeNumbers;
import java.util.Arrays;

public class No1996 {
    public int numberOfWeakCharacters(int[][] properties) {
        int res = 0;
        Arrays.sort(properties,(a,b)->a[0] == b[0] ? a[1]-b[1] : b[0]-a[0]);
        int max = properties[0][1];
        for (int i = 0;i< properties.length;i++){
            if (properties[i][1] < max){
                res ++;
            }
            max = Math.max(properties[i][1],max);
        }

        return res;
    }
}
