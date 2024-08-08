class Solution {
    public String removeOuterParentheses(String s) 
    {
        Stack<Character> stack = new Stack<>();
        String str = "";

        for(char ch : s.toCharArray())
        {
            if(ch == '(')
            {
                if(stack.size() > 0)
                {
                    str = str + ch;
                }

                stack.push(ch);
            }
            else
            {
                stack.pop();

                if(stack.size() > 0)
                {
                    str = str + ch;
                }
            }
        }
        return str;    
    }
}