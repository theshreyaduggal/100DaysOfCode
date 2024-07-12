class Solution {
    public int minDeletionSize(String[] strs) 
    {
        int rows = strs.length;
        int cols = strs[0].length();  
        int count = 0;

        for(int i=0; i<cols; i++)
        {
            for (int j=1; j<rows; j++)
            {
                if (strs[j-1].charAt(i) > strs[j].charAt(i))
                {
                    count++;
                    break;
                }
            }
        }  
        return count;
    }
}