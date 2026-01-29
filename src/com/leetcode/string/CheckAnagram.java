package com.leetcode.string;

import java.util.Arrays;

public class CheckAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char arr[] = s.toCharArray();
        char brr[] = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        boolean result =  Arrays.equals(arr,brr);
        return result;
    }
    public static void main(String[] args) {
        boolean anagram = isAnagram("anagram", "nagaram");
        System.out.println(anagram);
    }
}
