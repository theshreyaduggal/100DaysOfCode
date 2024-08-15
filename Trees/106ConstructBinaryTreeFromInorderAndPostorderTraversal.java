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
    int p = 0;
    int i = 0;

    public TreeNode buildTree(int[] inorder, int[] postorder) 
    {
        p = postorder.length-1;
        i = inorder.length-1;
        return buildTree(inorder, postorder, Integer.MAX_VALUE);
    }

    TreeNode buildTree(int[] inorder, int[] postorder, int num)
    {
        if(p == -1) 
        {
            return null;
        }
        if(inorder[i] == num)
        {
            i--;
            return null;
        }

        TreeNode root = new TreeNode(postorder[p--]);

        root.right = buildTree(inorder, postorder, root.val);
        root.left = buildTree(inorder, postorder, num);
        return root;    
    }
}