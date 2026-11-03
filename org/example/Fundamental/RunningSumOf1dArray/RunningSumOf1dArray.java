package org.example.Fundamental.RunningSumOf1dArray;

public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;
        for (int num = 0; num < nums.length; num++){
            sum += nums[num];
            ans[num] = sum;
        }
        return ans;
    }
}
