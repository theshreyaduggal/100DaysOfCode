class Solution {
    public int maxSumMinProduct(int[] nums) 
    {
        int mod = (int) Math.pow (10, 9) + 7;

        Stack<Integer> stack = new Stack<>();
        
        long[] array = new long[nums.length + 1];
        long prod = 0;

        for (int i=0; i<nums.length; i++)
        {
            array[i + 1] = array[i] + nums[i];
        }

        for (int i=0; i<=nums.length; i++) 
        {
            while (!stack.isEmpty() && (i == nums.length || nums[stack.peek()] > nums[i])) 
            {
                int j = stack.pop();

                if (stack.isEmpty())
                {
                    prod = Math.max(prod, (array[i] - array[0])*nums[j]);
                }
                else
                {
                    prod = Math.max(prod, (array[i] - array[stack.peek() + 1]) * nums[j]);
                }
        }

        stack.push(i);
    }

    return (int) (prod % mod);
    
    }
}