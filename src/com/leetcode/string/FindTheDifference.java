package com.leetcode.string;

public class FindTheDifference {
    public static char findDifference(String s, String t){//a aa

        char result =0;
        for(char c:s.toCharArray()){
            result^=c;
        }
        for(char d:t.toCharArray()){
            result^=d;
        }
        return result;
    }

    public static void main(String[] args) {
        char difference = findDifference("abcd", "abcde");
        System.out.println(difference);
    }
}
