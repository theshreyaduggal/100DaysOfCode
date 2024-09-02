class Solution {
    public int chalkReplacer(int[] chalk, int k) 
    {
        long total = 0;

        for (int i : chalk) 
        {
            total = total + i;
        }

        int remainingChalk = (int)(k % total);
        
        for (int i=0; i<chalk.length; i++) 
        {
            if (remainingChalk < chalk[i]) 
            {
                return i;
            }

            remainingChalk = remainingChalk - chalk[i];
        }
        
        return 0;     
    }
}