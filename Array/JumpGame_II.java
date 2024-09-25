package com.tanmay.LeetCode150Medium.Array;

public class JumpGame_II {

	public static void main(String[] args) {
		int[] nums = {2,3,1,1,4};
		System.out.println(jump(nums));

	}
	
	public static int jump(int[] nums) 
	{
        int currentStanding = 0;
        int jumps = 0;
        int finaljump = 0;
        
        for(int i=0;i<nums.length-1;i++)
        {
        	currentStanding = Math.max(currentStanding, i + nums[i]);
        	
        	if(i == finaljump)
        	{
        		finaljump = currentStanding;
        		jumps++;
        	}
        	
        	if(currentStanding >= nums.length-1)
        	{
        		return jumps;
        	}
        }
        return jumps;
    }
}
