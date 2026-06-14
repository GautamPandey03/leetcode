package com.bitOperation;

public class NoOfDigitsInBinary {
    public static int getDigits(int decimal){

        int b =10;
        return (int)(Math.log(decimal)/Math.log(b))+1;
    }

    public static void main(String[] args) {
        int digits = getDigits(54678);
        System.out.println(digits);
    }
}
