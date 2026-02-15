package com.array;

public class MoveZeroRight {
    public static void moveZero(int arr[]){

     //   int i=0;
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp =arr[j];
                arr[j++]=arr[i];
                arr[i]=temp;
            }

        }
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        moveZero(new int[]{0,0,2,0,3,4});
    }
}
