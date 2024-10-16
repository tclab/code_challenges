package com.tclab.cc.lc.bg;

// https://leetcode.com/problems/running-sum-of-1d-array/description/
class RunningSumOneDArray {

    public static int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] result = runningSum(new int[]{1, 1, 1, 1});
        for (int num : result) {
            System.out.print(num+",");
        }
    }
}