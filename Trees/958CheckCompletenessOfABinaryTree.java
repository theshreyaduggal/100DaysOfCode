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
    public boolean isCompleteTree(TreeNode root) 
    {
        boolean check = false;
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);

        while(!queue.isEmpty())
        {
            TreeNode node = queue.remove();
            if(node == null)
            {
                check = true;
            }
            else
            {
                if(check)
                {
                    return false;
                }
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        return true;    
    }
}