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
    int sum = Integer.MAX_VALUE;
    TreeNode prevNode = null;

    public void inOrder(TreeNode root)
    {
        if (root == null)
        {
            return;
        }
            
        inOrder(root.left);

        if(prevNode != null)
        {
            sum = Math.min(sum, root.val-prevNode.val);
        }

        prevNode=root;
        inOrder(root.right);
    }

    public int minDiffInBST(TreeNode root) 
    {
        inOrder(root);
        return sum;
    }
}