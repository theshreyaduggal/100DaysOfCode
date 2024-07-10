class Solution {
    public int countConsistentStrings(String allowed, String[] words) 
    {
        int count = 0;
        char[] ch = allowed.toCharArray();
        
        for (int i=0; i<words.length; i++)
        {
            if (match(ch, words[i]))
            {
                count++;
            }
        }
        return count;
    }

    public boolean match(char[] ch, String str)
    {
        int count = 0;
        int len = str.length();
        for (int i=0; i<len; i++)
        {
            if (isThere(ch, str.charAt(i)))
            {
                count++;
            }
        }
        if (count == len)
        {
            return true;
        }
        return false;
    }

    public boolean isThere(char[] ch, char c)
    {
        for (int i=0; i<ch.length; i++)
        {
            if (c == ch[i])
            {
                return true;
            }
        }
        return false;
    }
}