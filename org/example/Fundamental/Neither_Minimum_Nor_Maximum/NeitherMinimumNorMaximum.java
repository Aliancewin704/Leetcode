package org.example.Fundamental.Neither_Minimum_Nor_Maximum;

public class NeitherMinimumNorMaximum {

    public static int findNonMinOrMax(int[] nums) {
        if (nums.length < 3) return -1;
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i <= nums.length - 1; i++) {
            if (nums[i] < min) {
                if (min < max) return min;
                min = nums[i];
                continue;
            }
            if (nums[i] > max) {
                if (min < max) return max;
                max = nums[i];
                continue;
            }
            if (nums[i] == min || nums[i] == max) continue;
            return nums[i];
        }
        return -1;
    }
}
