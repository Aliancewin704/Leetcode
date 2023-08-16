package org.example.Fundamental.Faulty_Keyboard;

public class FaultyKeyboard {

    public static String finalString(String s) {
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.charAt(i) == 'i') {
                finalString.reverse();
            } else {
                finalString.append(c);
            }
        }
        return finalString.toString();
    }
}
