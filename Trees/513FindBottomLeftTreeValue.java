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
    public int findBottomLeftValue(TreeNode root) 
    {
        if (root == null)
        {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int leftNode = 0;

        while (!queue.isEmpty()) 
        {
            int size = queue.size();
            leftNode = queue.peek().val;

            for (int i=0; i<size; i++) 
            {
                TreeNode node = queue.remove();
                if (node.left != null)
                {
                    queue.add(node.left);
                }
                if (node.right != null)
                {
                    queue.add(node.right);
                }
            }
        }
        return leftNode;   
    }
}