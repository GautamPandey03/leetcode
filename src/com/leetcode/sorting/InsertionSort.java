package com.leetcode.sorting;

public class InsertionSort {
    /*5 3 4 1 2
       3 5 4 1 2
       3 4 5 1 2
       3 4 1 5 2
       3 1 4 5 2
       1 3 4 5 2
       1 3 4 3 2 5
       1 3 2 4 5
       1 2 3 4 5
     */

    public static int[] insertSort(int[] arr,int n){

        int temp=0;
        for(int i =0;i<n-1;i++){
            for(int j =i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] ints = insertSort(new int[]{5, 3, 4, 1, 2}, 5);
        for (int i:ints){
            System.out.print(i+"  ");
        }
    }
}
