package com.company;

public class Solution {
    public int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        for( int i =0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }



    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        // [1,2,1]

        // считаем колво цифр в числе х
        int n=0;
        int tmpX=x;
        for(;tmpX!=0; n++){
            tmpX/=10;
        }
       int[] nums = new int[n];
        for (int i=0; i<nums.length; i++){
            nums[i]=x%10;
            x/=10;
        }
        for (int i=0; i<nums.length; i++){
            if (nums[i]!=nums[nums.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
