package Offer2;

public class No53 {
    public int missingNumber(int[] nums) {
        if (nums.length<=0){
            return 0;
        }
        int res = 0;
        for (int i = 0;i<nums.length;i++){
            res = res^nums[i]^i;
        }
        return res^nums.length;
    }
}
