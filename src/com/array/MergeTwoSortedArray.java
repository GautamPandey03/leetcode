package com.array;

public class MergeTwoSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        for(int p=0;p<m+n;p++){
            System.out.println(nums1[p]);
        }
    }
    public static void main(String[] args) {
    merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
    }
}
