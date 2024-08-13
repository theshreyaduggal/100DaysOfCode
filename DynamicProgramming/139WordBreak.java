class Solution {
    public boolean wordBreak(String s, List<String> wordDict) 
    {
        boolean[] storage = new boolean[s.length() + 1];
        storage[0] = true;

        for (int i=1; i<=s.length(); i++) 
        {
            for (String word : wordDict) 
            {
                int start = i-word.length();

                if (start >= 0 && storage[start] && s.substring(start, i).equals(word)) 
                {
                    storage[i] = true;
                    break;
                }
            }
        }
        return storage[s.length()];    
    }
}