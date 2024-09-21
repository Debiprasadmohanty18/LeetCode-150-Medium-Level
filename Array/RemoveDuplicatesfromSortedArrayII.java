/* Remove Duplicates from Sorted Array II :- 
*/

package Array;

public class RemoveDuplicatesfromSortedArrayII {

	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3,3,3};
		System.out.println(removeDuplicates(nums));
	}
	
	public static int removeDuplicates(int[] nums) {
		int i = 2;
		int j = 2;
        while(i<nums.length)
        {
        	if(nums[i] != nums[j-2])
        	{
        		nums[j] = nums[i];
        		j++;
        	}
        	i++;
        }
        return j;
    }

}
