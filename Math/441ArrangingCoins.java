class Solution {
    public int arrangeCoins(int n) 
    {
        int i=0;
        while (n > 0 && n > i)
        {
            i++;
            n = n - i;
        }
        return i;
    }
}