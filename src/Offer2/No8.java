package Offer2;

public class No8 {
    public static int minSubArrayLen(int target, int[] nums) {
        if (nums.length == 0)return 0;
        if (nums[0]>=target)return 1;
        if (nums.length == 1){
            return 0;
        }
        int res = Integer.MAX_VALUE;
        int i = 0;
        int sum = 0;
        for (int j = 0;j< nums.length;j++){
            sum += nums[j];
            while (sum>=target){
                res = Math.min(res,j-i+1);
                sum -= nums[i];
                i++;
            }
        }
        return res>nums.length? 0:res;
    }
}
