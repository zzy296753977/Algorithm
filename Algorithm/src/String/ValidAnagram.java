package String;
//Given two strings s and t , write a function to determine if t is an anagram of s.

public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		int [] array_s = new int [26];
        int [] array_t = new int [26];
        if (s.length()!=t.length())
            return false;
       else
       {
           for(int i=0;i<s.length();i++)
           {
               array_s[s.charAt(i)-'a']++;
               array_t[t.charAt(i)-'a']++;
           }
           for(int i=0;i<26;i++)
           {
               if (array_s[i]!=array_t[i])return false;
           }
           return true;
       }
    }
	
}
