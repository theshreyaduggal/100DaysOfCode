class Solution {
    public int longestCommonSubsequence(String text1, String text2) 
    {
        char[] ch1 = text1.toCharArray();
        char[] ch2 = text2.toCharArray();

        int len1 = ch1.length;
        int len2 = ch2.length;

        int[][] storage = new int[len1+1][len2+1];

        for (int i=0; i<len1; i++) 
        {
            for (int j=0; j<len2; j++) 
            {
                if (ch1[i] == ch2[j]) 
                {
                    storage[i+1][j+1] = storage[i][j]+1;
                }
                else 
                {
                    storage[i+1][j+1] = Math.max(storage[i+1][j], storage[i][j+1]);
                }
            }
        }

        return storage[len1][len2];
    }
}