package LinkList;
//Given a linked list, determine if it has a cycle in it.
public class LinkedListCycle {
	/**
	 * Define slow,fast two pointers
	 * Each step 
	 * Slow pointer forward one node
	 * Fast pointer forward two nodes 
	 * If the list is cycled they will meet and return true
	 * Else they will exit while cycle and return false
	 * @param head
	 * @return
	 */
	public boolean hasCycle(ListNode head) {
	        if(head==null||head.next==null)return false;
	        ListNode slow = head;
	        ListNode fast =head.next;
	        while(fast!=null&&fast.next!=null)
	        {
	            if(slow==fast)return true;
	            slow=slow.next;
	            fast=fast.next.next;
	        }
	        return false;
	    }
}
