package leetcodeNumbers;

import java.util.Arrays;

public class No136 {
    public int singleNumber(int[] nums) {
        int a = 0;
        if (nums.length>3){

            Arrays.sort(nums);
            if (nums[0]!=nums[1])a=nums[0];
            if (nums[nums.length-1]!=nums[nums.length-2])a = nums[nums.length-1];
            for (int i = 1;i<nums.length-1;i++){
                if (nums[i] != nums[i+1] && nums[i] != nums[i-1]) a=nums[i];
            }
        }
        if (nums.length==1){
            a = nums[0];
        }
        return a;
    }
}
