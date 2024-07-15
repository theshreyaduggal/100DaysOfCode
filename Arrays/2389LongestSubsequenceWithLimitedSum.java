class Solution {
    public int[] answerQueries(int[] nums, int[] queries) 
    {
        Arrays.sort(nums);
        int[] array = new int[nums.length];
        array[0] = nums[0];

        for (int i=1; i<nums.length; i++)
        {
            array[i] = nums[i] + array[i-1]; 
        } 

        int[] ans = new int[queries.length];

        for (int i=0; i<queries.length; i++)
        {
            int count = 0;
            for (int j=0; j<array.length; j++)
            {
                if (array[j] <= queries[i])
                {
                    count++;
                }
                else
                {
                    break;
                } 
            }
            ans[i] = count;
        }   

        return ans;
    }
}