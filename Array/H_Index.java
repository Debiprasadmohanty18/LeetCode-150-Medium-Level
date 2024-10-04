/* H-Index :- 

Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.
According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.

Example 1:
Input: citations = [3,0,6,1,5]
Output: 3

Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively.
Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.

Example 2:
Input: citations = [1,3,1]
Output: 1

*/


package com.tanmay.LeetCode150Medium.Array;

public class H_Index {

	public static void main(String[] args) 
	{
		int[] citations = {3,0,6,1,5};
		System.out.println(hIndex(citations));
	}
	
	public static int hIndex(int[] citations) {
        int[] author = new int[citations.length+1];
        
        for(int i=0;i<citations.length;i++)
        {
        	if(citations[i] < citations.length)
        		author[i]++;
        	else 
        		author[citations.length]++;
        }
        
        int count = 0;
        for(int i=citations.length;i>=0;i--)
        {
        	count = count + author[i];
        	if(count >= i)
        	{
        		return i;
        	}
        }
        return 0;
    }
}
