class Solution {
    public int[] dailyTemperatures(int[] temperatures) 
    {
        int[] ans=new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<temperatures.length; i++)
        {
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i])
            {
                int day = stack.pop();
                ans[day] = i - day;
            }
            stack.push(i);
        }
        
        return ans;   
    }
}