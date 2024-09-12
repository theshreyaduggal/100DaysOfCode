class Solution {
    public String removeDuplicateLetters(String s) 
    {
        Stack<Character> stack = new Stack<>();
        HashSet<Character> set = new HashSet<>();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i=0; i<s.length(); i++) 
        {
            map.put(s.charAt(i), i);
        }
        
        for (int i=0; i<s.length(); i++) 
        {
            char ch = s.charAt(i);

            if (!set.contains(ch)) 
            {
                while (!stack.isEmpty() && ch<stack.peek() && i<map.get(stack.peek())) 
                {
                    set.remove(stack.pop());
                }

                set.add(ch);
                stack.push(ch);
            }
        }
        
        String str = "";
        for (char ch : stack) 
        {
            str = str + ch;
        }

        return str;    
    }
}