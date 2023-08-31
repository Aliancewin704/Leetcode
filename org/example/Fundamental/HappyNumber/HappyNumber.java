package org.example.Fundamental.HappyNumber;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {
    public static boolean isHappy(int n) {
        List<Integer> list = new ArrayList<>();
        while (n != 1){
            int m = n;
            int sum = 0;
            while (m != 0){
                sum += (m % 10) * (m % 10);
                m = m / 10;
            }
            if (list.contains(sum)){
                return false;
            }
            n = sum;
            list.add(n);
        }
        return true;
    }
}
