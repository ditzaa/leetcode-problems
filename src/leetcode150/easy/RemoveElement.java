package leetcode150.easy;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index;
        int position = 0;
        int k=0;
        for(index=0; index<nums.length; index++){
            if(nums[index] != val){
                nums[position] = nums[index];
                position++;
                k++;
            }
        }
        return k;
    }
}
