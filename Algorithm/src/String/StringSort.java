package String;

import java.util.Arrays;
import java.util.Scanner;
/**
 * ½«ÊäÈëµÄ×Ö·û´®°´×ÖµäÅÅĞò
 * @author Administrator
 *
 */
public class StringSort {
	public void function()
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String []str = new String[n];
		for(int i =0; i <str.length;i++)
		{
			str[i]=input.next();
			str[i].toLowerCase();
		}
		Arrays.sort(str);
		for(String value:str)System.out.println(value);
	}

}
