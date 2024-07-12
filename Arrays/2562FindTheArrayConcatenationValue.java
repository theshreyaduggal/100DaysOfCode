class Solution {
    public long findTheArrayConcVal(int[] nums) 
    {
        int start = 0;
        int end = nums.length-1;
        long sum = 0;

        while (start < end)
        {
            String str1 = Integer.toString(nums[start]);
            String str2 = Integer.toString(nums[end]);

            String str3 = str1 + str2;

            sum = sum + Integer.parseInt(str3);
            
            end--;
            start++;
        }    

        if (nums.length%2 != 0)
        {
            sum = sum + nums[start];
        }
        return sum;
    }
}