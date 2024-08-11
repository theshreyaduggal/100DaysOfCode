class Solution {
    public int minDeletions(String s) 
    {
        int[] frequency = new int[26];

        for(char ch : s.toCharArray())
        {
            frequency[ch - 'a']++;
        }

        HashSet<Integer> set = new HashSet();
        int deletions = 0;

        for(int freq : frequency)
        {
            while (set.contains(freq))
            {
                freq--;
                deletions++;
            }

            if(freq != 0)
            {
                set.add(freq);
            }
        }
        return deletions;   
    }
}