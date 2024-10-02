/* Gas Station :- 

*/

package com.tanmay.LeetCode150Medium.Array;

public class GasStation {
	public static void main(String[] args) {
		int[] gas = {1,2,3,4,5};
		int[] cost = {3,4,5,1,2};
		System.out.println(canCompleteCircuit(gas, cost));
	}
	public static int canCompleteCircuit(int[] gas, int[] cost)
	{
		int pos = 0;
		int sum = 0;
		int total = 0;
		
		for(int i=0;i<gas.length;i++)
		{
			sum = sum + gas[i] - cost[i];
			if(sum < 0)
			{
				total = total + sum;
				pos = i + 1;
				sum = 0;
			}
		}
		total = total + sum;
		return total >=0?pos:-1;
	}
}
