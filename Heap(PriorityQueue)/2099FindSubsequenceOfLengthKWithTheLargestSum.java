class Solution {
    public int[] maxSubsequence(int[] nums, int k) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>((i1, i2) -> nums[i1] - nums[i2]);
        int[] array = new int[nums.length];

        for (int i=0; i<k; i++) 
        {
            pq.add(i);
            array[i] = 1;
        }

        for (int i=k; i<nums.length; i++) 
        {
            int j = pq.peek();
            if (nums[j] < nums[i]) 
            {
                pq.remove();
                pq.add(i);
                array[j] = 0;
                array[i] = 1;
            }
        }

        int[] ans = new int[k];
        int j = 0;
        for (int i=0; i<array.length; i++) 
        {
            if (array[i] == 1)    
            {
                ans[j] = nums[i];
                j++;
            }
        }
        return ans;   
    }
}