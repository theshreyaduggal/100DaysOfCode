class Solution {
    public int maxDepth(String s) 
    {
        char[] ch = s.toCharArray();
        int max = 0;
        int brackets = 0;

        for(int i=0; i<ch.length; i++) 
        {
            if(ch[i] == '(') 
            {
                brackets++;
            }
            else if(ch[i] == ')')
            {
                brackets--;
            }

            max = Math.max(max, brackets);
        }
        return max;    
    }
}