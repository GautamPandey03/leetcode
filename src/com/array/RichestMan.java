package com.array;

public class RichestMan {
    public int maximumWealth(int[][] accounts) {//[[1,2,3],[3,4,1]]
    int max=Integer.MIN_VALUE;
    for(int i=0;i<accounts.length;i++){
        int sum=0;
        for(int j=0;j<accounts[i].length;j++){
            sum+=accounts[i][j];
        }
        if(max<sum){
            max=sum;
        }
    }
    return max;
    }

    public static void main(String[] args) {
    int[][] account = new int[][]{{1,2,3},{3,5,1}};
        System.out.println(account.length);
        System.out.println(new RichestMan().maximumWealth(account));
    }

    }
