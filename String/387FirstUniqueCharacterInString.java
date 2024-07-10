class Solution {
    public int firstUniqChar(String s) 
    {
        boolean check = true;
        if (s.length()==1)
        {
            return 0;
        }

        for (int i=0; i<s.length(); i++)
        {
            for (int j=0; j<s.length(); j++)
            {
                check = true;
                if ( i!=j && s.charAt(i)==s.charAt(j))
                {
                    check = false;
                    break;
                }
            }
            if (check)
            {
                return i;
            }
        }    
        return -1;
    }
}