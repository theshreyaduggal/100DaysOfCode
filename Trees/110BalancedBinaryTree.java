/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


class Solution 
{
    public int height(TreeNode root) 
	{
		if (root == null)
		{
			return 0;
		}
	
		int leftNodeHeight = height(root.left);
		int rightNodeHeight = height(root.right);

		if (leftNodeHeight == -1 || rightNodeHeight == -1)
		{
			return -1;
		}

		int heightTree = 1+ Math.max(leftNodeHeight, rightNodeHeight);

		if (Math.abs(leftNodeHeight - rightNodeHeight) <=1)
		{
			return heightTree;
		}
		return -1;
	}

    public boolean isBalanced(TreeNode root) 
    {
        if (root == null)
		{
			return true;
		}

		int ans = height(root);
	    if (ans >=0)
	    {
			return true;
	    }
	
		return false;    
    }
}