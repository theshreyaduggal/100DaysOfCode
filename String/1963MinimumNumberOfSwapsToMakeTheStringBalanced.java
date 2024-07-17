class Solution {
    public int minSwaps(String s) 
    {
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (char ch : s.toCharArray())
        {
            if (ch == '[')
            {
                stack.push(ch);
            }
            else
            {
                if (stack.isEmpty())
                {
                    count++;
                }
                else
                {
                    stack.pop();
                }
            }
        }   

        int ans = count/2;
        if (count % 2 != 0)
        {
            ans++;
        } 

        return ans;
    }
}