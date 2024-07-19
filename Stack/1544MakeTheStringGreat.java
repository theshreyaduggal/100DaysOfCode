class Solution {
    public String makeGood(String s) 
    {
        Stack<Character> stack = new Stack<>();
        for (int i=s.length()-1; i>=0; i--)
        {
            if (stack.isEmpty())
            {
                stack.push(s.charAt(i));
            }
            else
            {
                char ch1 = stack.peek();
                char ch2 = s.charAt(i);
                if (Character.isLowerCase(ch1))
                {
                    if (Character.isUpperCase(ch2) && ch1 == Character.toLowerCase(ch2))
                    {
                        stack.pop();
                    }
                    else
                    {
                        stack.push(s.charAt(i));
                    }
                }
                else if (Character.isUpperCase(ch1))
                {
                    if (Character.isLowerCase(ch2) && Character.toLowerCase(ch1) == ch2)
                    {
                        stack.pop();
                    }
                    else
                    {
                        stack.push(s.charAt(i));
                    }
                }
                else
                {
                    stack.push(s.charAt(i));
                }
            }
        } 
        String ans = "";
        while (!stack.isEmpty())
        {
            ans = ans + stack.pop();
        } 

        return ans;  
    }
}