class Solution {
    public int[] numberGame(int[] nums) 
    {
        int[] arr = new int[nums.length];
        int k=0;
        Arrays.sort(nums);

        for(int i=0; i<=nums.length-2; i=i+2)
		{
			arr[k] = nums[i+1];
            arr[k+1] = nums[i];
            k = k+2; 
		}
		
        return arr;   
    }
}