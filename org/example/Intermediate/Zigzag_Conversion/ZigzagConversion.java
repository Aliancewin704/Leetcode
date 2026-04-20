package org.example.Intermediate.Zigzag_Conversion;

public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;
        int row = 0;
        StringBuilder[] ans = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            ans[i] = new StringBuilder();
        }
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            ans[row].append(c);
            if (row == 0 || row == numRows - 1) {
                goingDown = !goingDown;
            }
            row += goingDown ? 1 : -1;
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < ans.length; i++){
            answer.append(ans[i]);
        }
        return answer.toString();
    }
}
