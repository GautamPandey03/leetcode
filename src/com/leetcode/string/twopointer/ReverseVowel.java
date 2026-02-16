package com.leetcode.string.twopointer;

public class ReverseVowel {
    public static String reverseVowels(String s) {

        int i = 0;
        int j = s.length()-1;
        char[] arr =s.toCharArray();

        String str = "aeiouAEIOU";
        while (i < j) {
            if ((str.contains(arr[i]+"") && str.contains(arr[j]+""))
                    && arr[i]!=arr[j]){
                char c = arr[i];
                arr[i]=arr[j];
                arr[j]=c;
                i++;
                j--;
            }
            else if(arr[i]==arr[j]){
                j--;
                i++;
            }
            else if(str.contains(arr[i]+"")){
                j--;
            }
            else{
                i++;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String leetcode = reverseVowels("leetcode");
        System.out.println(leetcode);
    }
}
