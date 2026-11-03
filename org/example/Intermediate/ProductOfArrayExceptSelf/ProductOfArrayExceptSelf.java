package org.example.Intermediate.ProductOfArrayExceptSelf;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int sum = 1;
        int[] ans = new int[nums.length];
        boolean skipZero = false;
        for(int num: nums){
            if(num == 0){
                if(skipZero){
                    return ans;
                }
                skipZero = true;
                continue;
            }
            sum *= num;
        }
        if(skipZero){
            for(int i = 0; i < nums.length; i++){
                ans[i] = nums[i] != 0 ? 0 : sum;
            }
            return ans;
        }
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i] == 0 ? 0 : sum / nums[i];
        }
        return ans;
    }
}
