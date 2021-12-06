package leetcodeNumbers;

public class No26 {
    public int removeDuplicates(int[] nums) {
        int a = 0;
        for(int i = 0; i < nums.length-1 ;i++){
            if(nums[i] != nums[i+1]){
                nums[++a] = nums[i+1];
            }
        }
        return a+1;
    }
}
