class Solution {
    public int kthGrammar(int n, int k) 
    {
        if (n == 1) 
        {
            return 0;
        }

        int num = kthGrammar(n - 1, (k + 1) / 2);

        if (k % 2 == 0) 
        {
            return 1 - num;
        } 
        else 
        {
            return num;
        }    
    }
}