package arrays_and_hashing;

import java.util.HashMap;

/**
 * 1. Two Sum
 *
 * Given an array of integers nums and an integer target, return indices of the TWO NUMBERS such that they add up to the target
 * You may assume that each input would have EXACTLY ONE SOLUTION and you may not use the same element twice
 * You can return the answer in any order
 *
 * EXAMPLE 1:
 * input: nums = [2,7,11,15] , target = 9
 * output: [0,1]
 * explanation: because nums[0] + nums[1] == 9, we return [0,1]
 *
 * EXAMPLE 2:
 * input: nums = [3,2,4] , target = 6
 * output: [1,2]
 *
 * EXAMPLE 3:
 * input: nums = [3,3] , target = 6
 * output: [0,1]
 *
 * @see <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */

public class TwoSum {

    /**
     *
     *
     *
     * @param nums
     * @param target
     * @return
     */

    public int[] twoSum(int[] nums, int target) {

        //declare hashmap to store index and value
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        //loop through nums array
        for (int i = 0; i < nums.length; i++) {

            //check if any values in the hashmap contain
            if (prevMap.containsKey(nums[i])) {
                return new int[]{prevMap.get(nums[i]), i};
            }

            //insert
            //in the case of example 1; (target)9 - (nums[0])2 = 7
            //so we'll store 7, 0 into the hashmap
            prevMap.put(target - nums[i], i);
        }
        //if the pair isn't found return null
        return null;
    }
}