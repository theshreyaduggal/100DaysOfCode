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
    public ListNode deleteDuplicates(ListNode head) 
    {
        if (head == null || head.next == null)
		{
			return head;
		}
		ListNode prevNode = head;
		ListNode nextNode = head.next;

        while (nextNode != null) 
		{
			if (nextNode.val == prevNode.val)
			{
				prevNode.next = nextNode.next;
                nextNode = prevNode.next;
			}
			else
			{
				prevNode = nextNode;
                nextNode = nextNode.next;
			}
		}
		return head;    
    }
}