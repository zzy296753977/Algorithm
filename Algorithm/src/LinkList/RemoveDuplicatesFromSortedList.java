package LinkList;
//Given a sorted linked list, delete all duplicates such that each element appear only once.
public class RemoveDuplicatesFromSortedList {
	 public ListNode deleteDuplicates(ListNode head) {
	        if(head==null)return head;
	        ListNode current = head;
	        ListNode next = head.next;
	        while(next!=null)
	        {
	            if(next.val==current.val)
	            {
	                next=next.next;
	                current.next=next;
	            }
	            else
	            {
	                current=current.next;
	                next=next.next;
	            }
	        }
	        return head;
	    }
}
