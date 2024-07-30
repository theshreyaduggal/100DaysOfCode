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
    public int[] nextLargerNodes(ListNode head) 
    {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        ListNode currNode = head;
        int count = 0;

        while(currNode != null)
        {
            count++;
            list.add(currNode.val);
            currNode = currNode.next;    
        }

        int[] answer = new int[count];

        for(int i=list.size()-1; i>=0; i--)
        {
            while(!stack.isEmpty() && stack.peek()<=list.get(i))
            {
                stack.pop();
            }

            if(stack.isEmpty())
            {
              answer[i] = 0;
            }
            else
            {
                answer[i] = stack.peek();
            }

            stack.push(list.get(i));
        }

        return answer;    
    }
}