package BinaryTree;

//����ǰ���������������ؽ�������
//ǰ�������������
//���������������
//���������������
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
		//��������ж�
		if(pre.length!=in.length)
		{
			System.out.println("Wrong input:the length of two sequences is different!");
			return null;
		}
		//�ݹ��������
		//��������Ҷ�ӽڵ���
		//start==end��ʱ��������ֻʣ��һ���ڵ���Ϊ����
		if(preStart>preEnd||inStart>inEnd)
		{
			return null;
		}
		//ǰ������ĸ��ڵ�����Ԫ��
		TreeNode root = new TreeNode(pre[preStart]);
		//������������ҵ����ڵ�����λ�ã�Ȼ��ָ������������еݹ�
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
