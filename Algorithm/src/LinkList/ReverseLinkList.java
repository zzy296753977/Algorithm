package LinkList;

//����һ��������ת�����������������Ԫ�ء�
public class ReverseLinkList 
{
	//����ڵ�
		public class ListNode 
		{
		        int val;
		        ListNode next = null;
		        //�вι��캯��
		        ListNode(int val) {
		            this.val = val;
		        }
		}
	public ListNode ReverseList(ListNode head) 
	{
		if(head == null)
		{
			return null;
		}
		ListNode current = head;
		ListNode temp = null;
		ListNode pre = null;
		while(current!=null)
		{
			//����ָ��˳��
			temp= current.next;
			current.next=pre;
			pre = current;
			//���current�ǽ�β�ڵ�
			if(temp==null)
			{
				return current;
			}
			current = temp;
		}
		return current;
    }
}
