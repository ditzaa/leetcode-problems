package arrays.easy;

public class ProductofArrayExceptSelf {
    // complexity = O(n)
    // time to solve = 20 minutes
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int product = 1;
        int nbOfZeros = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nbOfZeros++;
            } else {
                product *= nums[i];
            }
        }

        if (nbOfZeros == 0) {
            for (int i = 0; i < answer.length; i++) {
                answer[i] = product / nums[i];
            }
        } else if (nbOfZeros < 2){
            for (int i = 0; i < answer.length; i++) {
                if (nums[i] == 0) {
                    answer[i] = product;
                } else {
                    answer[i] = 0;
                }
            }
        } else {
            for (int i = 0; i < answer.length; i++) {
                answer[i] = 0;
            }
        }

        return answer;
    }
}
