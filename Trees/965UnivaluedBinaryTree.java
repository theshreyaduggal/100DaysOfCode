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
    HashSet<Integer> set = new HashSet<>();

    public boolean isUnivalTree(TreeNode root) 
    {
        if (root == null) 
        {
            return true;
        }
        else 
        {
            isUnivalTree(root.left);
            set.add(root.val);
            isUnivalTree(root.right);
        }

        if (set.size() == 1)
        {
            return true;
        }
        else
        {
            return false;
        } 
    }
}