package com.sorting;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissingNumber {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] =temp;

            }
            else{
                i++;
            }
        }
        //find missing
        List<Integer> result = new ArrayList<>();//4,3,2,7,8,2,3,1 [1,2,3,4,2,7,8]
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                result.add(index+1);
            }
        }

        return result;
    }
    public static void main(String[] args) {

        List<Integer> disappearedNumbers = findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        System.out.println(disappearedNumbers);
    }
}
