package com.bitOperation;

public class MagicNumber {
    public static double getMagicValue(int x,int base){
    double total =0;
        while(x>0){
            int last = x&1;
            x=x>>1;
            total+=last*base;
            base=base*5;
        }
        return total;
    }

    public static void main(String[] args) {
        double magicValue = getMagicValue(6, 5);
        System.out.println(magicValue);
    }
}
