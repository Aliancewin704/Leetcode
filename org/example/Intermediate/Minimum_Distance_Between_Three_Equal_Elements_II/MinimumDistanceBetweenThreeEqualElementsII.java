package org.example.Intermediate.Minimum_Distance_Between_Three_Equal_Elements_II;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MinimumDistanceBetweenThreeEqualElementsII {

    public static int minimumDistance(int[] nums) {
        Map<Integer, ArrayList<Integer>> pos = new HashMap<>();
        int best = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];
            ArrayList<Integer> q = pos.computeIfAbsent(v, k -> new ArrayList<>());
            q.addLast(i);

            if (q.size() == 3) {
                int first = q.getFirst();
                int third = q.getLast();
                best = Math.min(best, 2 * (third - first));
                q.removeFirst(); // оставляем последние 2, чтобы ловить следующее окно из 3
            }
        }
        return best == Integer.MAX_VALUE ? -1 : best;
    }
}
