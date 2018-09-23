package String;

import java.util.Scanner;

/**
 * 【问题】:求字符串最小编辑距离
 * 【思路】:动态规划
 * （1）设edit（i,j）表示源串长度为i，目标串长度为j的时候的最小编辑距离
 * （2）源串可编辑（插入、删除、修改），目标串不可编辑
 * （3）edit(i,0)=i，源串删除i个字符
 * （4）edit(0,j)=j，源串插入j个字符
 * （5）当i>0&&j>0时，edit(i,j)=min{edit(i-1,j-1)+flag , edit(i-1,j)+1 , edit(i,j-1)+1}
 * （6）edit(i-1,j-1)+flag表示以源串和目标串之前的子串为基础，比较当前A[i]和B[j]两个字符，若相等flag=0，若不等flag=1；
 * （7）edit(i-1,j)+1表示对源串删除，比如从(1,1)——>(2,1)等效于我将源串长度为2，目的串长度为1的组合变为长度都为1的组合，那也就意味着源串删除1个
 * （8）edit（i,j-1）+1表示对源串插入，比如从(2,0)——>(2,1)等效于基于(2,0)删除完了变成(0,0)然后插入一个元素
 * @author Administrator
 *
 */
public class StringEditDistance {
	public void function()
	{
		Scanner scanner = new Scanner(System.in);
		String source = scanner.nextLine();
		String target = scanner.nextLine();
		int [] [] edit = new int[source.length()+1][target.length()+1];
		for(int i=0;i<=source.length();i++)
		{
			edit[i][0]=i;
		}
		for(int j=0;j<=target.length();j++)
		{
			edit[0][j]=j;
		}
		for(int i=1;i<=source.length();i++)
		{
			for(int j=1;j<=target.length();j++)
			{
				int min = Integer.MAX_VALUE;
				/*System.out.println("i:"+i);
				System.out.println("j:"+j);*/
				int flag = source.charAt(i-1)==target.charAt(j-1)?0:1;
				if(edit[i-1][j]+1<min)
				{
					min = edit[i-1][j]+1;
				}
				if(edit[i][j-1]+1<min)
				{
					min = edit[i][j-1]+1;
				}
				if(edit[i-1][j-1]+flag<min)
				{
					min = edit[i-1][j-1]+flag;
				}
				edit[i][j]=min;
			}
		}
		/*for(int i=0;i<=source.length();i++)
		{
			for(int j=0;j<=target.length();j++)
			{
				System.out.print(edit[i][j]+" ");
				if(j%2==0&&j>0)
					System.out.println();
			}
		}*/
		System.out.println(edit[source.length()][target.length()]);
	}
}
