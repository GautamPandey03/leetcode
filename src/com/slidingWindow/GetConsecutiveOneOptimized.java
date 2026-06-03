package com.slidingWindow;

import java.net.Inet4Address;
import java.util.List;

public class GetConsecutiveOneOptimized {
    public static int getConsecutive(List<Integer> arr, int k){
        int zero = 0;
        int l=0;
        int r=0;
        int max = Integer.MIN_VALUE;
        while(r<arr.size()){
            if(arr.get(r)==0){
                zero++;
            }
            if(zero<=k){
                max = Math.max(max,r-l+1);
            }
            if(zero>k){
                if(arr.get(l)==0){
                    zero--;

                }
                l=l+1;
            }r++;

        }
        return max;
    }

    public static void main(String[] args) {
        int result = getConsecutive(List.of(1,1,1,0,0,0,1,1,1,1,0),2);
        System.out.println(result);
    }
}
