/* Rotate Array :- 

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 
Output: [5,6,7,1,2,3,4]

Explanation :
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]

Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
*/
import java.util.Arrays;


public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 2;
        System.out.println(Arrays.toString(rotate(nums, k)));
    }

    public static int[] rotate(int[] nums, int k) {
        reverse(nums, 0 , nums.length-1);
        reverse(nums, 0 , k-1);
        reverse(nums, k , nums.length-1);
        return nums;
    }

    public static void reverse(int[] nums, int start, int end) {
        while(start <= end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
