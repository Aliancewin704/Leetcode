package org.example.Intermediate.Maximum_Substrings_With_Distinct_Start;

public class MaximumSubstringsWithDistinctStart {
    public static int maxDistinct(String s) {
        boolean[] array = new boolean[200];
        int counter = 0;
        for (char c : s.toCharArray()) {
           if (!array[c]){
               array[c] = true;
               counter++;
           }
        }
        return counter;
    }
}
