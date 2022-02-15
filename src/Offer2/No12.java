package Offer2;

import java.util.Arrays;

public class No12 {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int total = Arrays.stream(nums).sum();
        for (int i = 0;i< nums.length;i++){
            if (left*2 == (total-nums[i])){
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}
