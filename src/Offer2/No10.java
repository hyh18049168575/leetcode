package Offer2;
//[1,1,1]
//2
public class No10 {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        for (int i = 0;i< nums.length;i++){
            int j = i;
            int total = 0;
            while (j< nums.length){
                total += nums[j];
                if (total == k){
                    res = Math.max(res,j-i+1);
                    j++;
                }
                else {
                    j++;
                }
            }
        }
        return res;
    }
}
