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
    HashMap<Integer, Integer> map = new HashMap<>();
    int max = 0;

    public int[] findMode(TreeNode root) 
    {
        findingMode(root);

        ArrayList<Integer> list = new ArrayList<>();
        
        for(int key : map.keySet())
        {
            if(map.get(key) == max)
            {
                list.add(key);
            }
        }

        int array[] = new int[list.size()];
        for(int i=0; i<array.length; i++)
        {
            array[i] = list.get(i);
        }

        return array;   
    }

    public void findingMode(TreeNode root) 
    {
        if (root == null)
        {
            return;
        }

        if (map.containsKey(root.val))
        {
            map.put(root.val, map.get(root.val)+1);
        }
        else
        {
            map.put(root.val, 1);
        }

        max = Math.max(max, map.get(root.val));
        
        findingMode(root.left);
        findingMode(root.right);
    }  
}