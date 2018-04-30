package Array;
//Given an array nums and a value val, remove all instances of that value in-place and return the new length.
public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		 int len = nums.length;
		 if(len==1&&nums[0]==val)return 0;
		 int i =0,j=0,carry =1;
		 while(j<len)
		 {
			 //Situation should be removed
			 if(nums[i]==val)
			 {
				 while(carry<len&&j<len)
				 {
					 nums[j]=nums[carry];
					 j++;
					 carry++;
				 }	 
				 len--;
				 j=i;
				 carry=j+1;
			 }
			 //Situation shouldn't be removed
			 else {
				 i++;
				 j++;
				 carry++;
			}
		 }
		 return len;
    }
}
