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
    public boolean isPalindrome(ListNode head) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode currNode = head;
        while(currNode != null)
        {
            list.add(currNode.val);
            currNode = currNode.next;
        }  
        int left = 0;
        int right = list.size()-1;

		while (left<right && list.get(left) == list.get(right))
		{
			left++;
			right--;
		}
		if (left>=right)
		{
			return true;
		}
		return false;  
    }
}