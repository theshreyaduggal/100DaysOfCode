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
    TreeNode node = new TreeNode();
    TreeNode newNode = node;

    public TreeNode increasingBST(TreeNode root) 
    {
        createTree(root);
        return newNode.right;
    }

    void createTree(TreeNode root) 
    {
        if(root == null) 
        {
            return;
        }
        createTree(root.left);
        node.right = new TreeNode(root.val);

        node = node.right;
        createTree(root.right);
    }
}