package StringBuffer;

/**
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 * @author Administrator
 *
 */
public class ReplaceSpace {
	public String replaceSpace(StringBuffer str) 
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				str.replace(i, i+1, "%20");
			}
		}
		return new String(str);
		
    }
	public String replaceSpace2(StringBuffer str) 
	{
		
		return str.toString().replaceAll("\\s", "%20");
		
    }
	//�������������replace�ķ���
	//�������ǰ����任�ո�
	//�Ӻ���ǰѰ�ҿո����滻
	//��ΪsetLength��ֱ����ĩβ���Ӵ����ո�����Ӻ���ǰ��������һ���ո����ֱ�����������������Դ����ƣ�ÿ���ַ�ʵ��ֻ�ƶ�һ�Σ�ֻ���ƶ����ȱȽϴ�
	//�����ǰ������ÿ�ζ����ƶ��ַ���ֻ�����ƶ�����̣����ƶ���Ƶ��̫�ߣ��㷨̫����
	public String replaceSpace3(StringBuffer str)
	{
		//�ȼ�������Ҫ��չ�Ŀռ䡣�ո��ַ����%20�������������Ŀո��ַ�
		int spaceNum=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				spaceNum++;
			}
		}
		//��ʶԭ�ַ���ĩβ��������ַ���ĩβ����
		int oldIndex = str.length()-1;
		str.setLength(str.length()+2*spaceNum);
		int newIndex = str.length()-1;
		//��ʼ�滻�ƶ�
		for(;oldIndex>=0&&oldIndex<newIndex;oldIndex--)
		{
			if(str.charAt(oldIndex)==' ')
			{
				str.setCharAt(newIndex--, '0');
				str.setCharAt(newIndex--, '2');
				str.setCharAt(newIndex--, '%');
			}
			else 
			{
				str.setCharAt(newIndex--, str.charAt(oldIndex));
			}
			
		}
		return str.toString();
		
	}

}
