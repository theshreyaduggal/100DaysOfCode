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
    public int pairSum(ListNode head) 
    {
        List<Integer> list = new ArrayList<>();
        ListNode currNode = head;

        while (currNode != null) 
        {
            list.add(currNode.val);
            currNode = currNode.next;
        }

        List<Integer> list2 = new ArrayList<>();
        int start = 0;
        int end = list.size() - 1;

        while (start <= end) 
        {
            list2.add(list.get(start) + list.get(end));
            start++;
            end--;
        }

        int max = 0;
        
        for (int num : list2) 
        {
            if (num > max) 
            {
                max = num;
            }
        }

        return max;    
    }
}