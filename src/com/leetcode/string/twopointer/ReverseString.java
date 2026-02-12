package com.leetcode.string.twopointer;

public class ReverseString {
    public static char[] reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j--;
            i++;
        }
        return s;
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        char[] s1 = reverseString(s);
        System.out.println(s1);
    }
}
