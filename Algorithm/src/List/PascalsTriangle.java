package List;

import java.util.ArrayList;
import java.util.List;

//Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
public class PascalsTriangle {
	 public List<List<Integer>> generate(int numRows) 
	 {
		 List<List<Integer>>list = new ArrayList<List<Integer>>();
	       for(int i=0;i<numRows;i++)
	       {
	    	   List<Integer> temp = new ArrayList<Integer>();
	    	   list.add(temp);
	    	   for(int j=0;j<i+1;j++)
	    	   {
	    		   if(j==0||j==i)
	    		   {
	    			   list.get(i).add(1);
	    		   }
	    		   else
	    		   {
	    			   list.get(i).add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
	    		   }
	    	   }
	       }
	       return list;
	 }
}
