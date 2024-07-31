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
    public ListNode doubleIt(ListNode head) 
    {
        int carry = solve(head);
        if(carry > 0) 
        {
            head = new ListNode(carry, head);
        }
        return head;
    }

    public int solve(ListNode head) 
    {
        if(head == null) 
        {
            return 0;
        }
        int num = head.val * 2 + solve(head.next);
        head.val = num % 10;
        int ans = num / 10;
        return ans;    
    }
}