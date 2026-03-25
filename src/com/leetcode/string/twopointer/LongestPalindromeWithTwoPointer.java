package com.leetcode.string.twopointer;

public class LongestPalindromeWithTwoPointer {
    public static boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }

    public static void main(String[] args) {
        int start = 0;
        int end=0;
        int max=Integer.MIN_VALUE;
        String str = "babad";
        for (int i=0;i<str.length();i++){
            for (int j =i;j<str.length();j++){
                if(isPalindrome(str, i, j)){
                    if(j-i+1>max){
                        max=j-i+1;
                        start=i;
                        end=j;
                    }

                }
            }
        }
        System.out.println(str.substring(start,end+1));
    }
}
