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
    public long kthLargestLevelSum(TreeNode root, int k) 
    {
        Queue<TreeNode>queue = new LinkedList<>();
        queue.add(root);
        
        ArrayList<Long> list = new ArrayList<>();

        while(!queue.isEmpty())
        {    
            List<Integer>list1 = new ArrayList<>();
            int count = queue.size();
            
            for(int i=0; i<count; i++)
            {
                TreeNode currNode = queue.poll();
                list1.add(currNode.val);

                if(currNode.left != null)
                {
                    queue.add(currNode.left);
                }

                if(currNode.right != null)
                {
                    queue.add(currNode.right);
                }   
            }
            
            long sum = 0;

            for(int i=0; i<list1.size(); i++)
            {
                sum = sum + list1.get(i);
            }

            list.add(sum); 
        }

        if(k > list.size()) 
        {
            return -1;
        }

        list.sort(null);

        return list.get(list.size()-k);  
    }
}