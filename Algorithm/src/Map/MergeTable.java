package Map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
/**
 * ���ݱ��¼��������������ֵ����Ա�������ͬ�ļ�¼���кϲ���������ͬ��������ֵ����������㣬�������keyֵ������������
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
			while(i<j&&a[j].key>=key)j--;	//j�Ӻ���ǰ�������ҵ�һ����keyС��ֵ,����,��jָ��keyֵ���ڵ�λ��
			if(i<j)						//��j--ִ�����֮��,i���õ���j��ʱ����Ҫ���ж���Ľ�������ִ��
			{
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				i++;
			}
			while(i<j&&a[i].key<=key)i++;	//i��ǰ���������ҵ�һ����key���ֵ,����,��iָ��keyֵ���ڵ�λ��
			if(i<j)						//��i++ִ�����֮��,i���õ���j��ʱ����Ҫ���ж���Ľ�������ִ��
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j--;
			}
		}											//left,i,right�������ж���Ϊ�˵�����ֻʣ��һ��Ԫ�ص�ʱ�����������ݹ���
		if(left<i)QuickSort(a,left,i-1);			//����ѭ��֮��i��j���
		if(i<right)QuickSort(a,i+1,right);			//���еݹ�
	}
	public void function()
	{
		//����
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
		
		//����
		QuickSort(map, 0, n-1);
		//ȥ�����
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
			//TreeMap�Զ����򣬲�����key�ظ�
			Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
			int n = input.nextInt();
			for(int i=0;i<n;i++)
			{
				int key = input.nextInt();
				int value = input.nextInt();
				//ȥ��
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
