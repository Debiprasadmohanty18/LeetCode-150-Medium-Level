/* Jump Game :- 
*/
package com.tanmay.LeetCode150Medium.Array;

public class JumpGame {

	public static void main(String[] args) {
		int[] nums = {1,1,2,3,5,2,0,0,0,1,3};
		System.out.println(canJump(nums));
	}
	
	public static boolean canJump(int[] nums) 
	{
		int finalIndex = nums.length - 1;
		for(int i=nums.length-2;i>=0;i--)
		{
			if(i + nums[i] >= finalIndex)
			{
				finalIndex = i;
			}			
		}
		
		return finalIndex == 0;
	}

}
