package com.slidingWindow;

import java.util.List;

public class GetConsecutiveOne {
    public static int getConsecutiveOne(List<Integer> list,int k){
        int countZero = 0;
        int max = Integer.MIN_VALUE;
        int l=0;
        for(int r=0;r<list.size();r++){
            if(list.get(r)==0){
                countZero++;
            }
            if(countZero<=k){
                max=Math.max(max,r-l+1);
            }
            while (countZero>k){
                if (list.get(l)==0){
                    countZero--;
                }
                l=l+1;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int result = getConsecutiveOne(List.of(1,1,1,0,0,0,1,1,1,1,0),2);
        System.out.println(result);

    }
}
