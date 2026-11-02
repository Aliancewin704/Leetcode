package org.example.Intermediate.Jump_Game_IX;

public class JumpGameIX {
    public static int[] maxValue(int[] nums) {
        int[] ans = new int[nums.length];
        int[] prefixMax = prefixMaxFind(nums);
        int[] suffixMin = suffixMinFind(nums);
        int groupStart = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (prefixMax[i] <= suffixMin[i + 1]) {
                for (int j = groupStart; j <= i; j++) {
                    ans[j] = prefixMax[i];
                }
                groupStart = i + 1;
            }
        }
        for (int j = groupStart; j < nums.length; j++) {
            ans[j] = prefixMax[nums.length - 1];
        }

        return ans;
    }

    private static int[] prefixMaxFind(int[] nums) {
        int value = 0;
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num > value) {
                value = num;
            }
            array[i] = value;
        }

        return array;
    }

    private static int[] suffixMinFind(int[] nums) {
        int value = nums[nums.length - 1];
        int[] array = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            if (num < value) {
                value = num;
            }
            array[i] = value;
        }

        return array;
    }
}
