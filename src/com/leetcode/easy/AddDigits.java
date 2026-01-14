package com.leetcode.easy;

public class AddDigits {
    public static int addDigits(int num) {
        if(num ==0){
            return 0;
        }
        int result = 0;
        while (num!=0) {
            int mod = num % 10;
            result += mod;
            num /= 10;
            if(num ==0 && (result+"").length()>1){
                num =result;
                result =0;
            }
        }
        return result;
    }
    public static int addDigitsWithFormula(int num){
        if(num==0){
            return 0;
        }
        return 1+(num-1)%9;
    }
    public static void main(String[] args) {
        int p = addDigits(38);
        System.out.println(p);
        System.out.println(addDigitsWithFormula(45));
    }
}
