package com.array;

public class RemoveDuplicateFromSorted {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3};
        int res = removeDuplecate(arr);
        for(int i=0;i<res;i++){
            System.out.println(arr[i]+" ");
        }
    }

    private static int removeDuplecate(int[] arr) {
        int j=0;
        for(int i=1;i<arr.length;i++) {
            if (arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;
    }
}
