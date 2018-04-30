package LinkList;
//ɾ�������е��ڸ���ֵ val �����нڵ㡣
public class DeleteAllNodesByProvidedValue {
	
	 public ListNode removeElements(ListNode head, int val) {
		  	/**
		  	 * Judge head node first,compare last
		  	 * Current pointer is responsible for judging value
		  	 * We should depend on pre and current two pointers to finish the work
		  	 * If we compare the head node first,the head.next element will become new head node
		  	 * So we compare head node last
		  	 */		 		
	        if(head==null)return head;
	        ListNode pre = head;
	        ListNode current = head.next;
	        //Traverse all nodes except for head node 
	        while(current!=null)
	        {
	            if(current.val==val)
	            {
	                pre.next=current.next;
	                current=current.next;
	            }
	            else
	            {
	                pre=pre.next;
	                current=current.next;
	            }
	        }
	        if(head.val==val)
	        {
	            head=head.next;
	        }
	        return head;
	 }
}
