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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode head = null;
        ListNode tail = null;

        int carry = 0;
        
        while (l1 != null || l2 != null) 
        {
            int num1 = 0;
            int num2 = 0;
            
            if (l1 != null)
            {
                num1 = l1.val;
            }
            if (l2 != null)
            {
                num2 = l2.val;
            }

            int sum = num1 + num2 + carry;
            carry = sum / 10;
            int digit = sum % 10;

            ListNode newNode = new ListNode(digit);
            if (head == null) 
            {
                head = newNode;
                tail = newNode;
            }
            else 
            {
                tail.next = newNode;
                tail = newNode;
            }

            if (l1 != null) 
            {
                l1 = l1.next;
            }
            if (l2 != null) 
            {
                l2 = l2.next;
            }
        }

        if (carry > 0) 
        {
            tail.next = new ListNode(carry);
        }

        return head; 
    }
}