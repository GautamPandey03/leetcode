package com.slidingWindow;

public class FindMaxSubOptimizeWay {
    public static void main(String[] args) {

        int maxInSubArray = getMaxSubValue(new int[]{2, 5, 1, 8, 2, 9, 1,8,9,9}, 3);
        System.out.println(maxInSubArray);
    }

    private static int getMaxSubValue(int[] arr, int window) {
        int i=0;
        int j=0;
        int max = Integer.MIN_VALUE;
        int sum =0;
        while(j<arr.length){
            sum+=arr[j];
            if(j-i+1<window){
                j++;
            }
            else if (j-i+1==window) {
                if(sum>max){
                    max=sum;
                }
                sum-=arr[i];
                i++;
                j++;

            }
        }
        return max;
    }
}
