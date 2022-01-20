package leetcodeNumbers;

public class No53 {
    public int maxSubArray(int[] nums) {
        int a = nums[0];
        int max = nums[0];
        for (int i = 1;i < nums.length;i++){
            a = Math.max(a,0)+nums[i];
            max = Math.max(max,a);
        }
        return max;
    }
}
