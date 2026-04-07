package com.leetcode.string;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class LongestConsecutiveHashMap {
    public static int findLongestConsecutive(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        int r=0;
        int max  = Integer.MIN_VALUE;
        while(r<str.length()){

            char c = str.charAt(r);
            if(map.containsKey(c)){
                if(map.get(c)>=l){
                    l=map.get(c)+1;
                }
            }
            max=Math.max(max,r-l+1);
            map.put(c,r);
            r++;


        }
        return max;
    }

    public static void main(String[] args) {
        int result = findLongestConsecutive("cabbdzabcd");
        System.out.println(result);
    }

}
