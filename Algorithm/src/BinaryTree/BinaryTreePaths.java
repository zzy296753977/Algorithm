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
	    
	    //判断每个路径是否有给定的和
	    public boolean hasPathSum(TreeNode root, int sum) {
	        List<Integer>result = new ArrayList<>();
		        if (root!=null)
		        {
		            path(root,0,result);
		        }
	        for (int i:result)
	        {
	            if (sum==i)
	                return true;
	        }
	        return false;
	    }
	    private void path(TreeNode root,int sum,List<Integer>result)
		    {
		        if(root.left==null&&root.right==null)
		        {
		            result.add(sum+root.val);
		            return;
		        }
		        if(root.left!=null)
		        {
		            path(root.left,sum+root.val,result);
		        }
		        if(root.right!=null)
		        {
		            path(root.right,sum+root.val,result);
		        }
		        return;
		    }
}
