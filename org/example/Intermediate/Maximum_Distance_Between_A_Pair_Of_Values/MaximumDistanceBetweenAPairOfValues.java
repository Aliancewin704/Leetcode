package org.example.Intermediate.Maximum_Distance_Between_A_Pair_Of_Values;

public class MaximumDistanceBetweenAPairOfValues {
    public static int maxDistance(int[] nums1, int[] nums2) {
        int max = 0;
        int now = 0;
        int j = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (i > j) j = i;
            while (j < nums2.length) {
                if (nums1[i] <= nums2[j]) {
                    j++;
                    now++;
                } else {
                    if (max < now) max = now;
                    if (now > 0) now--;
                    break;
                }
            }

        }
        if (max < now) max = now;

        return max == 0 ? max : max - 1;
    }
}
