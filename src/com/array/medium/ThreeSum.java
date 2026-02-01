package com.array.medium;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
            int left = 0;
            int right = 0;
            int sum = 0;
            Set<List<Integer>> result = new HashSet<>();
            //List<Integer> inner = new ArrayList<>();
            Arrays.sort(nums);
            if (nums.length < 3 || nums == null) {
                return new ArrayList<>();
            }
            for (int i = 0; i < nums.length - 2; i++) {
                left = i + 1;
                right = nums.length - 1;
                while (left < right) {
                    sum = nums[i] + nums[left] + nums[right];
                    if (sum == 0) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        left++;
                        right--;
                    } else if (sum < 0) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
            return new ArrayList<>(result);
        }

    public static void main(String[] args) {
        List<List<Integer>> lists = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(lists);
    }
}
