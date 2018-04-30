package LinkList;

import java.util.ArrayList;
public class PrintListFromTail 
{
	ArrayList<Integer> list = new ArrayList<Integer>();
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
	 public ArrayList<Integer> printListFromTailToHead(ListNode listNode) 
	 {
		 if(listNode.next!=null)
		 {
			 this.printListFromTailToHead(listNode.next);
			 list.add(listNode.val);
		 }
		return list;
	        
	 }

}
