package arrays_and_hashing;

import java.util.HashSet;

/**
 * 217. Contains Duplicate
 *
 * Given an array of integers, return true if any value appears AT LEAST TWICE
 * in the array and return false if every element is distinct
 *
 * EXAMPLE 1:
 * input: nums = [1,2,3,1]
 * output: true
 *
 * EXAMPLE 2:
 * input: nums = [1,2,3,4]
 * output: false
 *
 * EXAMPLE 3:
 * input: nums = [1,1,1,3,3,4,3,2,4,2]
 * output: true
 *
 * @see <a href="https://leetcode.com/problems/contains-duplicate/">Contains Duplicate</a>
 */
public class ContainsDuplicate {

    /**
     *
     * Objective of the problem is to determine if the parameter array contains ANY duplicates
     *
     * Pseudo Code
     *  declare data structure
     *  loop through nums
     *      if data structure contains nums[i]
     *          return true
     *      add nums[i] to data structure
     *  return false
     *
     * @param nums array of integers
     * @return true if the array contains AT LEAST ONE duplicate
     * @return false if the array contains no duplicates
     *
     * Afterthought:
     * Unfortunately an ArrayList does not meet the computing time limit so I opted for a HashSet
     */
    public boolean containsDuplicate(int[] nums){
        //declare a new hashset to populate with parameter array
        HashSet<Integer> mySet = new HashSet<>();

        //loop through parameter array
        for(int i = 0; i < nums.length; i++){
            //check if arraylist contains the current number in the array
            //if mySet does contain a number found in the array then it will return true
            //thereby exiting the function
            if(mySet.contains(nums[i])) return true;

            //if mySet does not contain the current number in the array
            //add the current value to mySet and continue the loop
            mySet.add(nums[i]);
        }

        //if myArr does not contain any duplicates
        //return false and exit the function
        return false;
    }
}
