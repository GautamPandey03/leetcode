package com.slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FindFirstNegativeOptimized {
    public static void printNegative(int arr[], int window){
        int i =0;
        int j =0;
        List<Integer> list = new ArrayList<>();
        while(j<arr.length){
            if(arr[j]<0){
                list.add(arr[j]);
            }
            if(j-i+1<window){
                j++;
            }
            else if (j-i+1==window) {
                if(list.isEmpty()){
                    list.add(0);
                   // i++;
                }
                else {
                    System.out.println(list.get(0));
                    if(arr[i]==list.get(0)){
                        list.remove(0);
                    }
                    i++;
                    j++;
                }

            }
        }
    }

    public static void main(String[] args) {
        printNegative(new int[]{12,-1,-7,8,-16,30,16,28},3);
    }
}
