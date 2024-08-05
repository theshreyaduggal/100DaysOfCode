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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        List<List<Integer>> list = new ArrayList<>();

        if (root == null) 
        {
            return list;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        boolean leftToRight = true;

        while (!queue.isEmpty()) 
        {
            int size = queue.size();

            ArrayList<Integer> list1 = new ArrayList<>(size);
            
            for (int i=0; i<size; i++) 
            {
                TreeNode currNode = queue.remove();
                
                if (leftToRight) 
                {
                    list1.add(currNode.val);
                }
                else 
                {
                    list1.add(0, currNode.val);
                }

                if (currNode.left != null) 
                {
                    queue.add(currNode.left);
                }
                if (currNode.right != null) 
                {
                    queue.add(currNode.right);
                }
            }

            list.add(list1);

            leftToRight = !leftToRight;
        }

        return list;
    }
}