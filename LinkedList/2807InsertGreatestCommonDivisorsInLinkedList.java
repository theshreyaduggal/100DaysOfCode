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
    public ListNode insertGreatestCommonDivisors(ListNode head) 
    {
        ListNode currNode = head;
        ListNode prevNode = head;
        
        if(head == null || head.next == null)
        {
            return head;
        }
       
        while(currNode!=null && currNode.next!=null)
        {
            prevNode = currNode;
            
            if(currNode.next!=null)
            {
                currNode = currNode.next;
                int num1 = prevNode.val;
                int num2 = currNode.val;
        
                int gcd = GCD(num1, num2);
        
                ListNode newNode = new ListNode(gcd);
        
                prevNode.next = newNode;
                newNode.next = currNode;
            }
       }
       return head;

    }

    public int GCD(int num1, int num2)
    {
        int num = Math.min(num1, num2);

        for(int i=num; i>1; i--)
        {
            if(num1 % i==0 && num2 % i==0)
            {
                return i;
            }
        }
        return 1;    
    }
}