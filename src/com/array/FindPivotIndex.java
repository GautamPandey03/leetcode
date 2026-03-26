package com.array;

public class FindPivotIndex {
    public static int getPivot(int arr[]){
        int total=0;
        for(int i:arr){
            total+=i;
        }
        int leftSum=0;
        for(int i =0;i<arr.length;i++){
            if(leftSum==total-arr[i]-leftSum){
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int index = getPivot(new int[]{1,7,3,6,5,6});
        System.out.println(index);
    }
}
