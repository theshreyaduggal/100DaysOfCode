class Solution {
    public int evalRPN(String[] tokens) 
    {
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<tokens.length; i++)
        {
            String token = tokens[i];
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) 
            {
                int num1 = stack.pop();
                int num2 = stack.pop();
                int number = 0;

                if (token.equals("+")) 
                {
                    number = num2 + num1;
                } 
                else if (token.equals("-")) 
                {
                    number = num2 - num1;
                } 
                else if (token.equals("*")) 
                {
                    number = num2 * num1;
                } 
                else if (token.equals("/")) 
                {
                    number = num2 / num1;
                }
                
                stack.push(number);
            } 
            else 
            {
                stack.push(Integer.valueOf(token)); 
            }
        }
        
        return stack.pop();
    }
}