package org.example.Intermediate.Partitioning_Into_Minimum_Number_Of_Deci_Binary_Numbers;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {

    public int minPartitions(String n) {
        for (int i = 9; i >= 0; i--) {
            if (n.contains(String.valueOf(i))) return i;
        }
        return 0;
    }
}
