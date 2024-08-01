class Solution {
    public int minimumDeletions(String s) 
    {
        int count1 = 0;
        int count2 = 0;

        for (char ch : s.toCharArray()) 
        {
            if (ch == 'b') 
            {
                count1++;
            } 
            else if (count1 > 0) 
            {
                count2++;
                count1--;
            }
        }

        return count2;    
    }
}