class Solution {
    public int lengthOfLIS(int[] nums) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) 
        {
            int number = binarySearch(list, num);

            if (number < list.size()) 
            {
                list.set(number, num);
            } 
            else 
            {
                list.add(num);
            }
        }
        return list.size();    
    }