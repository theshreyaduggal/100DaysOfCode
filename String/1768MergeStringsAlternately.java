class Solution {
    public String mergeAlternately(String word1, String word2) 
    {
        String str = "";   
        char[] first = word1.toCharArray();
        char[] second = word2.toCharArray();
        
        int i=0;
        int j=0;
        
        while (i<word1.length() && j<word2.length())
        {
            str = str + first[i];
            str = str + second[j];
            i++;
            j++; 
        }
        while(i<word1.length())
        {
            str = str + first[i];
            i++;
        }
        while(j<word2.length())
        {
            str = str + second[j];
            j++;
        }
        return str;
    }
}