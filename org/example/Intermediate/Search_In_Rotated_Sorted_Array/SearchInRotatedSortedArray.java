package org.example.Intermediate.Search_In_Rotated_Sorted_Array;

public class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        if (nums[nums.length - 1] < target) {
            if (nums[0] > target) {
                return -1;
            } else {
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == target) return i;
                    if (nums[i] > target) return -1;
                }
            }
        } else {
            if (nums[0] > target) {
                for (int i = nums.length - 1; i > 0; i--) {
                    if (nums[i] == target) return i;
                    if (nums[i] < target) return -1;
                }
            } else {
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == target) return i;
                    if (nums[i] > target) return -1;
                }
            }
        }
        return -1;
    }
}
