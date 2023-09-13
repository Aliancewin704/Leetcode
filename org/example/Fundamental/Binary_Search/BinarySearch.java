package org.example.Fundamental.Binary_Search;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        for (int i = 0, j = nums.length - 1; i < nums.length / 2 + 1; i++, j--) {
            if (nums[i] == target) return i;
            if (nums[j] == target) return j;
        }
        return -1;
    }
}
