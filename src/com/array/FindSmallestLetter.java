package com.array;

public class FindSmallestLetter {

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if(target<letters[mid]){
                end =mid-1;
            }
            else{
                start=mid+1;
            }

        }return letters[start%letters.length];
    }

    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'c','f','j'},'c'));
    }
}
