class Solution {
    public int addMinimum(String word) 
    {
        int letters = 0;

        for (int i=0; i<word.length(); )
        {
            int count=0;
            if(word.charAt(i) == 'a')
            {
                count++;
                i++;
            }
        
            if(i<word.length() && word.charAt(i) == 'b')
            {
                count++;
                i++;
            }
        
            if(i<word.length() && word.charAt(i) == 'c')
            {
                count++;
                i++;
            }
        
            letters = letters + (3-count);
        }

        return letters;    
    }
}