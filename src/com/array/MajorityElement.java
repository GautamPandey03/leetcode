package com.array;


public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int count = 1;
        int candidate =nums[0];
        for(int i=1;i<nums.length;i++){
            if(count == 0){
                candidate =nums[i];
                count =1;
            }
           else if(candidate==nums[i]){
                count++;
            }
            else{
                count--;
            }

        }
        return candidate;
    }
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,3,3,1,2,2}));

    }
}
