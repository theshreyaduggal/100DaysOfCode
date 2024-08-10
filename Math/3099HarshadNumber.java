class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) 
    {
        int sum = 0;
        int num = x;
        for (; x>0; x=x/10)
        {
            int rem = x % 10;
            sum = sum + rem;
        }   
        if (num % sum == 0)
        {
            return sum;
        } 
        return -1;
    }
}