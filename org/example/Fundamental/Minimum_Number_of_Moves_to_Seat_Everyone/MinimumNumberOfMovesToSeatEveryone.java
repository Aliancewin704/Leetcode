package org.example.Fundamental.Minimum_Number_of_Moves_to_Seat_Everyone;

import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone {

    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int ans = 0;
        for (int i = 0;i <= seats.length - 1; i++){
            ans += Math.abs(seats[i] - students[i]);
        }
        return ans;
    }
}
