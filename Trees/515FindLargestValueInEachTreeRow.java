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
    public List<Integer> largestValues(TreeNode root) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null)
        {
            return list;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) 
        {
            int size = queue.size();

            int max = Integer.MIN_VALUE;

            while(size > 0) 
            {
                TreeNode node = queue.remove();
                max = Math.max(max, node.val);

                if(node.left != null) 
                {
                    queue.add(node.left);
                }
                if(node.right != null) 
                {
                    queue.add(node.right);
                }
                size--;
            }
            list.add(max);
        }
        return list;    
    }
}