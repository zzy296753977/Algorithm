package Array;
/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分
 * 所有的偶数位于位于数组的后半部分
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @author Administrator
 *
 */
public class OddEvenSort 
{
	public class Node
	{
		int value;
		Node next;
		Node(int a)
		{
			this.value=a;
			this.next=null;
		}
	}
	public void function(int []array)
	{
		//用两个链表分别记住奇数和偶数，然后合并奇数偶数链表
		int i=0,last;
		Node oddHead=new Node(0),evenHead=new Node(0);
		Node odd = oddHead,even = evenHead;
		while(i<array.length)
		{
			if(array[i]%2==1)
			{
				odd.next=new Node(array[i]);
				odd=odd.next;
			}
			else if(array[i]%2==0)
			{
				even.next=new Node(array[i]);
				even = even.next;
			}
			i++;
		}
		odd.next=evenHead.next;
		oddHead = oddHead.next;
		i=0;
		while(oddHead!=null)
		{
			array[i]=oddHead.value;
			oddHead=oddHead.next;
			i++;
		}
	}
}
