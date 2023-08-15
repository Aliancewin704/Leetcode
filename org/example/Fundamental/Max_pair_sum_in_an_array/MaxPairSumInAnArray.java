package org.example.Fundamental.Max_pair_sum_in_an_array;

import java.util.HashMap;

public class MaxPairSumInAnArray {

    public static int maxSum(int[] nums) {
        int res = -1;
        if (nums.length == 0 || nums.length == 1) return res;
        int n = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            while (true) {
                if (num == 0) {
                    if (map.get(n) == null) {
                        map.put(n, nums[i]);
                        break;
                    } else {
                        res = Math.max(map.get(n) + nums[i], res);
                        if (map.get(n) < nums[i]) {
                            map.put(n, nums[i]);
                            break;
                        } else {
                            break;
                        }
                    }
                }
                n = Math.max(n, num % 10);
                num = num / 10;
            }
            n = -1;
        }
        return res;
    }
}