package leetcodeNumbers;

import java.util.Arrays;
// 1, 1, 3, 3, 1, 2
public class No2170notyet {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int[] cnt0 = new int[100001], cnt1 = new int[100001];
        Arrays.fill(cnt0, 0);
        Arrays.fill(cnt1, 0);
        int a = 0, b = 0, c = 0, d = 0;
        for (int i = 0;i < n;i++){
            if ((i&1)==0) {
                cnt0[nums[i]]++;
                if (cnt0[nums[i]] > cnt0[a]){
                    b = a;
                    a = nums[i];
                }
                else if (cnt0[nums[i]] > cnt0[b] && nums[i] != a){
                    b = nums[i];
                }
            }
            else {
                cnt1[nums[i]]++;
                if (cnt1[nums[i]] > cnt1[c]){
                    d = c;
                    c = nums[i];
                }
                else if (cnt1[nums[i]] > cnt1[d] && nums[i] != c){
                    d = nums[i];
                }
            }
        }

        if (a != c){
            return nums.length - cnt0[a] - cnt1[c];
        }
        if (a == c){
            return (cnt0[a] + cnt1[d]) > (cnt0[b] + cnt1[c]) ? nums.length - cnt0[a] - cnt1[d] : nums.length - cnt0[b] - cnt1[c];
        }
        return 0;
    }
}
