package Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 * 输入一个字符串整数数列，根据从小到大顺序排序后输出，如果具有连续的数，只输出最小最大的两个数
 * 所有输入的字符串以，分割
 * 输出字符串以空格分割
 * @author Administrator
 *
 */
public class IntegerSort {
	public void function()
	{
	Scanner input = new Scanner(System.in);
	String str = input.nextLine();
	String [] subStr = str.split("\\,");
	int len = subStr.length;
	int [] num = new int[len];
	List<Integer> temp = new ArrayList<>();
	for(int i=0;i<len;i++)
	{
		num[i]=Integer.parseInt(subStr[i]);
	}
	Arrays.sort(num);
	int i=0,j=1;
	while(i<len&&j<len)
	{
		while(i<len&&j<len&&num[i]!=num[j]-1)
		{
			System.out.print(num[i]+" ");
			i=j;
			j++;
		}
		
		while(i<len&&j<len&&num[i]==num[j]-1)
		{
			temp.add(num[i]);
			i=j;
			j++;
			if(i<len&&j<len&&num[i]!=num[j]-1)
			{
				temp.add(num[i]);
				i=j;
				j++;
				System.out.print(temp.get(0)+" "+temp.get(temp.size()-1)+" ");
			}
		}
	}
	System.out.print(num[len-1]);

	}

}
