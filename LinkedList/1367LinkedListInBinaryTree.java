/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public boolean isSubPath(ListNode head, TreeNode root) 
    {
        return findPath(head, head, root);    
    }

    public boolean findPath(ListNode head, ListNode currNode, TreeNode root)
    {
        if (currNode == null)
        {
            return true;
        }
        if (root == null)
        {
            return false;
        }

        if (currNode.val == root.val)
        {
            currNode = currNode.next;
        }
        else if (head.val == root.val)
        {
            head = head.next;
        }
        else
        {
            currNode = head;
        }

        return findPath(head, currNode, root.left) || findPath(head, currNode, root.right);
    }
}