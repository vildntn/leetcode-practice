package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ScoreOfString scoreOfString = new ScoreOfString();

        scoreOfString.scoreOfString(new String("hello"));

        int[] nums = {2,7,11,15};
        int target = 9;

        TwoSum twoSum = new TwoSum();
        System.out.println("First Solution of Two sum with Brute Force: ");
        twoSum.twoSum(nums,target);
        System.out.println("Second Solution of Two sum with Using Hash Map: ");
        twoSum.twoSumSolution2(nums,target);
    }
}