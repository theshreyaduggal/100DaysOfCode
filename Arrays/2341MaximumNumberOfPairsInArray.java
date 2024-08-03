class Solution {
    public int[] numberOfPairs(int[] nums) 
    {
        Arrays.sort(nums);
        Stack<Integer> stack = new Stack<Integer>();
        int[] ans = new int[2];
        int pairs = 0;

        if (nums.length == 1)
        {
            ans[0] = 0;
            ans[1] = 1;
            return ans;
        }

        stack.push(nums[0]);
        for (int i=1; i<nums.length; i++)
        {
            if (!stack.isEmpty() && stack.peek() == nums[i])
            {
                stack.pop();
                pairs++;
            }
            else if (!stack.isEmpty() && stack.peek() != nums[i])
            {
                stack.push(nums[i]);
            }
            else
            {
                stack.push(nums[i]);
            }
        }
        ans[0] = pairs;
        ans[1] = stack.size();
        return ans;
    }
}