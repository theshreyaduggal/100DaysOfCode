class Solution {
    public int bestClosingTime(String customers) 
    {
        int count = 0;
        int cleft = 0;

        for (int i=0; i<customers.length(); i++)
        {
            if (customers.charAt(i) == 'Y')
            {
                cleft++;
                
                if (cleft > 0)
                {
                    count = i+1;
                    cleft = 0;
                }
            }
            else
            {
                cleft--;
            }
        }    
        return count;
    }
}