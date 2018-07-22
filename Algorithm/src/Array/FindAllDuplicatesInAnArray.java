package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesInAnArray {
	public List<Integer> findDuplicates(int[] nums) {
        List<Integer> twice = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
               twice.add(nums[i]); 
        }
        return twice;
    }
	
	public List<Integer> findDuplicates2(int[] nums) {
        List<Integer> twice = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int var = Math.abs(nums[i])-1;
            if(nums[var]<0)
            {
            	twice.add(var+1);
            }
            nums[var]=-nums[var];
        }
        return twice;
    }
}
