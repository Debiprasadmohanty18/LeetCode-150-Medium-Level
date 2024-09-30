package com.tanmay.String;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String s = "a good   example";
		System.out.println(reverseWords(s));		
	}
	
	public static String reverseWords(String s) 
	{
        String[] t = s.split(" +");
        StringBuilder  sb = new StringBuilder();
        
        for(int i=t.length-1;i>=0;i--)
        {
        	sb = sb.append(t[i] + " ");
        }
        return sb.toString().trim();       
    }

}
