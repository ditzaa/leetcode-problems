package arrays;

public class MaximumSubarray {
    // complexity = O(n)
    // solutions help
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int currentSum = nums[0];
        int l = nums.length;

        for (int i = 1; i < l; i++) {
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            sum = Math.max(currentSum, sum);
        }

        return sum;
    }
}
