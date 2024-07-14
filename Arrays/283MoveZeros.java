class Solution {
    public void moveZeroes(int[] nums) 
    {
        int temp=0;
		for (int i=0; i<nums.length; i++)
		{
			if (nums[i]!=0)
			{
				nums[temp]=nums[i];
				temp++;
			}
		}
		for (int j=temp; j<nums.length; j++)
		{
			nums[j]=0;
		}  
        for(int i=0; i<nums.length; i++)
		{
			System.out.println("Array: " + nums[i]);
		}  
    }
}