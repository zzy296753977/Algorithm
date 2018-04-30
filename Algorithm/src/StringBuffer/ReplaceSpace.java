package StringBuffer;

/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
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
	//这个方法不考虑replace的方法
	//不建议从前往后变换空格
	//从后往前寻找空格并且替换
	//因为setLength是直接在末尾增加大量空格，如果从后往前，遇见第一个空格可以直接让他顶后面满格，以此类推，每个字符实际只移动一次，只是移动长度比较大
	//如果从前往后，则每次都得移动字符，只不过移动距离短，但移动的频率太高，算法太复杂
	public String replaceSpace3(StringBuffer str)
	{
		//先计算所需要扩展的空间。空格字符编程%20多了两倍数量的空格字符
		int spaceNum=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				spaceNum++;
			}
		}
		//标识原字符串末尾坐标和新字符串末尾坐标
		int oldIndex = str.length()-1;
		str.setLength(str.length()+2*spaceNum);
		int newIndex = str.length()-1;
		//开始替换移动
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
