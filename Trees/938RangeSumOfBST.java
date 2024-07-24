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


class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) 
    {
        if(root == null)
		{
			return 0;
		}

        int leftAns = 0;
        int rightAns = 0;
        
        if(root.val >= low && root.val <= high)
        {  
            leftAns = rangeSumBST(root.left, low, high);
            rightAns = rangeSumBST(root.right, low, high);
    	}
        else if(root.val < low) 
		{
        	leftAns = rangeSumBST(root.right, low, high);
        }
    	else if(root.val > high) 
		{
        	rightAns = rangeSumBST(root.left, low, high);
    	} 

        if (root.val >= low && root.val <= high)
        {
            return leftAns + rightAns + root.val;
        }

        return leftAns+rightAns;   
    }
}