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
    ArrayList<Integer> list = new ArrayList<>();

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) 
    {
        postOrder(root1);
        postOrder(root2);

        Collections.sort(list);
        return list;     
    }

    public void postOrder(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        
        list.add(root.val);
    }
}