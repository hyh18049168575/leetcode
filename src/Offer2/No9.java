package Offer2;

//[10,5,2,6]
//100
public class No9 {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int res = 0;
        for (int i = 0;i<nums.length;i++){
            int j = i;
            int total = nums[j];
            while (total<k && j<nums.length){
                res++;
                if (j++ < nums.length){
                    total *= nums[j];
                }
                else j++;
            }
        }
        return res;
    }
    public static int numSubarrayProductLessThanK2(int[] nums, int k) {
        int res = 0;
        if (k<2)return 0;
        int i=0,j=0;
        int total = 1;
        while (j< nums.length){
            total *= nums[j];
            while (total >= k)total/=nums[i++];
            res += j-i+1;
            j++;
        }
        return res;
    }
}
