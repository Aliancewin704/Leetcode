package org.example.Fundamental.Number_Of_Good_Pairs;

public class NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        if (nums.length == 0) return 0;
        int[] arr = new int[11];
        int ans = 0;
        for (int i: nums){
            char c = (char) i;
            ans += arr[c];
            arr[c]++;
        }
        return ans;
    }
}
