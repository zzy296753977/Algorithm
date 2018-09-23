package String;

//Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//�����Ӵ��ͱ�ƥ����ַ������ҵ�����Ӵ���һ�γ��ֵ�λ��
public class ImplementIndexStr {
	// KMP
	public int strStr(String haystack, String needle) {
		 if (needle.equals("") || needle == null) {
				return 0;
			}
			if (needle.length() > haystack.length()) {
				return -1;
			}
			int matched = 0;
			for (int i = 0; i < haystack.length();) {
				
				for (int j = 0; i < haystack.length()&&j < needle.length(); j++) {
					if (haystack.charAt(i) == needle.charAt(j)) {
						i++;
						matched++;
	                    System.out.println(i+":"+matched+":"+needle.charAt(j));
					} else {
						i=i - matched + 1;
						matched = 0;
						break;
					}
				}
				if (matched == needle.length()) {
					return i - needle.length();
				}
			}
			return -1;


	}
}
