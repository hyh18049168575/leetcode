package leetcodeNumbers;

public class No2170notyet {
    public int minimumOperations(int[] nums) {
        int n = 100001;
        int[] cnt0 = new int[n], cnt1 = new int[n];
        for (int i = 0;i<n;i++){
            if ((i&1)==0)cnt0[nums[i]]++;
            else cnt1[nums[i]]++;
        }

    }
}
