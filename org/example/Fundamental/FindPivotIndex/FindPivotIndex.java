package org.example.Fundamental.FindPivotIndex;

public class FindPivotIndex {

    public static int pivotIndex(int[] nums) {
        int sumFundamental = 0;
        for(int i: nums){
            sumFundamental += i;
        }
        int rightArray = sumFundamental;
        int leftArray = 0;
        for (int i = 0; i < nums.length; i++){
            int num = nums[i];
            rightArray -= num;
            if(leftArray == rightArray) return i;
            leftArray += num;
        }
        return -1;
    }
}
