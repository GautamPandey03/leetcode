package com.leetcode.easy;

public class SquareRoot {
    static int mySqrt(int x) {
        long start =1;
        long end = x >=1 ?x :1;
        long ans =0;
        while(start<=end){
            long mid =start+(end-start)/2;
            if(mid*mid==x){
                ans =(int) mid;
                break;
            }
            else if(x>mid*mid){
                start =mid+1;
                ans =(int)mid;
            }
            else{
                end =mid-1;
            }
        }

        return (int)ans;
    }

    public static void main(String[] args) {
        int i = mySqrt(8);
        System.out.println(i);
    }
}
