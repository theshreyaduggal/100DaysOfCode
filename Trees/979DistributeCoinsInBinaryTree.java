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
    int sum = 0;

    public int distributeCoins(TreeNode root) 
    {
        numberOfMoves(root);
        return sum;    
    }

    public int numberOfMoves(TreeNode root) 
    {
        if (root == null) 
        {
            return 0;
        }

        int left = numberOfMoves(root.left);
        int right = numberOfMoves(root.right);

        sum = sum + Math.abs(left) + Math.abs(right);

        return (root.val - 1) + left + right;
    }
}