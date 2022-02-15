package leetcodeNumbers;

import java.util.Random;

public class No384 {
    private int[] nums;
    private Random random;
    public void Solution(int[] nums) {
        this.nums = nums;
        random = new Random();
    }

    public int[] reset() {
        return nums;
    }

    public int[] shuffle() {
        if (nums == null){
            return null;
        }
        int[] a = new int[nums.length];
        for (int i = 1; i< nums.length;i++){
            int j = random.nextInt(i+1);
            swap(a,i,j);
        }
        return a;
    }
    public void swap(int[]a , int i, int j){
        if (i != j){
            int b = a[i];
            a[i] = a[j];
            a[j] = b;
        }
    }
}
