package Offer2;

import java.util.HashMap;

public class No11 {
    public static int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int pre = 0;
        int res = 0;
        for (int i =0;i< nums.length;i++){
            pre += nums[i]==0 ? -1 : 1;
            if (map.containsKey(pre)) {
                res = Math.max(res, i - map.get(pre));
            }
            else {
                map.put(pre, i);
            }
        }
        return map.get(0);
    }
}
