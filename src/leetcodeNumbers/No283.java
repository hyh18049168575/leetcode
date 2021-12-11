package leetcodeNumbers;

public class No283 {
        public void moveZeroes(int[] nums) {
            int a = 0;
            int b = 0;
            for (int i = 0;i<nums.length;i++){
                if (nums[i] != 0){
                    nums[a++] = nums[i];
                }
                if (nums[i] == 0) {
                    b++;
                }
            }
            for (int i = nums.length-1;i>= nums.length-b;i--){
                nums[i] = 0;
            }
        }
    }