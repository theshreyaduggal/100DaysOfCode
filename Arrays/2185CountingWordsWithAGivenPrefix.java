class Solution {
    public int prefixCount(String[] words, String pref) 
    {
        int len = pref.length();
        int count = 0;
        boolean check = true;
        for (int i=0; i<words.length; i++)
        {
            if (words[i].length() >= len)
            {
                for (int j=0; j<len ; j++)
                {
                    check = true;
                    if (words[i].charAt(j) != pref.charAt(j))
                    {
                        check = false;
                        break;
                    }
                }
            }
            else
            {
                check = false;
            }
            
            if (check == true)
            {
                count++;
            }
        }    
        return count;
    }
}