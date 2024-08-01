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
    public ListNode mergeNodes(ListNode head) 
    {
        ListNode prevNode = head.next;
        ListNode currNode = head.next;
        int sum = 0;

        while (currNode != null)
        {
            int num = currNode.val;
            if (num != 0) 
            {
                sum = sum + num;
            }
            else
            {
                prevNode.val = sum;
                prevNode.next = currNode.next;
                prevNode = prevNode.next;
                sum = 0;
            }
            currNode = currNode.next;
        } 

        return head.next;    
    }
}