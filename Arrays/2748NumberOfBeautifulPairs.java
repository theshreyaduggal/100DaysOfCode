class Solution {
    public int countBeautifulPairs(int[] nums) 
    {
        int count = 0;
        for (int i=0; i<nums.length; i++)
        {
            int firstDig = nums[i];
            while(firstDig > 9)
            {
                firstDig = firstDig/10;
            }
            
            for (int j=i+1; j<nums.length; j++)
            {
                int lastDig = nums[j] % 10;
                if (gcd(firstDig, lastDig) == 1)
                {
                    count++;
                }
            }
        }
        return count;
    }    
    
    public int gcd(int num1, int num2)
    {
        int num=1;
		for(int i=1; i<=num1 && i<=num2; i++)
		{
			if (num1%i==0 && num2%i==0)
			{
				num=i;
			}
		}
		return num;
    }
}