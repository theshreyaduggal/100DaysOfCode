class Solution {
    public int balancedStringSplit(String s) 
    {
        int count = 0;
        int charCount = 0;
        for (int i=0; i<s.length(); i++)
        {
            if (s.charAt(i) == 'R')
            {
                charCount++;
            }
            else
            {
                charCount--;
            }

            if (charCount == 0)
            {
                count++;
            }
        }    
        return count;
    }
}