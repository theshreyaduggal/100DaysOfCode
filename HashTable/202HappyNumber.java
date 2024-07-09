class Solution {
    public boolean isHappy(int n) 
    {  
        while(n != 1 && n !=4 )
        {
            int sum = 0;
            for (; n>0; n = n/10)
            {
                int rem = n % 10;
                sum = sum + (rem*rem);
            }
            n = sum;
        }
        if (n == 4)
        {
            return false;
        }
        return true;
    }
}