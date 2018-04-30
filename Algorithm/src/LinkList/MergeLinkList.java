package LinkList;

//���������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������
public class MergeLinkList 
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
		//�ǵݹ鷽��
		public ListNode Merge(ListNode list1,ListNode list2) 
		{
			if(list1==null)
			{
				return list2;
			}
			if(list2==null)
			{
				return list1;
			}
			//��������������
			ListNode current = null;
			ListNode mergeHead = null;
			//��������û�б������ʱ��
			while(list1!=null&&list2!=null)
			{
				if(list1.val<=list2.val)
				{
					if(mergeHead==null)
					{
						mergeHead=current=list1;
					}
					else{
					current.next=list1;
					current=current.next;
					}
					list1=list1.next;
				}
				else 
				{
					if(mergeHead==null)
					{
						mergeHead=current=list2;
					}
					else{
					current.next=list2;
					current=current.next;
					}
					list2=list2.next;
				}
			}
			if(list1==null)
			{
				current.next=list2;
			}
			else 
			{
				current.next=list1;
			}
			return mergeHead;
	    }
		//�ݹ鷽��
		public ListNode Merge2(ListNode list1,ListNode list2) 
		{
			if(list1==null)
			{
				return list2;
			}
			if(list2==null)
			{
				return list1;
			}
			if(list1.val<=list2.val)
			{
				 list1.next=Merge2(list1.next, list2);
				return list1;
			}
			else {
				 list2.next=Merge2(list1, list2.next);
				return list2;
			}
		}
}
