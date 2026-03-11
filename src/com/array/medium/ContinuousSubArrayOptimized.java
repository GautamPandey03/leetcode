package com.array.medium;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubArrayOptimized {
    public static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            {
                prefixSum += nums[i];
                int module = prefixSum % k;
                if (map.containsKey(module)) {
                    if (i - (map.get(module)) >= 2) {
                        return true;
                    }
                } else {
                    map.put(module, i);
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        boolean b = checkSubarraySum(new int[]{23, 2, 3, 6, 7}, 6);
        System.out.println(b);

    }

}
