class Solution {
    public int minimumRightShifts(List<Integer> nums) 
    {
        int index = 0;
        int count = 0;
        
        for (int i=1; i<nums.size(); i++) 
        {
            if (nums.get(i-1) > nums.get(i)) 
            {
                index = i;
                count++;
            }
        }
        if (count > 1) 
        {
            return -1;
        }

        if (index == 0) 
        {
            return 0;
        }

        if (nums.get(nums.size()-1) > nums.get(0))
        {
            return -1;
        }
        else
        {
            return nums.size()-index; 
        } 
    }
}