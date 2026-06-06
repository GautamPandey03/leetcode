package com.leetcode.string;

public class ConvertLuckyFromString {
    public static int getLucky(String s, int k) {
        int sum = 0;
        for (char i : s.toCharArray()) {
            int value = i - 'a' + 1;
            while (value > 0) {
                sum += value % 10;  // Add each digit to sum
                value /= 10;
            }
        }


        while (k-- > 1) {
            int newSum = 0;
            while (sum > 0) {
                newSum += sum % 10;  // Add each digit to newSum
                sum /= 10;
            }
            sum = newSum;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = getLucky("leetcode",2);
        System.out.println(result);
    }
}
