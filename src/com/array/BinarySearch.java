package com.array;

public class BinarySearch {
    static int findTarget(int arr[],int target){
        int start =0;
        int end = arr.length-1;
        int mid =0;
        while(start<=end){
            mid = start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        int result = findTarget(new int[]{12,15,17,23,40,50},17);
        System.out.println(result);
    }
}
