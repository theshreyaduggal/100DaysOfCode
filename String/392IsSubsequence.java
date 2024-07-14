class Solution {
    public boolean isSubsequence(String s, String t) 
    {
        int indexS=0;
        for (int indexT=0; indexT<t.length(); indexT++)
        {
            if (indexS<s.length() && s.charAt(indexS) == t.charAt(indexT))
            {
                indexS++;
            }
        }
        if (indexS == s.length())
        {
            return true;
        } 

        return false;
    }
}