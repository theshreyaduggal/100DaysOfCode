class Solution {
    public int subtractProductAndSum(int n) 
    {
        int prod = 1;
        int sum = 0;

        for (; n>0; n=n/10)
        {
            int rem = n%10;
            sum = sum + rem;
            prod = prod * rem;
        }  

        return prod-sum;  
    }
}