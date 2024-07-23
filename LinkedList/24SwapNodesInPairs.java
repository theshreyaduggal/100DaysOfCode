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
    public ListNode swapPairs(ListNode head) 
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode newHead = null;
        ListNode prevNode = null;

        while(fast != null && fast.next != null)
        {
            ListNode temp = slow.next;
            fast = fast.next.next;
            slow.next = fast;
            temp.next = slow;
            if(prevNode != null)
            {
                prevNode.next = temp;
            }

            prevNode = slow;
            slow = fast;

            if(newHead == null)
            {
                newHead = temp;
            }
        }
        return newHead;      
    }
}