package org.example;

import java.sql.Array;
import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of
 * the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 *
 * Constraints:
 *
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 *
 *
 * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */


//Brute Force Time Complexity is O(n2)
public class TwoSum{
    public int[] twoSum(int[] nums, int target) {
        int[] sorted = new int [2];
        for (int i=0; i<=nums.length; i++){
            Integer c = target-nums[i];
            for (int j=1; j<=nums.length; j++){
                if(c.equals(nums[j])){
                    sorted[0]=i;
                    sorted[1]=j;
                }
            }
        }
        return sorted;

    }

    //HashMap Time Complexity is O(n)
    public int[] twoSumSolution2(int[] nums, int target) {
        HashMap<Integer,Integer> result = new HashMap<>();

        //If keyIndex is not null then we have a match
        for (int i=0; i<=nums.length; i++){
            Integer keyIndex = result.get(nums[i]);
            if(keyIndex != null){
                return new int[]{i,keyIndex};
            }
            result.put(target-nums[i],i);
        }
        return nums;
    }
}

