package leetcodeNumbers;

import java.util.HashMap;
import java.util.Map;

public class No1 {
    public int[] twoSum(int[] nums, int target) {
        int a = 0;
        int b = 0;
        for (int i = 0; i< nums.length;i++){
            for (int j = i+1;j< nums.length;j++){
                if (nums[i]+nums[j] == target){
                    a=i;b=j;
                }
            }
        }
        return new int[]{a,b};
    }

    public int[] No1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i < nums.length;i++){
            if (map.containsKey(target - nums[i])){
                return new int[] {map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
