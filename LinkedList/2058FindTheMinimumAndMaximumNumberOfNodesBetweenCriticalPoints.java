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
    public int[] nodesBetweenCriticalPoints(ListNode head) 
    {
        int index1 = -1;
        int index2 = -1;
        int distance = Integer.MAX_VALUE;
        int value = head.val;
        
        ListNode currNode = head.next;
        int currIndex = 1;

        while (currNode != null && currNode.next != null) 
        {
            if ((value < currNode.val && currNode.val > currNode.next.val) || (value > currNode.val && currNode.val < currNode.next.val)) 
            {
                if (index1 == -1) 
                {
                    index1 = currIndex;
                } 
                else 
                {
                    distance = Math.min(distance, currIndex - index2);
                }

                index2 = currIndex;
            }

            value = currNode.val;
            currNode = currNode.next;
            currIndex++;
        }
        
        if (index1 == -1 || index2 == index1) 
        {
            return new int[] {-1, -1};
        }
        
        return new int[] {distance, index2 - index1};
    }
}