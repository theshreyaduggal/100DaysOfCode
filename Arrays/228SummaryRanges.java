class Solution {
    public List<String> summaryRanges(int[] nums) 
    {
        ArrayList<String> list = new ArrayList<>();
        if (nums.length == 0) 
        {
            return list;
        }

        int num = nums[0];
       
        for (int i=1; i<nums.length; i++) 
        {
            if (nums[i-1]+1 != nums[i])  
            {
                if (num == nums[i-1]) 
                {
                    list.add(Integer.toString(num)); 
                }
                else
                { 
                    list.add(num + "->" + nums[i-1]); 

                }

                num = nums[i];
            }
        }

        if (num != nums[nums.length-1]) 
        {
            list.add(num + "->" + nums[nums.length-1]);
        }
        else 
        {
            list.add(Integer.toString(num));
        }

        return list;
    }
}