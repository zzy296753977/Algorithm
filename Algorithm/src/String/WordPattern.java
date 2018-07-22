package String;

import java.util.HashMap;
import java.util.Map;
/**
 * Input: pattern = "abba", str = "dog cat cat dog"
 * Output: true
 * @author Administrator
 *
 */
public class WordPattern {
	//哈希表，思想同Isomorphic String
	public boolean wordPattern(String pattern, String str) {
        String[] sub = str.split("\\s+");
        if (pattern.length()!=sub.length)
        {
            return false;
        }
        else
        {
            Map<Character,String>map = new HashMap<>();
            for(int i=0;i<pattern.length();i++)
            {
                if(map.containsKey(pattern.charAt(i)))
                {
                    if(!map.get(pattern.charAt(i)).equals(sub[i]))
                    {
                        return false;
                    }
                }
                else
                {
                    if(map.values().contains(sub[i]))
                	{
                		return false;
                	}
                    else
                    {
                        map.put(pattern.charAt(i),sub[i]);
                    }
                }
            }
        }
        return true;
    }
}
