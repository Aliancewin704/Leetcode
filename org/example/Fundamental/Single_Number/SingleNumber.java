package org.example.Fundamental.Single_Number;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int[] arr = new int[60000];
        for(int n: nums){
            arr[n + 30000]++;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1) return i - 30000;
        }
        return -1;
    }
}
