/*
*/

package com.tanmay.String;

public class ZigzagConversion {

	public static void main(String[] args) {
		String s = "PAYPALISHIRING";
		int numRows = 3;
		System.out.println(convert(s, numRows));
	}
	
	public static String convert(String s, int numRows) {
        String[] str = new String[numRows];
        for(int i=0;i<numRows;i++)
        {
            str[i] = "";
        }
        int i = 0;
        while(i<s.length())
        {
            for(int j=0;j<numRows && i<s.length();j++)
            {
                str[j] = str[j] + s.charAt(i++);
                // i++;
            }
            for(int j=numRows-2;j>0 && i<s.length();j--)
            {
                str[j] = str[j] + s.charAt(i++);
                // i++;
            }
        }

        String ans = "";
        for(String a : str)
        {
            ans = ans+a;
        }

        return ans;
    }

}
