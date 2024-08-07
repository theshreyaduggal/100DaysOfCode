class Solution {
    public String simplifyPath(String path) 
    {
        String[] str = path.split("/");
        Stack<String> stack = new Stack<>();

        for(String s: str)
        {
            if(s.equals(".."))
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }
            else if(!s.equals(".") && !s.equals(""))
            {
                stack.push(s);
            }
        }

        String strs = "";

        for(String s : stack)
        {
            strs = strs + "/" + s;
        }

        if (strs.length() > 0)
        {
            return strs;
        }
        else
        {
            return "/";
        }  
    }
}