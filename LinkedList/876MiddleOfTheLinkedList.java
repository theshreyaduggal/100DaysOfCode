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


class Solution {
    public ListNode middleNode(ListNode head) 
    {
        if (head == null || head.next == null)
        {
            return head;
        } 
        int count = 0;
        ListNode fast = head;
        ListNode slow = head;
        ListNode currNode = head;

        while (currNode != null)
        {
            count++;
            currNode = currNode.next;
        }

        while (fast.next != null && fast.next.next !=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
          
        if (fast.next != null)
        {
            return slow.next;
        }
        else
        {
            return slow;
        }
    }
}