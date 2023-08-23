package org.example.Fundamental.StrongPasswordCheckerII;

public class StrongPasswordCheckerII {

    public static boolean strongPasswordCheckerII(String password) {
        boolean up = false;
        boolean low = false;
        boolean num = false;
        boolean sp = false;
        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if ((i < password.length() - 1) && ch == password.charAt(i + 1)) {
                    return false;
                }
                if (ch >= 65 && ch <= 90) {
                    up = true;
                } else if (ch >= 97 && ch <= 122) {
                    low = true;
                } else if (ch >= 48 && ch <= 57) {
                    num = true;
                } else {
                    sp = true;
                }
            }
        }
        if (up && low && num && sp) {
            return true;
        }
        return false;
    }

}
