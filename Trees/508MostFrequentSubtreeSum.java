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
    public int[] findFrequentTreeSum(TreeNode root) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = sumTree(root, map);
        int max = 0;
        int count = 0;

        for(Integer key : map.keySet())
        {
            max = Math.max(max, map.get(key));
        }
       
        for(int key : map.keySet())
        {
            if(max == map.get(key))
            {
                count++;
            }
        }

        int[] array = new int[count];
        int counter = 0;

        for(int key : map.keySet())
        {
            if(max == map.get(key))
            {
                array[counter] = key;
                counter++;
            }
        }
        
        return array;
    }

    public int sumTree(TreeNode root, HashMap<Integer,Integer> map)
    {
        if(root == null)
        {
            return 0;
        }

        int left = sumTree(root.left, map);
        int right = sumTree(root.right, map);

        map.put(left+right+root.val, map.getOrDefault(left+right+root.val,0)+1);
        
        return left+right+root.val;    
    }
}