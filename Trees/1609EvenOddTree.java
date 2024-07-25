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
    public boolean isEvenOddTree(TreeNode root) 
    {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode currNode = root;
        queue.add(currNode);

        boolean even = true;

        while(!queue.isEmpty()) 
        {
            int size = queue.size();

            int prev = Integer.MAX_VALUE;
            if(even) 
            {
                prev = Integer.MIN_VALUE;
            }

            while(size > 0) 
            {
                currNode = queue.remove();

            if ((even && (currNode.val % 2 == 0 || currNode.val <= prev)) || 
            (!even && (currNode.val % 2 == 1 || currNode.val >= prev))) 
            {
                return false;
            }

            prev = currNode.val;

            if(currNode.left != null) 
            {
                queue.add(currNode.left);
            }
            if(currNode.right != null) 
            {
                queue.add(currNode.right);
            }
            size--;
        }
        even = !even;
    }
    return true;    
    }
}