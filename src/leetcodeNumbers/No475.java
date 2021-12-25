package leetcodeNumbers;

import java.util.Arrays;

public class No475 {
    public int findRadius(int[] houses, int[] heaters) {
        int max = 0;
        for (int i = 0;i<houses.length;i++){
            int min = Integer.MAX_VALUE;
            for (int j = 0;j<heaters.length;j++){
                if (houses[i] >= heaters[j]){
                    min = Math.min(min,houses[i] - heaters[j]);
                }
                if (houses[i] < heaters[j]){
                    min = Math.min(min,heaters[j] - houses[i]);
                }
            }
            max = Math.max(min,max);
        }
        return max;
    }
    public int findRadius2(int[] houses, int[] heaters) {
    int res = 0;
        Arrays.sort(heaters);
        for(int i=0; i<houses.length; ++i) {
            if (i > 0 && houses[i] == houses[i - 1]) continue;
            // 寻找最左侧边界的二分
            int l = 0, r = heaters.length - 1;
            while (l <= r) {
                int mid = l + ((r - l) >> 1);
                if (heaters[mid] >= houses[i]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            // 极小化极大
            int min = 0;
            if (l >= heaters.length) {
                min = houses[i] - heaters[l - 1];
            } else if (l == 0) {
                min = heaters[l] - houses[i];
            } else {
                min = Math.min(heaters[l] - houses[i], houses[i] - heaters[l - 1]);
            }
            res = Math.max(res, min);
        }
        return res;
    }
}


