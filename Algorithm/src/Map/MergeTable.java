package Map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
/**
 * 数据表记录包含表索引和数值，请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 * @author Administrator
 *
 */


public class MergeTable {
	public class map
	{
		public int key;
		public int value;
		public map()
		{
			key=0;
			value=0;
		}
		
	}
	public void QuickSort(map [] a,int left,int right)
	{
		int i=left,j=right,key=a[left].key;
		map temp;
		while(i<j)
		{
			while(i<j&&a[j].key>=key)j--;	//j从后向前遍历，找到一个比key小的值,交换,则j指向key值所在的位置
			if(i<j)						//当j--执行完毕之后,i正好等于j的时候不需要进行额外的交换代码执行
			{
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				i++;
			}
			while(i<j&&a[i].key<=key)i++;	//i从前向后遍历，找到一个比key大的值,交换,则i指向key值所在得位置
			if(i<j)						//当i++执行完毕之后,i正好等于j的时候不需要进行额外的交换代码执行
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j--;
			}
		}											//left,i,right的条件判断是为了当分组只剩下一个元素的时候就无须继续递归了
		if(left<i)QuickSort(a,left,i-1);			//跳出循环之后i和j相等
		if(i<right)QuickSort(a,i+1,right);			//进行递归
	}
	public void function()
	{
		//输入
		Scanner input = new Scanner(System.in);
		map [] map;
		int n=0 ;	
		n = input.nextInt();
		map = new map[n];
		for(int i =0;i<n;i++)map[i]= new map();
		
		for(int i =0;i<n;i++)
		{
			map[i].key=input.nextInt();
			map[i].value=input.nextInt();
		}
		
		//排序
		QuickSort(map, 0, n-1);
		//去重求和
		int i = 0,j=1;
		while(i<n&&j<n)
		{
			if(map[i].key==map[j].key)
			{
				map[i].value+=map[j].value;
				j++;
				continue;
			}
			if(map[i].key!=map[j].key)
			{
				System.out.println(map[i].key+" "+map[i].value);
				i=j;
				++j;
			}
			
		}
		System.out.println(map[i].key+" "+map[i].value);
		
	}
	public void function2() 
	{
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			//TreeMap自动排序，不允许key重复
			Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
			int n = input.nextInt();
			for(int i=0;i<n;i++)
			{
				int key = input.nextInt();
				int value = input.nextInt();
				//去重
				if(map.containsKey(key))
				{
					map.put(key, value+map.get(key));
				}
				else
				{
					map.put(key, value);
				}	
			}
			for(Integer key : map.keySet())
			{
				System.out.println(key + " " + map.get(key));
			}
		}
	}
	
}
