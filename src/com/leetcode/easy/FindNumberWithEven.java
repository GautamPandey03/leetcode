package com.leetcode.easy;

public class FindNumberWithEven {
    public static int  findNumbers(int[] nums) {//[12,345,2,6,7896]
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    //method to check weather number is even or not
    private static boolean even(int num){
        return findDigits(num)%2==0;
    }
    //method to count digits
    private static int findDigits(int num) {
        if (num == 0) {

            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Number of even is "+findNumbers(new int[]{12,345,2,6,7896}));
    }

}
