package String;

import java.util.Scanner;

/**
 * �����⡿:���ַ�����С�༭����
 * ��˼·��:��̬�滮
 * ��1����edit��i,j����ʾԴ������Ϊi��Ŀ�괮����Ϊj��ʱ�����С�༭����
 * ��2��Դ���ɱ༭�����롢ɾ�����޸ģ���Ŀ�괮���ɱ༭
 * ��3��edit(i,0)=i��Դ��ɾ��i���ַ�
 * ��4��edit(0,j)=j��Դ������j���ַ�
 * ��5����i>0&&j>0ʱ��edit(i,j)=min{edit(i-1,j-1)+flag , edit(i-1,j)+1 , edit(i,j-1)+1}
 * ��6��edit(i-1,j-1)+flag��ʾ��Դ����Ŀ�괮֮ǰ���Ӵ�Ϊ�������Ƚϵ�ǰA[i]��B[j]�����ַ��������flag=0��������flag=1��
 * ��7��edit(i-1,j)+1��ʾ��Դ��ɾ���������(1,1)����>(2,1)��Ч���ҽ�Դ������Ϊ2��Ŀ�Ĵ�����Ϊ1����ϱ�Ϊ���ȶ�Ϊ1����ϣ���Ҳ����ζ��Դ��ɾ��1��
 * ��8��edit��i,j-1��+1��ʾ��Դ�����룬�����(2,0)����>(2,1)��Ч�ڻ���(2,0)ɾ�����˱��(0,0)Ȼ�����һ��Ԫ��
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
