package com.array;

import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {

        int result = missingNumber(new int[]{0, 1, 2, 4, 5, 6});
        System.out.println(result);
    }
    public static int missingNumber(int nums[]){
            Arrays.sort(nums);
            for(int i =0;i<nums.length;i++){
                if(i!=nums[i]){
                    return i;
                }
            }
            return nums.length;
    }
}
