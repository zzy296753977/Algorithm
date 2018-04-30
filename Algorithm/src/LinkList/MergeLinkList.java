package LinkList;

//输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
public class MergeLinkList 
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
		//非递归方法
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
			//将两个链表穿起来
			ListNode current = null;
			ListNode mergeHead = null;
			//当两方都没有遍历完的时候
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
		//递归方法
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
