package BinaryTree;

//根据前序遍历和中序遍历重建二叉树
//前序遍历：中左右
//中序遍历：左中右
//后序遍历：左右中
public class RebuildBinaryTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		return reConstructBinaryTree(pre, 0, pre.length-1, in, 0, in.length-1);
	}
	private TreeNode reConstructBinaryTree(int[] pre,int preStart,int preEnd, int[] in,int inStart,int inEnd)
	{
		//输入错误判断
		if(pre.length!=in.length)
		{
			System.out.println("Wrong input:the length of two sequences is different!");
			return null;
		}
		//递归结束条件
		//子树到达叶子节点了
		//start==end的时候是正好只剩下一个节点作为子树
		if(preStart>preEnd||inStart>inEnd)
		{
			return null;
		}
		//前序遍历的根节点在首元素
		TreeNode root = new TreeNode(pre[preStart]);
		//在中序遍历中找到根节点所在位置，然后分割左右子树进行递归
		for(int i=inStart;i<=inEnd;i++)
		{
			if(in[i]==pre[preStart])
			{
				root.left=reConstructBinaryTree(pre, preStart+1, preStart+i-inStart, in, inStart, i-1);
				root.right=reConstructBinaryTree(pre, preStart+i-inStart+1, preEnd, in, i+1, inEnd);
				break;
			}
			
		}
		return root;		
	}
}
