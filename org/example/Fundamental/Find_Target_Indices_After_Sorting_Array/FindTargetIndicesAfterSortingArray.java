package org.example.Fundamental.Find_Target_Indices_After_Sorting_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {

    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == target) {
                ans.add(i);
            }
        }
        return ans;
    }
}
