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
    public ListNode partition(ListNode head, int x) 
    {
        ListNode start = new ListNode(0);
        ListNode end = new ListNode(0);

        ListNode startHead = start; 
        ListNode endHead = end;

        while(head != null)
        {
            if(head.val < x)
            {
                startHead.next = head;
                startHead = startHead.next;
            }
            else
            {
                endHead.next = head;
                endHead = endHead.next;
            }

            head = head.next;
        }

        endHead.next = null;
        startHead.next = end.next;

        return start.next;    
    }
}