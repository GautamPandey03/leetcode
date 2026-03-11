package com.array.medium;

public class ContinuousSubArray {

    public static boolean checkSubarraySum(int[] nums, int k) {
        for(int i =0;i<nums.length-1;i++){
            int temp =nums[i];
            for(int j=i+1;j<nums.length;j++){
                temp+=nums[j];
                if(temp%k==0)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        boolean b = checkSubarraySum(new int[]{23, 2, 3, 6, 7}, 6);
        System.out.println(b);

    }
}
