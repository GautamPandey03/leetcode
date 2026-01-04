package com.leetcode.easy;

public class FirstOccurenceString {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        int i = new FirstOccurenceString().strStr("sadbutsad", "sad");
        System.out.println(i);
    }
}
