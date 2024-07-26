class Solution {
    public int countWays(List<Integer> nums) 
    {
        nums.sort(null);
        int n = nums.size();
        int count = 0;
    
        if (nums.get(0) > 0) 
        {
            count++;
        }
        if (nums.get(n-1) < n) 
        {
            count++;
        }

        for (int i=0; i<n-1; i++) 
        {
            if (i+1 > nums.get(i) && i+1 < nums.get(i+1)) 
            {
                count++;
            }
        }
        return count;    
    }
}