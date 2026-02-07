package com.slidingWindow;

public class FindFirstNegative {
    public static void print(int arr[], int window){
        int i=0;
        int j=0;

        for(int l =0;l<arr.length-2;l++){
            int sum =0;
            for(int m =l;m<l+window;m++){
                if(arr[m]<0){
                    System.out.println(arr[m]);
                    sum =0;
                    break;
                }
                else {
                    sum+=arr[m];

                }
            }
            if(sum!=0)
                System.out.println(0);
        }
    }
    public static void main(String[] args) {
        print(new int[]{12,-1,-7,8,-16,30,16,28},3);
    }
}
