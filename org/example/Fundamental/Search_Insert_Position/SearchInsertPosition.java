package org.example.Fundamental.Search_Insert_Position;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        if (nums[0] >= target) return 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] <= target && target <= nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
}
