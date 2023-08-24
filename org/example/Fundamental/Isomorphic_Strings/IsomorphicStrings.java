package org.example.Fundamental.Isomorphic_Strings;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        StringBuilder ansS = new StringBuilder();
        StringBuilder ansT = new StringBuilder();
        int[] arrS = new int[255];
        int[] arrT = new int[255];
        for (int i = 0; i < s.length(); i++) {
            arrS[s.charAt(i)] = t.charAt(i);
            arrT[t.charAt(i)] = s.charAt(i);
        }
        for (int i = 0; i < s.length(); i++){
            ansS.append((char) arrS[s.charAt(i)]);
            ansT.append((char) arrT[t.charAt(i)]);
        }
        return ansS.toString().equals(t) && ansT.toString().equals(s);
    }
}

