package com.leetcode.string;

public class PalindromeString {
    public static boolean isPalindrome(String s) {
        String lower = s.toLowerCase();

        String result = lower.replaceAll("[^a-z0-9]", "");
        StringBuilder object = new StringBuilder(result);
        String rev = object.reverse().toString();

        return result.equals(rev);

        // int length = result.length();
        // for(int i=0;i<length/2;i++){
        //     if(result.charAt(i)!=result.charAt(length-1-i));
        //         return false;
        // }
        // return true;
    }
    public static void main(String[] args) {
        boolean palindrome = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(palindrome);
    }
}
