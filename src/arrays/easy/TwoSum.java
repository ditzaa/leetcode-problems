package arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int complement;
        int n = nums.length;
        for(int i=0; i<n; i++){
            complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{i, map.get(complement)};
            }
            map.put(nums[i], i);
        }

        return  new int[]{};
    }
}
