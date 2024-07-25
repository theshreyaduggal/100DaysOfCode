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
    public TreeNode constructMaximumBinaryTree(int[] nums) 
    { 
        return findNodes(0, nums.length-1, nums);   
    }

    public TreeNode findNodes(int start, int end, int[] nums) 
    {
        if (start > end) 
        {
            return null;
        }

        int max = findMax(nums, start, end);
        TreeNode root = new TreeNode(nums[max]);

        root.left = findNodes(start, max-1, nums);
        root.right = findNodes(max+1, end, nums);

        return root;
    }

    public int findMax(int[] nums, int start, int end) 
    {
        int maxNum = start;
        int max = nums[start];
        for (int i=start+1; i<=end; i++) 
        {
            if (nums[i] > max) 
            {
                max = nums[i];
                maxNum = i;
            }
        }
        return maxNum;
    }
}