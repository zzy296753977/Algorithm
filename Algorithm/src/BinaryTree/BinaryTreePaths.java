package BinaryTree;

import java.util.ArrayList;
import java.util.List;
//获取二叉树所有路径
public class BinaryTreePaths {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	//将每个路径传下去，直到叶子节点加入list
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
