package String;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**

��Ŀ����
*���������ַ������밴����Ϊ8���ÿ���ַ�����������µ��ַ������飻 
*���Ȳ���8���������ַ������ں��油����0�����ַ��������� 

��������:
*���������ַ���(����2��,ÿ���ַ�������С��100)

�������:
*���������Ϊ8�����ַ�������
 * @author zzy
 *
 */
public class SplitStringBy8bit {
	public void function()
	{
		//�����ַ���
		Scanner input = new Scanner(System.in);
		String []strArray=new String[2];
		for(int k = 0;k<2;k++)
		strArray[k]=input.nextLine();
		String str = strArray[0]+" "+strArray[1];
		//���տո�ָ��ַ���
		String [] subStr=str.split("\\s+");
		List<String> strList=new ArrayList<>();
		//����8λ�ָ��ַ���
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
					//����0
					subStr[i]+=0;
				}
				strList.add(subStr[i]);
			}
			if(subStr[i].length()>8)
			{
				//����0,ʹ�ַ������8�ı���
				while(subStr[i].length()%8!=0)
				{
					subStr[i]+=0;
				}
				int strNum = subStr[i].length()/8;
				int beginIndex=0;
				//�ָ��Ϊ�µ��Ӵ�
				for(int j =0;j<strNum;j++)
				{
					strList.add(subStr[i].substring(beginIndex,beginIndex+8));
					beginIndex=beginIndex+8;
				}
			}
		}
		//����ַ���
		for(int i=0;i<strList.size();i++)
			System.out.println(strList.get(i));

	}
	
}
