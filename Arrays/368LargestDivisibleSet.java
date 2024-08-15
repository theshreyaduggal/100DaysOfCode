class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) 
    {
        Arrays.sort(nums);
        int[] storage = new int[nums.length];
        Arrays.fill(storage, 1);

        int[] array = new int[nums.length];
        Arrays.fill(array, -1);

        int max = 0;

        for (int i=1; i<nums.length; i++) 
        {
            for (int j=0; j<i; j++) 
            {
                if (nums[i] % nums[j] == 0 && storage[i] < storage[j]+1) 
                {
                    storage[i] = storage[j]+1;
                    array[i] = j;

                    if (storage[i] > storage[max]) 
                    {
                        max = i;
                    }
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        while (max != -1) 
        {
            list.add(nums[max]);
            max = array[max];
        }

        Collections.reverse(list);
        return list;    
    }
}