class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<nums.length; i++)
        {
            numbers.put(nums[i], 1);
        }    
        
        for (int j=1; j<=nums.length; j++)
        {
            if (!numbers.containsKey(j))
            {
                list.add(j);
            }
        }
        return list;
    }
}