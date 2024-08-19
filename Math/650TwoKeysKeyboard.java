class Solution {
    public int minSteps(int n) 
    {
        if (n == 1) 
        {
            return 0;
        }
        
        int operations = 0;
        int num = 2;
        
        while (n > 1) 
        {
            while (n % num == 0) 
            {
               operations = operations + num;
                n = n / num;
            }
            num++;
        }
        
        return operations;
    
    }
}