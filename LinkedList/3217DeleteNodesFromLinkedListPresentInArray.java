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
    public ListNode modifiedList(int[] nums, ListNode head) 
    {
        HashMap<Integer, Integer> map = new HashMap();

        for(int i=0; i<nums.length; i++) 
        {
            map.put(nums[i], 1);
        }

        while(map.containsKey(head.val))
        {
            head = head.next;
        }

        ListNode currNode = head;

        while(currNode.next != null) 
        {
            if(map.containsKey(currNode.next.val))
            {
                currNode.next = currNode.next.next;
            } 
            else 
            {
                currNode = currNode.next;
            }
        }
        return head;
 
    }
}