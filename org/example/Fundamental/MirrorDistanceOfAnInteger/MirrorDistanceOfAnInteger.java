package org.example.Fundamental.MirrorDistanceOfAnInteger;

public class MirrorDistanceOfAnInteger {

    public static int mirrorDistance(int n) {
        int reversed = 0;
        int start = n;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return  Math.abs(start - reversed);
    }
}
