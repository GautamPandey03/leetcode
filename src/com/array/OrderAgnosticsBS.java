package com.array;

public class OrderAgnosticsBS {
    static int findTarget(int arr[],int target){
        int start = 0;
        int end  = arr.length-1;
        int mid =0;
        boolean isagnostic = checkAgnostic(arr);
        while(start<=end){
            mid = start+(end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(isagnostic){
                if(target<arr[mid]){
                    end-=mid;
                } else {
                    start+=mid;
                }

            }
            else {
                if(target<arr[mid]){
                    start+=mid;
                } else {
                    end-=mid;
                }
            }
        }return -1;
    }

    //check Array is ascending or descending order
    private static boolean checkAgnostic(int arr[]){
        return arr[0]<arr[arr.length-1];
    }

    public static void main(String[] args) {

        System.out.println(findTarget(new int[]{89,78,56,55,34,23},55));
    }
}
