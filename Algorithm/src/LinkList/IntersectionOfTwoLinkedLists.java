package LinkList;

import java.util.HashSet;

//Write a program to find the node at which the intersection of two singly linked lists begins.
public class IntersectionOfTwoLinkedLists {
	/**
	 * This method have one problem!
	 * If LinkListB has repeated elements,
	 * for example A is 1->2->3->4,B is 5->5->5,
	 * the code may return 5
	 * But expected for null
	 * @param headA
	 * @param headB
	 * @return
	 */	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		// No intersection
		if (headA == null || headB == null) {
			return null;
		}
		//Using HashSet because set don't permit repeated element
		HashSet<ListNode> set = new HashSet<>();
		while(headA!=null)
		{
			set.add(headA);
			headA=headA.next;
		}
		while(headB!=null)
		{
			if(set.contains(headB))
			{
				return headB;
			}
			set.add(headB);
			headB=headB.next;
		}
		return null;
	}
	/**
	 * Intersected point will at the same position in both lists
	 * So we calculate lenA and lenB first
	 * And then we make longer list pointer forward |lenA-lenB| 
	 * Finally two pointers traverse together 
	 * until find equal value return node 
	 * or none node return null 
	 * @param headA
	 * @param headB
	 * @return
	 */
	public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
	       if(headA==null||headB==null)return null;
	        int lenA = getLength(headA);
	        int lenB = getLength(headB);
	       if(lenA<lenB)
	       {
	           for(int i=0;i<lenB-lenA;i++)headB=headB.next;
	       }
	        else
	        {
	            for(int i=0;i<lenA-lenB;i++)headA=headA.next;
	        }
	        while(headA!=null&&headB!=null)
	        {
	            if(headA.val==headB.val)
	                return headA;
	            headA=headA.next;
	            headB=headB.next;
	        }
	        return null;
	    }
	    public int getLength(ListNode head)
	    {
	        int count=0;
	        while(head!=null)
	        {
	            count++;
	            head=head.next;
	        }
	        return count;
	    }
}
