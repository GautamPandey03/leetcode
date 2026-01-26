package com.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateInRange {
    public static boolean containsNearbyDuplicateUsingSet(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
    }
    public static boolean  containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
            for(int i =0;i<nums.length;i++){
                if(!map.containsKey(nums[i])){
                    map.put(nums[i],i);
                }
                else{
                    int abs = Math.abs(i-map.get(nums[i]));
                    if(abs<=k){
                        return true;
                    }
                    else{
                        map.put(nums[i],i);
                    }
                }
            }
            return false;
}

public static void main(String[] args) {
    boolean b = containsNearbyDuplicate(new int[]{1,0,1,1},1);
    System.out.println(b);
    System.out.println(containsNearbyDuplicateUsingSet(new int[]{1,2,3,1},3));
}
}
