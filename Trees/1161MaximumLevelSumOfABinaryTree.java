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
    public int maxLevelSum(TreeNode root) 
    {
        if (root == null)
        {
            return 0;
        }

        int  maxSum = Integer.MIN_VALUE;
        int max = 1;
        int level = 1; 
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int size=queue.size();
            int sum=0;
                
            for (int i=0; i<size; i++)
            {
                TreeNode node = queue.remove();
                sum = sum + node.val;
                if(node.left!=null)
                {
                    queue.add(node.left);
                }
                if(node.right!=null)
                {
                    queue.add(node.right);
                }
            }
            if(sum > maxSum)
            {
                max = level;
                maxSum=sum;
            }
            level++;   
        }
        return max;    
    }
}