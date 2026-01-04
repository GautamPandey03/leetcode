package com.array;

public class FindCeil {
    static int findTarget(int arr[],int target){
        int start =0;
        int end = arr.length-1;
        int mid =0;
            while(start<=end){
                mid = start+(end-start)/2;

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

        return  start;
    }


    public static void main(String[] args) {
        System.out.println(findTarget(new int[]{2,3,5,9,14,16,18},15));


    }
}
