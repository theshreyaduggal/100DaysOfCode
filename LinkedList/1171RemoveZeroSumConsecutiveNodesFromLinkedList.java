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
    public ListNode removeZeroSumSublists(ListNode head) 
    {
        ListNode newNode = new ListNode();
        newNode.next = head;
        ListNode prevNode = newNode;

        while(prevNode != null)
        {
            ListNode currNode = prevNode.next;
            int sum = 0;
            
            while(currNode != null)
            {
                sum = sum + currNode.val;
                if(sum == 0)
                {
                    prevNode.next = currNode.next;    
                }

                currNode = currNode.next;
            }
            prevNode = prevNode.next;
        }
        return newNode.next;    
    }
}