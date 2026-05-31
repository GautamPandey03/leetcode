package com.leetcode.string;

public class SumOfDigitsConvert {
    public static int getLucky(String s, int k) {
        String sum="";
        int result=0;
        for(int i =0;i<s.length();i++){
            sum+=s.charAt(i)-'a'+1;
        }


        for(int i =0;i<k;i++){
            result =0;
            for(int j =0;j<sum.length();j++){
                result+=sum.charAt(j)-'0';
            }
            sum=result+"";
        }

        return result;

    }

    public static void main(String[] args) {
       int o =  getLucky("leetcode",2);
        System.out.println(o);
    }
}
