package org.example.Fundamental.Valid_Anagram;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] charnik = new int[60];
        for (int i = 0; i < s.length(); i++) {
            charnik[s.charAt(i) - 70]++;
        }
        for (int i = 0; i < t.length(); i++) {
            if (charnik[t.charAt(i) - 70] == 0) return false;
            charnik[t.charAt(i) - 70]--;
        }
        return true;
    }
}
