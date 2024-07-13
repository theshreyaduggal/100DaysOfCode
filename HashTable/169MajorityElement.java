class Solution {
    public int majorityElement(int[] nums) 
    {
         HashMap<Integer,Integer> map = new HashMap<>();
        
        for (int i=0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i], map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        for (int j=0; j<nums.length; j++)
        {
            if (map.get(nums[j])>(nums.length/2))
            {
                return nums[j];
            }
        }
        return -1; 
    }
}