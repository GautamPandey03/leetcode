package com.array;

public class FindTargetInfiniteArray {
    public static int findTarget(int arr[], int target){
        //First Find the Range
        //Start with the box 2
        int start =0;
        int end = 1;

        // condition for target to lie in the range
        while(target>arr[end]){
            int newStart = end+1;
            end = end+(end-start+1)*2;
            start = newStart;
        }
        return biranySearch(arr, start, end, target);

    }
    private static int biranySearch(int arr[], int start, int end, int target){
        while(start<=end){
          int  mid = start+(end-start)/2;

            if(target==arr[mid]){
                return mid;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        System.out.println(findTarget(new int[]{1,3,4,5,7,8,10,12,15},8));
    }
}
