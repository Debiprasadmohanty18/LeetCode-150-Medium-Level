/* Zigzag Conversion :- 

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R

And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:
string convert(string s, int numRows); 

Example 1:
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"

Example 2:
Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"

Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I

Example 3:
Input: s = "A", numRows = 1
Output: "A"
 
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
