class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {
        String str1 = "";
        String str2 = "";
        for (int i=0; i<word1.length; i++)
        {
            str1 = str1 + word1[i];
        }    

        for (int k=0; k<word2.length; k++)
        {
            str2 = str2 + word2[k];
        }
        int count = 0;
        for (int j=0; j<str1.length() && j<str2.length(); j++)
        {
            if (str1.charAt(j) == str2.charAt(j))
            {
                count++;
            }
        }
        if (count == str1.length() && count == str2.length())
        {
            return true;
        }

        return false;
    }
}