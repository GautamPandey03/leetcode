package com.leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class LongestConsecutive {
    public static int findLongestConsecutive(String str){

        List<Character> list = new ArrayList<>();
        int i =0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        while(j<str.length()){
          //  j=i;

            if(!list.contains(str.charAt(j))){
                list.add(str.charAt(j++));
                max=Math.max(max,list.size());
            }
            else{
                //instead of make list as empty we can also remove one by one character
                /*list = new ArrayList<>();
                i++;
                j=i;*/
                list.remove(Character.valueOf(str.charAt(i)));
                i++;
            }

        }
        return max;

    }

    public static void main(String[] args) {
        int result = findLongestConsecutive("cabbdzabcd");
        System.out.println(result);
    }
}
