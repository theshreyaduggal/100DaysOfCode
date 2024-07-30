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
    public ListNode swapNodes(ListNode head, int k) 
    {
        if (head == null || head.next == null)
        {
            return head;
        }
        ListNode currNode = head;

        for(int i=1; i<k; i++)
        {
            currNode = currNode.next;
        }

        ListNode tempNode = currNode;
        ListNode lastNode = head;

        while(tempNode.next != null)
        {
            lastNode = lastNode.next;
            tempNode = tempNode.next;
        }

        int temp = currNode.val;
        currNode.val = lastNode.val;
        lastNode.val = temp;
        
        return head;    
    }
}