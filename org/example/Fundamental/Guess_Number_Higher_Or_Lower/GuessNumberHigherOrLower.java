package org.example.Fundamental.Guess_Number_Higher_Or_Lower;

public class GuessNumberHigherOrLower {

    public  int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = guess(mid);

            if (result == 0) {
                return mid;
            } else if (result == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    int guess(int num) {
        return 0;
    }
}
