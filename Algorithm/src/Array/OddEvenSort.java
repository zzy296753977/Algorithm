package Array;
/**
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��
 * ʹ�����е�����λ�������ǰ�벿��
 * ���е�ż��λ��λ������ĺ�벿��
 * ����֤������������ż����ż��֮������λ�ò��䡣
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
		//����������ֱ��ס������ż����Ȼ��ϲ�����ż������
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
