package String;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**

题目描述
*连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组； 
*长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。 

输入描述:
*连续输入字符串(输入2次,每个字符串长度小于100)

输出描述:
*输出到长度为8的新字符串数组
 * @author zzy
 *
 */
public class SplitStringBy8bit {
	public void function()
	{
		//输入字符串
		Scanner input = new Scanner(System.in);
		String []strArray=new String[2];
		for(int k = 0;k<2;k++)
		strArray[k]=input.nextLine();
		String str = strArray[0]+" "+strArray[1];
		//按照空格分割字符串
		String [] subStr=str.split("\\s+");
		List<String> strList=new ArrayList<>();
		//按照8位分割字符串
		for(int i =0;i<subStr.length;i++)
		{
			if(subStr[i].length()==8)
			{
				strList.add(subStr[i]);
			}
			if(subStr[i].length()<8)
			{
				while(subStr[i].length()<8)
				{
					//补齐0
					subStr[i]+=0;
				}
				strList.add(subStr[i]);
			}
			if(subStr[i].length()>8)
			{
				//补齐0,使字符串变成8的倍数
				while(subStr[i].length()%8!=0)
				{
					subStr[i]+=0;
				}
				int strNum = subStr[i].length()/8;
				int beginIndex=0;
				//分割成为新的子串
				for(int j =0;j<strNum;j++)
				{
					strList.add(subStr[i].substring(beginIndex,beginIndex+8));
					beginIndex=beginIndex+8;
				}
			}
		}
		//输出字符串
		for(int i=0;i<strList.size();i++)
			System.out.println(strList.get(i));

	}
	
}
