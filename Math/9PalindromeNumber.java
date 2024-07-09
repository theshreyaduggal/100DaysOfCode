class Solution {
    public boolean isPalindrome(int x) 
    {
        int rev=0;
        int num = x;
		for(; num>0; num=num/10)
		{
			rev = (rev*10)+(num%10);
		}   
        if (x == rev)
        {
            return true;
        }
        return false;
    }
}