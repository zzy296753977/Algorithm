package String;

import java.util.HashMap;
import java.util.Map;
//Two strings are isomorphic if the characters in s can be replaced to get t.
public class IsomorphicStrings {
	//哈希表，保存s到t的映射，如果没有映射则添加映射，如果有映射，则看符不符合映射
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
                	//不同的key肯定不能有相同的value
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
