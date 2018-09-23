package String;

import java.util.HashSet;
import java.util.Set;

//返回一个字符串中连续不重复字母最大的子串的长度
public class lengthOfLongestSubstringUniqueCharacter {
	public int lengthOfLongestSubstring(String s) {
		int longestLength = 0;
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < s.length();) {
			if (set.contains(s.charAt(i))) {
				if (set.size() > longestLength) {
					longestLength = set.size();
				}
				i = i - set.size() + 1;
				set.clear();
			} else {
				set.add(s.charAt(i));
				i++;
			}
		}
		if (set.size() > longestLength) {
			longestLength = set.size();
		}
		return longestLength;
	}
}
