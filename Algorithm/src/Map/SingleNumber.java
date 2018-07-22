package Map;

import java.util.HashMap;
import java.util.Map;

//Given a non-empty array of integers, every element appears twice except for one. Find that single one.
public class SingleNumber {
	 public int singleNumber(int[] nums) {
	        Map<Integer,Integer> map = new HashMap<>();
	        for(int i:nums)
	        {
	            if(map.containsKey(i))
	            {
	                map.put(i,2);
	            }
	            else
	            {
	                map.put(i,1);    
	            }   
	        }
	        for(int i:map.keySet())
	        {
	            if(map.get(i)==1)
	                return i;
	        }
	        return 0;
	    }
}
