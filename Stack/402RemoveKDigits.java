class Solution {
    public String removeKdigits(String num, int k) 
    {
        Stack<Character> stack=new Stack<>();

        for(char ch : num.toCharArray()) 
        {
            while( !stack.isEmpty() && k>0 && stack.peek() > ch  )
            {
                stack.pop();
                k--;
            }
            stack.push(ch);
        }

        while (k > 0 && !stack.isEmpty()) 
        {
            stack.pop();
            k--;
        }

        String str = "";

        for(char ch : stack) 
        {
            if(!(str.length()==0 && ch=='0')) 
            {
                str = str + ch;
            }
        }
        if (str.equals(""))
        {
            return "0";
        }
        else
        {
            return str;
        }
    }
}