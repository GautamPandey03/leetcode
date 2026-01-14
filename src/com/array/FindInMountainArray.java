package com.array;

public class FindInMountainArray {
    public static int findInMountainArray(int target, int[] mountainArr){
        if(mountainArr.length<3){
            return -1;
        }
        int peek = findPeekElement(mountainArr,target);
        System.out.println(peek);
        int firstHalf = orderAgnostic(mountainArr,target,0,peek);
        if(firstHalf!=-1){
            return firstHalf;
        }
        return orderAgnostic(mountainArr,target,peek,mountainArr.length-1);
    }

    private static int orderAgnostic(int[] mountainArr, int target, int i, int peek) {
        int start = i;
        int end = peek;
        boolean isAgnostic = mountainArr[i]<mountainArr[peek];
        while(start<= end){
            int mid = start+(end-start)/2;
            if(target == mountainArr[mid]){
                return mid;
            }

            if(isAgnostic){
                if(target>mountainArr[mid]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(target<mountainArr[mid]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }

        }return -1;
    }

    private static int findPeekElement(int[] mountainArr, int target) {
        int start =0;
        int end = mountainArr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(mountainArr[mid]>mountainArr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int result= findInMountainArray(3,new int[]{1,2,4,5,3,1});
        System.out.println(result);
    }
}
