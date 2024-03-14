package leetcode150.easy;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int j = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
                k++;
            }
        }

        return k;
    }
}
