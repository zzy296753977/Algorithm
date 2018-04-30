package LinkList;
/**
 * ����һ����������������е�����k����㡣
 * @author Administrator
 *
 */
public class PrintSpecificNodeFromTail {
	public class ListNode {
		int val;
		ListNode next = null;

		// �вι��캯��
		ListNode(int val) {
			this.val = val;
		}
	}
	//�ȱ������������ȡ���ȣ�Ȼ���ҵ���n-k+1��λ�ã����ǵ�����k���ڵ�
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
	//��ʼ������ָ�붼ָ��head������һ��ָ����k����Ȼ������ָ��һ���ߣ����ߵ�ָ��ָ��ľ��ǵ�����k���ڵ�
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
