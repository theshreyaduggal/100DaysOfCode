class Solution {
    public int divide(int dividend, int divisor) 
    {
        if (dividend == 0)
        {
            return 0;
        }
        int quotient = (int) dividend / divisor;
        if (dividend==Integer.MIN_VALUE && divisor == -1)
        {
            return Integer.MAX_VALUE;
        }
        return quotient;   
    }
}