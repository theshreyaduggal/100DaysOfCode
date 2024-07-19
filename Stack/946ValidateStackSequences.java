class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) 
    {
        int i=0; 
        int j=0;
        Stack<Integer> stack = new Stack<>();

        while (i<pushed.length && j<popped.length)
        {
            if (pushed[i]==popped[j])
            {
                i++;
                j++;

                if(!stack.isEmpty() && stack.peek() == popped[j])
                {
                    while(!stack.isEmpty() && j<popped.length && stack.peek() == popped[j])
                    {
                        stack.pop();
                        j++;
                    }
                }
            }
            else
            {
                stack.push(pushed[i]);
                i++;
            }
        }
        while(!stack.isEmpty() && j<popped.length)
        {
            if(stack.pop() != popped[j++])
            {
                return false;
            }
        }
        if(!stack.isEmpty() || j <popped.length)
        {
            return false;
        }
        
        return true;
    }
}