package com.array;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public  static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int j =i;
            int start = nums[j];
            while(j+1<nums.length && nums[j]+1==nums[j+1]){
            j++;
            }
            if(start==nums[j]){
                list.add(String.valueOf(start));
            }
            else{
                list.add(start+"->"+nums[j]);
            }

           i=j+1;
        }
        return list;

    }
    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0,1,2,4,5,7}));
        System.out.println(System.getProperty("user.name"));

        System.out.println(System.getProperty("os.name"));

    }
}
