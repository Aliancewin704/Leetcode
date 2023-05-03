package org.example.Fundamental.MostCommonWord;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class MostCommonWord {

    public static String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.split("[ !?',;.]+");
        HashMap<String, Integer> hashMap = new HashMap<>();
        Set<String> list =new HashSet<>(Arrays.asList(banned));
        for (String s : words) {
            String word = s.toLowerCase();
            if (!list.contains(word) && !word.equals("")) {
                hashMap.merge(word, 1, Integer::sum);
            }
        }
        int max = 0;
        String ans = "";
        for(Map.Entry<String,Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() > max) {
                ans = entry.getKey();
                max = entry.getValue();
            }
        }
        return ans;
    }
}
