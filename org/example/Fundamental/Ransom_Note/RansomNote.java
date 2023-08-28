package org.example.Fundamental.Ransom_Note;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] mapa = new int[30];
        for (int i = 0; i < magazine.length(); i++) {
            mapa[magazine.charAt(i) - 96]++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            mapa[ransomNote.charAt(i) - 96]--;
        }
        for (int i : mapa) {
            if (i < 0) return false;
        }
        return true;
    }

}
