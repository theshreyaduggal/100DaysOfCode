class Solution {
    public int countEven(int num) 
    {
        int count = 0;
        for (int i=2; i<=num; i++)
        {
            int nums = i;
            int sum = 0;
            for (; nums>0; nums = nums/10)
            {
                int rem = nums % 10;
                sum = sum + rem;
            }
            if (sum % 2 == 0)
            {
                count++;
            }
        } 
        return count;   
    }
}