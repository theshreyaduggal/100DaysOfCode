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


class Solution 
{
    static ListNode reverse(ListNode head)
    {
        ListNode currNode = head;
        ListNode nextNode = null;
        ListNode prevNode = null;

        while(currNode != null)
        {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }

    public void reorderList(ListNode head) 
    {
        ListNode currNode = head;
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode left  = head;
        ListNode right = reverse(slow);

        ListNode nextLeft = null;
        ListNode nextRight = null;

        while(left != null && right != null)
        {
            nextLeft = left.next;
            left.next = right;
            nextRight = right.next;
            right.next = nextLeft;
            left = nextLeft;
            right = nextRight;
        } 
    }
}