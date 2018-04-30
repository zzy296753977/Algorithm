package LinkList;
/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * @author Administrator
 *
 */
public class PrintSpecificNodeFromTail {
	public class ListNode {
		int val;
		ListNode next = null;

		// 有参构造函数
		ListNode(int val) {
			this.val = val;
		}
	}
	//先遍历整个链表获取长度，然后找到第n-k+1个位置，就是倒数第k个节点
	public ListNode FindKthToTail(ListNode head, int k) {
		int n = 0;
		ListNode p = head;
		while (p != null) {
			p = p.next;
			n++;
		}
		p = head;
		if ((n - k) >= 0) {
			for (int i = 1; i <= n - k; i++) {
				p = p.next;
			}

			return p;
		} else {
			return null;
		}

	}
	//初始化两个指针都指向head，先让一个指针走k步，然后两个指针一起走，后走的指针指向的就是倒数第k个节点
	public ListNode FindKthToTail2(ListNode head, int k)
	{
		int n =0;
		ListNode pre =head,last=head;
		for(int i =1;i<=k;i++)
		{
			if(pre!=null)
			{
				pre=pre.next;
				n++;
			}
		}
		if(n<k)
		{
			return null;
		}
		while(pre!=null)
		{
			pre=pre.next;
			last=last.next;
		}
		return last;
	}
	
}
