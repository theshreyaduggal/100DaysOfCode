class Solution {
    public int countDigits(int num) 
    {
        int count = 0;
        int number = num;

        for (; num>0; num = num/10)
        {
            int rem = num % 10;
            
            if (number % rem == 0)
            {
                count++;
            }
        } 
        return count;   
    }
}