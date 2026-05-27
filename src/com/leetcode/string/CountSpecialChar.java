package com.leetcode.string;

import java.util.HashSet;

public class CountSpecialChar {
    public static int countSpecial(String str){
        HashSet<Character> set = new HashSet<>();

        for(char ch : str.toCharArray()) {
            set.add(ch);
        }

        long count = set.stream().filter(y ->{
                    System.out.println(y);
                    return str.indexOf(y + 32) != -1;
        }).count();
        return (int)count;
    }

    public static void main(String[] args) {
        int ans = countSpecial("aAaA");
    }
}
