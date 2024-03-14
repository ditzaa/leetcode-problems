package leetcode150.easy;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int k = m + n - 1;
        while(p2 >= 0){
            if(p1 >= 0 && (nums1[p1] >= nums2[p2])){
                nums1[k] = nums1[p1];
                p1--;
            }else{
                nums1[k] = nums2[p2];
                p2--;
            }
            k--;
            System.out.println(Arrays.toString(nums1));
        }
    }
}
