package Stack;
/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * @author Administrator
 *
 */
public class MinStack {
    Node top;
    /** initialize your data structure here. */
    public MinStack() {
        Node top = null;
    }
    
    public void push(int x) {
        if (top == null)
        {
            top = new Node(x,x);
        }
        else
        {
            top = new Node(x,Math.min(top.min,x),top);
        }
    }
    
    public void pop() {
        top = top.next;
    }
    
    public int top() {
        return top.val;
    }
    
    public int getMin() {
        return top.min;
    }
    //用头结点记住栈的最小值，每次入栈进行比较，更新最小值即可
    private class Node {
        int val;
        int min;
        Node next;
        
        private Node(int val, int min) {
            this(val, min, null);
        }
        
        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}