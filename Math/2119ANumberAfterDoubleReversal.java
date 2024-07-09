class Solution {
    public boolean isSameAfterReversals(int num) 
    {
        if (num ==0)
        {
            return true;
        }
        int rev=0;
        int number = num;
		for(; num>0 ; num=num/10)
		{
            int rem = num%10;
            rev = (rev*10) + (rem); 
		} 
        int reverse = 0;
        for (; rev>0; rev=rev/10)
        {
            reverse = (reverse*10) + (rev%10);
        } 

        if (number == reverse)
        {
            return true;
        }
        return false;
    }
}