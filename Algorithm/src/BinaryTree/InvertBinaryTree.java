package BinaryTree;
//Invert a binary tree.
public class InvertBinaryTree {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        else
        {
            TreeNode temp = invertTree(root.left);
            root.left = invertTree(root.right);
            root.right = temp;
        }
        return root;
    }
}
