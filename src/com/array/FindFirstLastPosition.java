package com.array;

import java.util.Arrays;

public class FindFirstLastPosition {
    public static int[] searchRange(int[] nums, int target) {//5,7,7,8,8,10],[ 3,4]

    //int end =nums.length-1;
    int ans[] ={-1,-1};
    int start = search(nums,target,true);
    int end =  search(nums,target,false);
    ans[0]=start;
    ans[1]=end;
    return ans;
    }
    private static int search(int nums[],int target,boolean findIndex){
        int start =0;
        int end =nums.length-1;
        int ans =-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(target>nums[mid]){
                start =mid+1;
            } else if (target<nums[mid]) {
                end=mid-1;
            }
            else {
                ans = mid;
                if(findIndex){
                    end=mid-1;
                }
                else {
                    start =mid+1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{1}, 1)));
    }
}
