class Solution {
    public int fillCups(int[] amount) 
    {
        int maxCup = 0;
        int sum = 0;

        for(int i : amount) 
        {
            maxCup = Math.max(i, maxCup);
            sum = sum + i;
        }
        
        return Math.max(maxCup, (sum + 1) / 2);    
    }
}