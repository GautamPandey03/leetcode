package com.array.medium;

public class PartitionInDeciBinary {

    public static int minPartition(String n){
        if(n.length()==1)return Integer.parseInt(n);

        int max = Integer.MIN_VALUE;
        for(char c:n.toCharArray()){
            max = Math.max(max,c-'0');
        }
        return max;

    }

    public static void main(String[] args) {
        int result = minPartition("32");
        System.out.println(result);
    }
}
