class Solution {
    public boolean find132pattern(int[] nums) 
    {
        Stack<Integer> stack = new Stack<>();
        int num = Integer.MIN_VALUE;

        for (int i=nums.length-1; i>=0; i--)
        {
            if (nums[i] < num)
            {
                return true;
            }
            while (!stack.isEmpty() && nums[i] > stack.peek())
            {
                num = stack.pop();
            }
            stack.push(nums[i]);
        }    
        return false;
    }
}