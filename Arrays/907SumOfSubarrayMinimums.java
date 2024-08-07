class Solution {
    public int sumSubarrayMins(int[] arr) 
    {
        Stack<Integer> stack1 = new Stack<>(); 
        Stack<Integer> stack2 = new Stack<>(); 

        long[] left = new long[arr.length];
        long[] right = new long[arr.length];

        for (int i=0; i<arr.length; i++) 
        {
            int num = -1;
            while (!stack1.isEmpty() && arr[stack1.peek()] >= arr[i]) 
            {
                stack1.pop();
            }

            if (!stack1.isEmpty()) 
            {
                num = stack1.peek();
            }

            left[i] = i - num - 1;
            stack1.push(i);
        }

        for (int i = arr.length-1; i>= 0; i--) 
        {
            int num = arr.length;
            while (!stack2.isEmpty() && arr[stack2.peek()] > arr[i]) 
            {
                stack2.pop();
            }

            if (!stack2.isEmpty()) 
            {
                num = stack2.peek();
            }

            right[i] = num - i - 1;
            stack2.push(i);
        }

        long ans = 0;

        for (int i=0; i<arr.length; i++) 
        {
            ans = ans + (left[i] * right[i] + 1 + left[i] + right[i]) * arr[i];
        }

        return (int)(ans % 1_000_000_007);    
    }
}