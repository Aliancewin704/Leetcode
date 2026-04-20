package org.example.Fundamental.Two_Furthest_Houses_With_Different_Colors;


public class TwoFurthestHousesWithDifferentColors {
    public static int maxDistance(int[] colors) {
        int max = 0;
        for (int i = 0, j = colors.length - 1; i < colors.length; i++, j--) {

            if (colors[i] != colors[colors.length - 1]) {
                max = Math.max(max, colors.length - 1 - i);
            }

            if (colors[j] != colors[0]) {
                max = Math.max(max, j);
            }
            if (max != 0) break;
        }

        return max;
    }


}
