package String;

import java.util.Scanner;
/**
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 * @author Administrator
 *
 */
public class ConverseSentence {
	public void function()
	{
		Scanner input = new Scanner (System.in);
		String temp = input.nextLine();
		String [] sentence = temp.split("\\s+");
		for(int i=sentence.length-1;i>0;i--)
		{
			System.out.print(sentence[i]+" ");
		}
		System.out.println(sentence[0]);
	}
	//时间更短
	public String reverseString(String s) {
        char[] arr = new char[s.length()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.charAt(arr.length - 1 - i);
        }
        return new String(arr);
        
    }
   
}
