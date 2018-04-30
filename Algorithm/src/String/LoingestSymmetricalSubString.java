package String;

import java.util.Scanner;

public class LoingestSymmetricalSubString 
{
	public void function()
	{
		//输入
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int len = str.length();
		int maxLen=0;
		//core是对称子串的中心。left是向左搜寻的起始，right是向右搜寻的起始
		int core ;
		int left ,right;
		//遍历寻找最大子串
		//奇数情况
		//控制中心点循环
		core=0;
		while(core!=len)
		{
			left=core-1;
			right=core+1;
			int currentLen=1;
			if(left>=0&&right<len&&str.charAt(left)!=str.charAt(right))
			{
				core++;
				continue;
			}
			while(left>=0&&right<len&&str.charAt(left)==str.charAt(right))
			{
				left--;
				right++;
				currentLen+=2;
			}
			core++;
			//这时候要么是两端到头了，要么是出现不对称的元素了
			if(currentLen>maxLen)
			{
				maxLen=currentLen;
			}
		}
		
			//偶数情况
			core=0;
			//控制中心点循环
			while(core!=len)
			{
				left=core;
				right=core+1;
				int currentLen=0;
				if(left>=0&&right<len&&str.charAt(left)!=str.charAt(right))
				{
					core++;
					continue;
				}
				while(left>=0&&right<len&&str.charAt(left)==str.charAt(right))
				{
					left--;
					right++;
					currentLen+=2;
				}
				core++;
				//这时候要么是两端到头了，要么是出现不对称的元素了
				if(currentLen>maxLen)
				{
					maxLen=currentLen;
				}
			}
		
		System.out.println(maxLen);
	}
}
