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
    public TreeNode bstFromPreorder(int[] preorder) 
    {
        TreeNode root = new TreeNode(preorder[0]);
        for(int i=1; i<preorder.length; i++)
        {
            root = preOrderBST(root, preorder[i]);
        }
        return root;
    }

    public TreeNode preOrderBST(TreeNode root, int val)
    {
        if(root==null)
        {
            TreeNode node = new TreeNode(val);
            return node;
        }
        else if(root.val>val)
        {
            root.left = preOrderBST(root.left, val);
        }
        else
        {
             root.right = preOrderBST(root.right, val);
        }
        return root;
    }
}