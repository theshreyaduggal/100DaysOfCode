class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) 
    {
        int[] storage = new int[target+1];

        Arrays.fill(storage, -1);
        storage[0]=0;
        
        for(int i:nums)
        {
            for(int j=target; j>=i; j--)
            {
                if(storage[j-i] != -1)
                {
                    storage[j] = Math.max(storage[j-i]+1, storage[j]);
                }
                
            }
        }
        return storage[target];    
    }
}