package org.example.Fundamental.Number_of_Beautiful_Pairs;

public class NumberOfBeautifulPairs {

    public static int[][] largestLocal(int[][] grid) {
        int[][] ans = new int[grid.length - 2][grid[0].length - 2];

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                int max = Integer.MIN_VALUE;
                for (int k = i; k < i + 3; k++) {
                    for (int m = j; m < j + 3; m++) {
                        max = Math.max(max, grid[k][m]);
                    }
                }
                ans[i][j] = max;
            }
        }
        return ans;
    }
}
