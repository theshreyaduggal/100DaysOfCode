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
    public ListNode rotateRight(ListNode head, int k) 
    {
        if (head == null || head.next == null || k == 0) 
        {
            return head;
        }

        int length = 1;
        ListNode currNode = head;

        while (currNode.next != null) 
        {
            currNode = currNode.next;
            length++;
        }

        currNode.next = head;
        k = k % length;
        k = length - k;

        while (k > 0) 
        {
            currNode = currNode.next;
            k--;
        }

        head = currNode.next;
        currNode.next = null;

        return head;    
    }
}