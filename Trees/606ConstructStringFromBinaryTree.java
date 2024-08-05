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
    String str = "";

    public String tree2str(TreeNode root) 
    {
        if(root == null) 
        {
            return "";
        }

        str = str + Integer.toString(root.val);
     
        if(root.left != null)
        {
            str = str + "(";
            tree2str(root.left);
            str = str + ")";
        }
     
        if(root.right != null)
        {
            if(root.left == null) 
            {
                str = str + "()";
            }
         
            str = str + "(";
            tree2str(root.right);
            str = str + ")";    
        }

        return str;
    }
}