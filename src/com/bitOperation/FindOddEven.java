package com.bitOperation;

public class FindOddEven {
    public static boolean getOddEven(int x){
        return (x & 1) == 1;
    }

    public static void main(String[] args) {
        boolean oddEven = getOddEven(5);
        if(oddEven){
            System.out.println("Odd Number");
        }
        else {
            System.out.println("Even Number");
        }
    }

}
