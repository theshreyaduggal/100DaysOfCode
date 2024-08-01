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
    public ListNode[] splitListToParts(ListNode head, int k) 
    {
        ListNode[] nodes = new ListNode[k];

        int count = 0;
        ListNode currNode = head;
        while(currNode != null)
        {
            count++;
            currNode = currNode.next;
        }

        int rem = count % k;
        int div = count/k;

        ListNode newNode = head;

        for(int i=0; i<k; i++)
        {
            nodes[i] = newNode;

            if(newNode == null)
            {
                break;
            }

            int total = div;
            if(rem > 0)
            {
                total = total + 1;
                rem--;
            }

            for(int j=0; j<total-1; j++)
            {
                newNode = newNode.next;
            }
           
            ListNode nextNode = newNode.next;
            newNode.next=null;
            newNode = nextNode;
        }

        return nodes;    
    }
}