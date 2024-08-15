class Solution {
    public int longestStrChain(String[] words) 
    {
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;

        for (String word : words) 
        {
            map.put(word, 1);
            for (int i=0; i<word.length(); i++) 
            {
                String str = word.substring(0, i) + word.substring(i + 1);

                if (map.containsKey(str)) 
                {
                    map.put(word, Math.max(map.get(word), map.get(str)+1));
                }
            }
            max = Math.max(max, map.get(word));
        }
        return max;    
    }
}