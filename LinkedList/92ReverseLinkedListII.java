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
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
        if (head == null || left == right) 
        {
            return head;
        }

        ListNode newNode = new ListNode(0);
        newNode.next = head;
        ListNode prevNode = newNode;

        for (int i = 0; i<left-1; i++) 
        {
            prevNode = prevNode.next;
        }

        ListNode currNode = prevNode.next;

        for (int i = 0; i<right-left; i++) 
        {
            ListNode temp = currNode.next;
            currNode.next = temp.next;
            temp.next = prevNode.next;
            prevNode.next = temp;
        }

        return newNode.next;          
    }
}