package com.tanmay.LeetCode150Medium.Array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(Arrays.toString(productExceptSelf(nums)));
	}

	public static int[] productExceptSelf(int[] nums) 
	{
     /* int i=0;
       
        int[] outputNums = new int[nums.length];
        
        while(i<nums.length)
        {
        	int temp = 1;
        	int j=0;
        	while(j<nums.length)
        	{
        		if(i == j)
            	{
        			j++;
            		continue;
            	}
        		temp =  temp * nums[j]; 
        		j++;
        	}
        	outputNums[i] = temp;
        	i++;
        }
        return outputNums;   */
		
		int [] outputNums = new int[nums.length];
		int productOfAllBeforeCurrent = 1;
		int productOfAllAfterCurrent = 1;
		
		for(int i=0;i<nums.length;i++)
		{
			outputNums[i] = productOfAllBeforeCurrent;
			productOfAllBeforeCurrent = productOfAllBeforeCurrent * nums[i];
		}
		
		for(int i=nums.length-1;i>=0;i--)
		{
			outputNums[i] = outputNums[i] * productOfAllAfterCurrent;
			productOfAllAfterCurrent = productOfAllAfterCurrent * nums[i];
		}
		return outputNums;
	}
}
