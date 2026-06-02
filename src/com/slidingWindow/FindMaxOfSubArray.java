package com.slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class FindMaxOfSubArray {
    public static long maxSub(int k, ArrayList<Integer> arr,int n){
        long maxSum =Integer.MAX_VALUE;
        long sum =0;
        int index =0;
        while(index<n && index<k){
            sum+=arr.get(index);
            index++;
        }
        maxSum = sum;
        for(int i=1;i<n-k+1;i++){
            int prevoiusSum =arr.get(i-1);
            int nextSum =arr.get(i+k-1);
            sum-=prevoiusSum;
            sum+=nextSum;
            maxSum = Math.max(sum,maxSum);

        }
        return maxSum;
    }

    public static void main(String[] args) {
        long l = maxSub(3, new ArrayList<>(Arrays.asList(23, 1, 4, 35, 6, 7, 8, 9)), 8);
        System.out.println(l);
    }
}
