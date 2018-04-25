package BinaryTree;
/**
 * 二叉树的节点
 * @author Administrator
 *
 */
public class Node 
{
	public int value;
	public Node leftChild;
	public Node rightChild;
	public Node(int value)
	{
		this.value=value;
		this.leftChild=null;
		this.rightChild=null;
	}
	public void display() {  
        System.out.print(this.value + "\t");  
    }  
}
