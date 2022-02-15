package leetcodeNumbers;

public class No88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    //nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        int i = m-1;
        int j = n-1;
        int end = m+n-1;
        while (j>=0){
            nums1[end--] = (i>=0 && nums1[i]>nums2[j]) ? nums1[i--]:nums2[j--];
        }
    }
}
