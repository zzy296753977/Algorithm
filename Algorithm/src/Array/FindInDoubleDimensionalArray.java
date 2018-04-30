package Array;

public class FindInDoubleDimensionalArray 
{
	 //方法一：遍历每一行，在每一行用二分搜索复杂度n^2logn
	 public boolean Find(int target, int [][] array) 
	 {
		 //遍历每一行
		 for(int i=0;i<array.length;i++)
		 {
			 //在每一行进行二分搜索
			 int left = 0;
			 int right = array[0].length-1;
			 int middle;
			 while(left<=right)
			 {
				 middle=(left+right)/2;
				 if(array[i][middle]==target)
				 {
					 return true;
				 }
				 else if(array[i][middle]<target)
				 {
					 left=middle+1;
				 }
				 else {
					right = middle-1;
				}
			 }
		 }
		 return false;   
	 }
	 //方法二：从左下角开始，大于这个数→移一个，小于这个数上移一个
	 //画图可以知道为什么只用上移和右移而不用左移下移
	 public boolean Find2(int target, int [][] array) 
	 {
		int i = array.length-1;
		int j=0;
		while(i>=0&&j<array[0].length)
		{
			if(target==array[i][j])
			{
				return true;
			}
			else if(target<array[i][j])
			{
				i--;
				continue;
			}
			else {
				j++;
				continue;
			}
		}
		return false; 
	 }
}
