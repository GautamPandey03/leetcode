package com.leetcode.string.twopointer;

public class LongestPalindromic {
    public static String longestPalindrome(String s) {
        if(s.length()<2){
            return s;
        }
        String result = "";
    for(int i =0;i<s.length();i++){
        String temp = "";
        for(int j =i;j<s.length();j++){
//            temp.append(s.charAt(j));
            temp+=s.charAt(j);
            StringBuilder check = new StringBuilder(temp);

            if((temp.contentEquals(check.reverse()) && temp.length()>result.length())){
               // result = temp.toString();
                result = temp;
            }
        }

    }
        return result;


    }

    public static void main(String[] args) {
        String rs = longestPalindrome("babad");
        System.out.println(rs);
    }
}
