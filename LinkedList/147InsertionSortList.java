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
    public ListNode insertionSortList(ListNode head) 
    {
        ListNode temp = new ListNode(0);
        ListNode currNode = head;

        while(currNode != null)
        {
            ListNode prevNode = temp;
            ListNode nextNode = currNode.next;

            while(prevNode.next != null && prevNode.next.val < currNode.val)
            {
                prevNode = prevNode.next;
            }

            currNode.next = prevNode.next;
            prevNode.next = currNode;
            currNode = nextNode;
        }

        return temp.next;    
    }
}