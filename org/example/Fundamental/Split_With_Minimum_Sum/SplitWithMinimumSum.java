package org.example.Fundamental.Split_With_Minimum_Sum;

public class SplitWithMinimumSum {

    public static int splitNum(int num) {
        int num1 = 0;
        int num2 = 0;
        boolean flag = false;
        for (int i = 0; i <= 1; i++) {
            int[] minAndPtd = findMinNum(num);
            num = numReboot(num, minAndPtd[1]);
            if (!flag) {
                num1 = minAndPtd[0];
                flag = true;
                continue;
            }
            num2 = minAndPtd[0];
            flag = false;
        }
        while (num != 0) {
            int[] minAndPtd = findMinNum(num);
            num = numReboot(num, minAndPtd[1]);
            if (!flag) {
                num1 = num1 * (int) Math.pow(10, (int) Math.log10(minAndPtd[0]) + 1) + minAndPtd[0];
                flag = true;
                continue;
            }
            num2 = num2 * (int) Math.pow(10, (int) Math.log10(minAndPtd[0]) + 1) + minAndPtd[0];
            flag = false;
        }
        return num1 + num2;
    }

    public static int[] findMinNumWithoutZero(int num) {
        int min = 9;
        int all = 0;
        int counter = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit < min && digit != 0) {
                min = digit;
                counter = all;
            }
            num /= 10;
            all++;
        }
        return new int[]{min, counter};
    }

    public static int[] findMinNum(int num) {
        int min = 9;
        int all = 0;
        int counter = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit < min) {
                min = digit;
                counter = all;
            }
            num /= 10;
            all++;
        }
        return new int[]{min, counter};
    }

    public static int numReboot(int num, int positionToDelete) {
        int leftPart = num / (int) Math.pow(10, positionToDelete + 1);
        int rightPart = num % (int) Math.pow(10, positionToDelete);
        num = leftPart * (int) Math.pow(10, positionToDelete) + rightPart;
        return num;
    }
}
