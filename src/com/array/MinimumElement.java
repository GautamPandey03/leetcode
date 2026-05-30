package com.array;

import java.util.Arrays;
import java.util.Map;

public class MinimumElement {
    public static int getMinValue(int nums[]){
        int z=Arrays.stream(nums).min().getAsInt();
        if(z+"".length()<2){
            return z;
        }
        else{
            String s=z+"";
            int sum =0;
            System.out.println(s);
            for(int i =0;i<s.length();i++){
                sum+=s.charAt(i)-'0';
            }
            return sum;
        }
    }
    public static int getMinimum(int nums[]){
        int result = Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            String str = nums[i]+"";
            int sum =0;
            for(int j=0;j<str.length();j++){

                sum+=str.charAt(j)-'0';
            }
            result = Math.min(result,sum);
        }
        return result;
    }

    public static void main(String[] args) {
        int minValue = getMinimum(new int[]{10, 20, 30, 40});

        System.out.println(minValue);

    }
}
