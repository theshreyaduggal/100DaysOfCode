class Solution {
    public int minimumPushes(String word) 
    {
        int count = 0;
        int[] freq = new int[26];

        for (int i=0; i<word.length(); i++)
        {
            freq[word.charAt(i)-'a']++;
        }
        
        Arrays.sort(freq);

        for (int i=25; i>=0 && freq[i] != 0; i--)
        {
            count = count + freq[i] * ((25 - i) / 8 + 1);
        }

        return count;    
    }
}