package Array;
//Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
// in-place algorithm is an algorithm which transforms input using no auxiliary data structure.
public class RemoveDuplicatesFromSortedArray {
	/**
	 * Define three pointers i,j,carry
	 * Use i to point compared number
	 * Use j to point comparing number
	 * Use carry and j to carry the latter number to cover duplicated number
	 * Define len to count the array.len without duplicated number
	 * @param nums
	 * @return
	 */
	public int removeDuplicates(int[] nums) 
	 {
		 int len = nums.length;
		 if(len<2)return 1;
		 int i =0,j=1,carry = 2;
		 while(j<len)
		 {
			 //Situation duplicated
			 if(nums[i]==nums[j])
			 {
				 while(carry<len&&j<len)
				 {
					 nums[j]=nums[carry];
					 j++;
					 carry++;
				 }
				 len--;
				 j=i+1;
				 carry=j+1;
			 }
			 //Situation respective
			 else {
				 i++;
				 j++;
				 carry++;
			}
		 }
		 return len;
	 }
}
