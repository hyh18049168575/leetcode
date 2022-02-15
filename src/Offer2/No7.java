package Offer2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No7 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0;i< nums.length;i++){
            if (nums[i]>0)break;
            if (i > 0 && nums[i] == nums[i-1])continue;
            int j = i+1,k = nums.length-1;
            while (j<k){
                int ans = nums[i] + nums[j] +nums [k];
                if (ans == 0){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while (j<k && nums[j] == nums[j+1])j++;
                    j++;
                }
                else if (ans < 0 && j<k){
                    j++;
                }
                else if (ans > 0 && j<k){
                    k--;
                }
            }
        }
        return res;
    }
}
