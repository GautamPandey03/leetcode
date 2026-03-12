package com.array.medium;

import java.util.HashMap;
import java.util.Map;

public class SubArrayEqualsK {
    public static int subarraySum(int[] arr, int k){
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixSum =0;
        int count_K = 0;
        for(int i =0;i<arr.length;i++){
            prefixSum+=arr[i];
            int target = prefixSum-k;
            if(map.containsKey(target)){
                count_K+=map.get(target);
            }
                map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);

        }
        return count_K;
    }
    public static void main(String[] args) {
        int i = subarraySum(new int[]{1, 2, 3}, 3);
        System.out.println(i);
    }
}
