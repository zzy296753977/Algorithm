package BinaryTree;

import java.util.ArrayList;
import java.util.List;
//��ȡ����������·��
public class BinaryTreePaths {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	//��ÿ��·������ȥ��ֱ��Ҷ�ӽڵ����list
	 public List<String> binaryTreePaths(TreeNode root) {
	        List<String>result = new ArrayList<>();
	        if (root!=null)
	        {
	            path(root,"",result);
	        }
	        return result;
	    }
	    private void path(TreeNode root,String path,List<String>result)
	    {
	        if(root.left==null&&root.right==null)
	        {
	            path=path+root.val;
	            result.add(path);
	            return;
	        }
	        if(root.left!=null)
	        {
	            path(root.left,path+root.val+"->",result);
	        }
	        if(root.right!=null)
	        {
	            path(root.right,path+root.val+"->",result);
	        }
	        return;
	    }
}
