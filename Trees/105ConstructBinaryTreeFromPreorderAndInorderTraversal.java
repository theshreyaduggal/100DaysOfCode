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
    int i = 0;
    int j = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder)
    {
        return build(preorder, inorder, Integer.MAX_VALUE);    
    }

    public TreeNode build(int[] preorder, int[] inorder, int end) 
    {
        if (i < inorder.length && inorder[i] != end) 
        {
            TreeNode root = new TreeNode(preorder[j++]);
            root.left = build(preorder, inorder, root.val);
            i++;
            root.right = build(preorder, inorder, end);
            return root;
        }
        return null;
    }
}