package LinkList;

import java.util.Stack;

//Given a singly linked list, determine if it is a palindrome.
public class PalindromeLinkedList {
	 public boolean isPalindrome(ListNode head) 
	 {
		 Stack<ListNode> stack = new Stack<ListNode>();
		 ListNode current =head;
		 while(current!=null)
		 {
			 stack.push(current);
			 current=current.next;
		 }
		 while(head!=null)
		 {
			 if(head.val!=stack.pop().val)
				 return false;
			 head=head.next;
		 }
		 return true;
	 }
}
