package Array;

import java.util.Scanner;
/**
 * 输入一个行列相等的矩阵，顺时针旋转90度输出
 * @author Administrator
 *
 */
public class RotateMatrix {
	public void function()
	{
		//输入
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
				//旋转输出，换个角度输出，一开始是横向一行一行输出，现在变成从下到上一列一列输出
				for(int j=0;j<N;j++)
				{
					for(int i=N-1;i>=0;i--)
					{
						System.out.print(array[i][j]+" ");
					}
					System.out.println();
				}
				//旋转输出	
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
