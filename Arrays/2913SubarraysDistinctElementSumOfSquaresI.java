class Solution {
    public int sumCounts(List<Integer> nums) 
    {
        int sum = 0;
        for (int i=0; i<nums.size(); i++)
        {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j=i; j<nums.size(); j++)
            {
                if (!list.contains(nums.get(j)))
                {
                    list.add(nums.get(j));
                }
                sum = sum + (list.size()*list.size());
            }
        }    
        return sum;
    }
}