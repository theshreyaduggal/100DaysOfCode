class Solution {
    public boolean canBeValid(String s, String locked) 
    {
        if(s.length() % 2 != 0)
        {
            return false;
        }

        int openingBracket = 0;
        int openPossibleBalance = 0;

        for (int i=0; i<locked.length(); i++)
        {
            if(locked.charAt(i) == '1')
            {
                if(s.charAt(i) == ')')
                {
                    if(openPossibleBalance > 0)
                    {
                       openPossibleBalance--;
                    } 
                    else 
                    { 
                        return false;
                    } 
                    if(openingBracket > 0)
                    {
                        openingBracket--;
                    }
                }
                else 
                {
                    openPossibleBalance++;
                    openingBracket++;                    
                } 
            }
            else 
            {
                openPossibleBalance++;
                
                if(openingBracket > 0)
                {
                    openingBracket--;
                }
            }
        }
        
        if(openingBracket > 0)
        {
            return false;
        }
    
        return true;   
    }
}