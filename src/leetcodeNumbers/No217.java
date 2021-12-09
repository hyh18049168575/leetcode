package leetcodeNumbers;


import java.util.Arrays;

public class No217 {
    public boolean containsDuplicate(int[] nums) {
        boolean a = false;
        Arrays.sort(nums);
        for (int i = 0;i<nums.length-1;i++){
            if (nums[i] == nums[i+1])a = true;
        }
        return a;
    }
}
