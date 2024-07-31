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
    public int numComponents(ListNode head, int[] nums) 
    {
        ListNode currNode = head;
        ListNode prevNode = null;
        int count=0;
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i : nums)
        {
            set.add(i);
        }

        while(currNode != null)
        {

            if (prevNode == null && currNode != null)
            {
                if(set.contains(currNode.val))
                {
                    count++;
                }
            }
            else
            {
                if(!set.contains(prevNode.val) && set.contains(currNode.val))
                {
                    count++;
                }
            }

            prevNode = currNode;
            currNode = currNode.next;
        }

        return count;    
    }
}