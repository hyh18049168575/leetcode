package Offer2;

import java.util.HashMap;
import java.util.Map;

public class No4 {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<Integer,Integer>();
        for (int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        int res = 0;
        for (Map.Entry<Integer,Integer> entry : freq.entrySet()){
            int num = entry.getKey();
            int ans = entry.getValue();
            if (ans == 1){
                res = num;
                break;
            }
        }

        return res;
    }
    public int singleNumber2(int[] nums) {
        int res = 0;
        for (int i = 0;i<32;i++){
            int a = 0;
            for (int num : nums){
                a += (num>>i)&1;
            }
            if (a%3 != 0){
                res |= (1 << i);
            }
        }
        return res;
    }
}
