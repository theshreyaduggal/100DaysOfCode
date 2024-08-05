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
    public String smallestFromLeaf(TreeNode root) 
    {
        ArrayList<String> list = new ArrayList<>();

        smallestPath(root, list, "");
        Collections.sort(list);

        return list.get(0);    
    }

     public void smallestPath(TreeNode root, ArrayList<String> list, String str)
     {
        if(root == null)
        {
            return;
        }

        str = (char)(root.val+97) + str + "";

        if(root.left == null && root.right == null)
        {
            list.add(str);
            return;
        }

        smallestPath(root.left, list, str);
        smallestPath(root.right, list, str);
    }
}