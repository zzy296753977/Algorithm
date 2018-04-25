package Search;
/**
 * 折半查找
 * @author Administrator
 *
 */
public class BinarySearch {
	//递归求解
	public void function(int [] num,int intent,int left,int right)
	{
		if(left<=right)
		{
		//查找
		int middle = (left+right)/2;
		if(num[middle]==intent)
		{
			System.out.println("position:"+(middle+1));
		}
		if(intent<num[middle])
		{
			function(num, intent, left, middle-1);
		}
		if(intent>num[middle])
		{
			function(num, intent, middle+1, right);
		}
		}
	}
	//非递归求解
	public void function2(int [] num,int intent)
	{
		int left = 0;
		int right = num.length-1;
		int middle;
		while(left<=right)
		{
			middle=(left+right)/2;
			if(num[middle]==intent)
			{
				System.out.println("position:"+(middle+1));
				break;
			}
			else if(num[middle]<intent)
			{
				
				left = middle+1;
			}
			else 
			{
				right = middle-1;
			}
		}
	}
}
