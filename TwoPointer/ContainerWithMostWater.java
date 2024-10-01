/*
*/
package com.tanmay.TwoPointer;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] heights = {1,8,6,2,5,4,8,3,8};
		System.out.println(maxArea(heights));
	}
	
	public static int maxArea(int[] heights)
	{
		int start = 0;
		int end = heights.length-1;
		int highestArea = 0;
		
		while(start < end)
		{
			highestArea = Math.max(highestArea, Math.min(heights[start], heights[end]) * (end - start));
			if(heights[start] < heights[end])
			{
				start++;
			}
			else 
			{
				end--;
			}
		}
		return highestArea;
	}

}
