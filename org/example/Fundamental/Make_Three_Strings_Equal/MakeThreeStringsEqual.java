package org.example.Fundamental.Make_Three_Strings_Equal;


public class MakeThreeStringsEqual {
    
    public static int findMinimumOperations(String s1, String s2, String s3) {
        int min = Math.min(Math.min(s1.length(), s2.length()), s3.length());
        int c = 0;
        for (int i = 0; i < min; i++) {
            if (s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) {
                c++;
            } else if (c == 0) {
                return -1;
            } else {
                break;
            }
        }
        return (s1.length() - c) + (s2.length() - c) + (s3.length() - c);
    }
    
}