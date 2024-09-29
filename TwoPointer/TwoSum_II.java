package com.tanmay.TwoPointer;

import java.util.Arrays;

public class TwoSum_II {
	public static void main(String[] args) {
		int[] numbers = {0,0,7,9};
		int target = 0;
		System.out.println(Arrays.toString(twoSum(numbers, target)));
	}
	
	public static int[] twoSum(int[] numbers, int target) 
	{
		int start = 0;
		int end = numbers.length-1;
		
		while(start < end)
		{
			if(numbers[start] + numbers[end] > target)
			{
				end--;
			}
			else if(numbers[start] + numbers[end] < target)
			{
				start++;
			}
			else 
			{
				return new int[] {start+1,end+1};
			}
		}
		
		return numbers;        
    }
}
