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
    public ListNode reverseEvenLengthGroups(ListNode head) 
    {
        ListNode currNode = head;
        int num = 1;
    
        while(currNode != null)
        {
            int count = 0;
            ListNode newNode = currNode;
            Stack<Integer> stack = new Stack();
        
            while(count != num && currNode != null)
            {
                stack.push(currNode.val);
                currNode = currNode.next;
                count++;
            }
        
            if(count%2 == 0)
            {
                while(currNode != newNode)
                {
                    newNode.val = stack.pop();
                    newNode = newNode.next;  
                }
            }

            num++;
        }

        return head;    
    }
}