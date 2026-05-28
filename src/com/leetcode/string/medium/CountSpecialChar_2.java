package com.leetcode.string.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CountSpecialChar_2 {
    public static int countSpecialChar(String str) {
        int[] lower = new int[26];
        int[] upper = new int[26];

        Arrays.fill(lower, -1);
        Arrays.fill(upper, -1);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLowerCase(ch)) {
                lower[ch - 'a'] = i;
            } else if (upper[ch - 'A'] == -1) {
                upper[ch - 'A'] = i;
            }
        }

        int ans = 0;

        for (int i = 0; i < 26; i++) {
            if (lower[i] != -1 &&
                    upper[i] != -1 &&
                    lower[i] < upper[i]) {
                ans++;
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        int ans = countSpecialChar("ABCab");
        System.out.println(ans);
    }
}
