class Solution {
    public String removeDuplicates(String s, int k) 
    {
        Stack<Character> stack1 = new Stack<>();  
        Stack<Integer> stack2 = new Stack<>();
        
        for(char ch : s.toCharArray())
        {
            if(stack1.size()>0 && stack1.peek()==ch) 
            {
                stack2.push(stack2.peek()+1);
            }
            else 
            {
                stack2.push(1);
            }
            
            stack1.push(ch);

            if(stack2.peek() == k)
            {
                for(int i=0; i<k; i++)
                {
                    stack1.pop();
                    stack2.pop();
                }
            }
        }
        
        String str = "";

        while(stack1.size()>0) 
        {
            str = str + stack1.pop();
        }

        String rev = "";
        char[] ch = str.toCharArray();

        for (int i=ch.length-1; i>=0; i--)
        {
            rev = rev + ch[i];
        }
        
        return rev;    
    }
}