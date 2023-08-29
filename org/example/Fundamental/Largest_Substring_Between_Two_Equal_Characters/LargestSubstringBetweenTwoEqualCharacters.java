package org.example.Fundamental.Largest_Substring_Between_Two_Equal_Characters;

public class LargestSubstringBetweenTwoEqualCharacters {

    public static int maxLengthBetweenEqualCharacters(String s) {
        int[] arr = new int[124];
        int ans = -1;
        for (int i = 0; i < s.length(); i++){
            if (arr[s.charAt(i)] != 0){
                ans = Math.max(ans,i - arr[s.charAt(i)]);
            } else {
                arr[s.charAt(i)] = i + 1;
            }
        }
        return ans;
    }
}
