class Solution {
    public boolean isLongPressedName(String name, String typed) 
    {
        if (typed.length() < name.length())
        {
            return false;
        }
        
        int j=0;
        for (int i=0; i<typed.length(); i++)
        {
            if (j<name.length() && name.charAt(j) == typed.charAt(i))
            {
                j++;
            }
            else if (i>0 && typed.charAt(i) == typed.charAt(i-1))
            {
                continue;
            }
            else
            {
                return false;
            }
        } 
        if (j == name.length())
        {
            return true;
        }   
        else
        {
            return false;
        }
    }
}