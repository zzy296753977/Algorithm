package String;

import java.util.Scanner;
/**
 * ��һ��Ӣ������Ե���Ϊ��λ�����ŷš����硰I am a boy���������ŷź�Ϊ��boy a am I��
 * ���е���֮����һ���ո����������г���Ӣ����ĸ�⣬���ٰ��������ַ�
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
}