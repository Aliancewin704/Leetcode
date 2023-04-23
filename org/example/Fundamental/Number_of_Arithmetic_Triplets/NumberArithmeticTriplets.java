package org.example.Fundamental.Number_of_Arithmetic_Triplets;

import java.util.*;

public class NumberArithmeticTriplets {

    public static int numberArithmeticTriplets(int[] nums, int dif) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i]) && set.contains(dif + nums[i]) && set.contains(nums[i] + dif * 2)) {
                ans++;
            }
        }
        return ans;
    }
}
