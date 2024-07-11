class Solution {
    public boolean isValid(String s) 
    {
		Stack<Character> stack = new Stack<>();
		char[] array = s.toCharArray();
		for (int i=0; i<array.length; i++)
		{
			if (array[i] == '(')
			{
				stack.push(')');
			}
            else if (array[i] == '[')
            {
                stack.push(']');
            }
            else if (array[i] == '{')
            {
                stack.push('}');
            }
			
			else if (stack.isEmpty() || stack.pop() != array[i])
			{
				return false;
			}
		}
		return stack.isEmpty();    
    }
}