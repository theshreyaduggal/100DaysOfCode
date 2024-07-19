class Solution {
    public String removeStars(String s) 
    {
        ArrayList<Character> list = new ArrayList<>();
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != '*')
            {
                stack.push(s.charAt(i));
            }
            else
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }
        }
        
        while(!stack.isEmpty())
        {
            list.add(stack.pop());
        }

        String str = "";
        for(int i = list.size()-1; i >= 0; i--)
        {
            str = str + list.get(i);
        }
        return str;  
    }
}