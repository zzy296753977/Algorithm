package String;

import java.util.HashMap;
import java.util.Map;
//Two strings are isomorphic if the characters in s can be replaced to get t.
public class IsomorphicStrings {
	//��ϣ������s��t��ӳ�䣬���û��ӳ�������ӳ�䣬�����ӳ�䣬�򿴷�������ӳ��
	public boolean isIsomorphic(String s, String t) {
        int len =s.length();
        Map<Character,Character> map = new HashMap<>();
        if(s.length()!=t.length())
        {
            return false;
        }
        else
        {
            for(int i=0;i<len;i++)
            {
                if (map.containsKey(s.charAt(i)))
                {
                	if(t.charAt(i)==map.get(s.charAt(i)))
                	{
                		continue;
                	}
                	else 
                	{
                		return false;
					}
                }
                else 
                {	
                	//��ͬ��key�϶���������ͬ��value
                	if(map.values().contains(t.charAt(i)))
                	{
                		return false;
                	}
                	else 
                	{
                		map.put(s.charAt(i),t.charAt(i));
					}
                	
				}
            }
        }
		return true;
    }
}
