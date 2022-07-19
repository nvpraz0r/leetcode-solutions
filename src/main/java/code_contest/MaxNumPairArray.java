package code_contest;

import java.util.ArrayList;
import java.util.List;

/**
 * 2341. Maximum Number of Paris in Array
 *
 * EXAMPLE 1:
 * input: nums = [1, 3, 2, 1, 3, 2, 2]
 * output: [3, 1]
 * explanation:
 * Form a pair with nums[0] and nums[3] and remove them from nums. Now, nums = [3,2,3,2,2].
 * Form a pair with nums[0] and nums[2] and remove them from nums. Now, nums = [2,2,2].
 * Form a pair with nums[0] and nums[1] and remove them from nums. Now, nums = [2].
 * No more pairs can be formed. A total of 3 pairs have been formed, and there is 1 number leftover in nums.
 *
 * EXAMPLE 2:
 * input: nums = [1, 1]
 * output: [1, 0]
 * explanation:
 * Form a pair with nums[0] and nums[1] and remove them from nums. Now, nums = [].
 * No more pairs can be formed. A total of 1 pair has been formed, and there are 0 numbers leftover in nums.
 *
 * EXAMPLE 3:
 * input: nums = [0]
 * output: [0, 1]
 * explanation:
 * No pairs can be formed, and there is 1 number leftover in nums.
 *
 * @see <a href="https://leetcode.com/contest/weekly-contest-302/problems/maximum-number-of-pairs-in-array/">Maximum Number of Pairs in Array</a>
 */

public class MaxNumPairArray {
    public int[] numberOfPairs(int[] nums) {
        //find pairs and increment
        //remove pairs from array
        //return increment and nums.length
        if(nums.length == 0) return new int[]{0, 0};
        if(nums.length == 1) return new int[]{0, 1};

        //initialize variable to track number of pairs in array
        int numberOfPairs = 0;

        //
        List<Integer> pairs = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            pairs.add(nums[i]);
        }

        int numToFind = pairs.get(0);

        for(int i = 0; i < pairs.size(); i++){
            numToFind = pairs.get(i);
            if(numToFind == pairs.get(i)) pairs.remove(numToFind);
            System.out.println(numToFind);
        }

        System.out.println(pairs);

        //return increment variable and the number of left over integers in the array
        return new int[]{numberOfPairs, pairs.size()};
    }
}