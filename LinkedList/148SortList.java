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


class Solution 
{
    public ListNode midOfList(ListNode head) 
    {
        if (head == null || head.next == null)
        {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode merge(ListNode list1, ListNode list2) 
    {
        ListNode temp = new ListNode(0);
        ListNode currNode = temp;

        while (list1 != null && list2 != null) 
        {
            if (list1.val < list2.val) 
            {
                currNode.next = list1;
                list1 = list1.next;
            } 
            else 
            {
                currNode.next = list2;
                list2 = list2.next;
            }
            currNode = currNode.next;
        }

        if (list1 != null)
        {
            currNode.next = list1;
        }
        else
        {
            currNode.next = list2;
        }

        return temp.next;
    }

    public ListNode sortList(ListNode head) 
    {
        if (head == null || head.next == null)
        {
            return head;
        }

        ListNode mid = midOfList(head);
        ListNode newHead = mid.next;
        mid.next = null;

        ListNode leftHalf = sortList(head);
        ListNode rightHalf = sortList(newHead);
        
        return merge(leftHalf, rightHalf);    
    }
}