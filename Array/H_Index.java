/*
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
