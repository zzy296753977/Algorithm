package LinkList;

//输入一个链表，反转链表后，输出链表的所有元素。
public class ReverseLinkList 
{
	//链表节点
		public class ListNode 
		{
		        int val;
		        ListNode next = null;
		        //有参构造函数
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
			//交换指针顺序
			temp= current.next;
			current.next=pre;
			pre = current;
			//如果current是结尾节点
			if(temp==null)
			{
				return current;
			}
			current = temp;
		}
		return current;
    }
}
