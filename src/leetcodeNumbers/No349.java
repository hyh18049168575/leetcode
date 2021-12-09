package leetcodeNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No349 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        int a = 0;
        int b = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        while (a<nums1.length && b<nums2.length){
            if (nums1[a]<nums2[b]){
                a++;
            }
            else if (nums1[a]>nums2[b]){
                b++;
            }
            else if (nums1[a] == nums2[b]){
                list.add(nums1[a]);
                a++;b++;
            }
        }
        int d = list.size();
        int[] result = new int[d];
        for (int i = 0;i<d;i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
