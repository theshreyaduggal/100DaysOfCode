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
    TreeNode node1 = null;
    TreeNode node2 = null;
    TreeNode prev = null;

    public void recoverTree(TreeNode root) 
    {
        inorder(root);
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;
    }

    private void inorder(TreeNode root) 
    {
        if (root == null) 
        {
            return;
        }

        inorder(root.left);

        if (prev != null && prev.val > root.val) 
        {
            node1 = root;
            if (node2 != null) 
            {
                return;
            }

            node2 = prev;
        }

        prev = root;
        inorder(root.right);    
    }
}