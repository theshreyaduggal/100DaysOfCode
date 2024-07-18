class Solution {
    public int findMaxLength(int[] nums) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int count = 0;

        for (int i=0; i<nums.length; i++)
        {
            if (nums[i] == 0)
            {
                count--;
            }
            else
            {
                count++;
            }

            if (map.containsKey(count))
            {
                sum = Math.max(sum, i-map.get(count));
            }
            else
            {
                map.put(count, i);
            }
        }
        return sum;
    }
}