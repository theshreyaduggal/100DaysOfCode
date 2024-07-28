class Solution {
    public int totalMoney(int n) 
    {
        int sum=0;
        int count=0;
        for(int i=0; i<=n/7 && count!=n; i++)
        {
            for(int j=1;j <8 && count!=n; j++)
            {
                sum = sum + i + j;
                count++;
            }
        }
        return sum;    
    }
}