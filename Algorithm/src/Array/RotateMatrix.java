package Array;

import java.util.Scanner;
/**
 * ����һ��������ȵľ���˳ʱ����ת90�����
 * @author Administrator
 *
 */
public class RotateMatrix {
	public void function()
	{
		//����
				Scanner input = new Scanner(System.in);
				String str = input.nextLine();
				str=str.trim();
				str=str.replaceAll("\n","");
				str=str.replaceAll("\r", "");
				String []newStr=str.split("\\s+");
				int N = newStr.length;
				int [][]array = new int[N][N];
				for(int i = 0;i<N;i++)
				{
					if(newStr[i].length()==1)
					array[0][i]=Integer.parseInt(newStr[i].trim());
					else {
						array[0][i]=Integer.parseInt(String.valueOf(newStr[i].charAt(0)));
					}
				}
				for(int i=1;i<N;i++)
					for(int j=0;j<N;j++)
						array[i][j]=input.nextInt();
				//��ת����������Ƕ������һ��ʼ�Ǻ���һ��һ����������ڱ�ɴ��µ���һ��һ�����
				for(int j=0;j<N;j++)
				{
					for(int i=N-1;i>=0;i--)
					{
						System.out.print(array[i][j]+" ");
					}
					System.out.println();
				}
				//��ת���	
				/*for(int i = 0;i<N;i++)
				{
					for(int j=0;j<N;j++)
					{
						System.out.print(array[N-1-j][i]+" ");
					}
					System.out.println();
				}*/
					
	}
}
