package com.slidingWindow;

public class FindMaxForKthCard {
    public static int findMaxForKthCard(int[] arr,int card){

        int leftSum = 0;
        int rightSum = 0;
        int j=arr.length-1;
        int max = Integer.MIN_VALUE;

       for(int i =0;i<=card-1;i++){
           leftSum+=arr[i];
       }
       max = leftSum;
       for(int k=card-1;k>=0;k--){
           leftSum-=arr[k];
           rightSum+=arr[j--];
           max = Math.max(max,leftSum+rightSum);
       }
       return max;

    }

    public static void main(String[] args) {
        int maxForKthCard = findMaxForKthCard(new int[]{6, 2, 3, 4, 7, 2, 1, 7, 1}, 4);
        System.out.println(maxForKthCard);
    }
}
