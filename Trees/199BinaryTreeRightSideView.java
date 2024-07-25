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
    public List<Integer> rightSideView(TreeNode root) 
    {
        ArrayList<Integer> list = new ArrayList<>();

        if (root == null) 
        {
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) 
        {
            int size = queue.size();
            ArrayList<Integer> list1 = new ArrayList<>();
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
                list1.add(node.val);
            }

            list.add(list1.get(list1.size() - 1));
        }

        return list;    
    }
}