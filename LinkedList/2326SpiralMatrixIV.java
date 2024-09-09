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
    public int[][] spiralMatrix(int m, int n, ListNode head) 
    {
        int[][] array = new int[m][n];

        for(int i=0; i<m; i++) 
        {
            Arrays.fill(array[i],-1);
        }

        int startRow = 0;
        int endRow = m-1;
        int startCol = 0;
        int endCol = n-1;

        ListNode currNode = head;

        while(currNode != null)
        {
            for(int i=startCol; i<=endCol && currNode!=null; i++)
            {
                array[startRow][i] = currNode.val;
                currNode = currNode.next;
            }
            startRow++;

            for(int i=startRow; i<=endRow && currNode!=null; i++)
            {
                array[i][endCol] = currNode.val;
                currNode = currNode.next;
            }
            endCol--;

            for(int i=endCol; i>=startCol && currNode!=null; i--)
            {
                array[endRow][i] = currNode.val;
                currNode = currNode.next;
            }
            endRow--;

            for(int i=endRow; i>=startRow && currNode!=null; i--)
            {
                array[i][startCol] = currNode.val;
                currNode = currNode.next;
            }
            startCol++;
       }

       return array;
    }
}