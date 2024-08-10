class Solution {
    public boolean canPartition(int[] nums) 
    {
        int sum = Arrays.stream(nums).sum();

        System.out.println("SUM: " + sum);

        if (sum % 2 != 0) 
        {
            return false;
        }

        int half = sum / 2;

        boolean[] storage = new boolean[half + 1];
        storage[0] = true;

        for (int num : nums) 
        {
            for (int i=half; i>=num; i--) 
            {
                if (storage[i] || storage[i - num])
                {
                    storage[i] = true;
                }
            }
        }

        return storage[half];
    }
}