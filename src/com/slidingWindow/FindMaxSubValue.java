package com.slidingWindow;

public class FindMaxSubValue {
    public static int getMaxInSubArray(int arr[],int k){//2,5,1,8,2,9,1,5
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length-2;i++){
            int temp =0;
            for(int j=i;j<i+k;j++){
                temp+=arr[j];
            }
            if(max<temp){
                max=temp;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int maxInSubArray = getMaxInSubArray(new int[]{2, 5, 1, 8, 2, 9, 1,8,9,9}, 3);
        System.out.println(maxInSubArray);
    }
}
